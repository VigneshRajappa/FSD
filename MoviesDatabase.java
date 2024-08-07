import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MoviesDatabase {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/movie";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            try (Statement statement = connection.createStatement()) {
                // Drop the MOVIES table if it exists (MySQL does not support "DROP TABLE IF EXISTS")
                statement.executeUpdate("DROP TABLE IF EXISTS MOVIES");

                // Create the MOVIES table
                String createTableSQL = "CREATE TABLE MOVIES (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY, " +
                        "title VARCHAR(255), " +
                        "genre VARCHAR(255), " +
                        "yearOfRelease INT" +
                        ")";
                statement.executeUpdate(createTableSQL);
            }

            // Insert records into the MOVIES table
            String insertSQL = "INSERT INTO MOVIES (title, genre, yearOfRelease) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                preparedStatement.setString(1, "The Shawshank Redemption");
                preparedStatement.setString(2, "Drama");
                preparedStatement.setInt(3, 1994);
                preparedStatement.executeUpdate();

                preparedStatement.setString(1, "The Godfather");
                preparedStatement.setString(2, "Crime");
                preparedStatement.setInt(3, 1972);
                preparedStatement.executeUpdate();

                preparedStatement.setString(1, "The Dark Knight");
                preparedStatement.setString(2, "Action");
                preparedStatement.setInt(3, 2008);
                preparedStatement.executeUpdate();
            }

            // Update a selected record
            String updateSQL = "UPDATE MOVIES SET genre = ? WHERE title = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
                preparedStatement.setString(1, "Action, Crime");
                preparedStatement.setString(2, "The Dark Knight");
                preparedStatement.executeUpdate();
            }

            // Delete a selected record
            String deleteSQL = "DELETE FROM MOVIES WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
                preparedStatement.setInt(1, 2); // Assuming the id of "The Godfather" is 2
                preparedStatement.executeUpdate();
            }

            // Display all remaining records
            String selectSQL = "SELECT * FROM MOVIES";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectSQL)) {

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String title = resultSet.getString("title");
                    String genre = resultSet.getString("genre");
                    int yearOfRelease = resultSet.getInt("yearOfRelease");

                    System.out.println("ID: " + id + ", Title: " + title + ", Genre: " + genre + ", Year of Release: " + yearOfRelease);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}