import java.util.Scanner;
class ar2{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		//int n=20;
		int parking[]=new int[20];
		while(true){
		System.out.println("Enter 0 to park and 1 to exit");
		int a=sc.nextInt();
		if(a==0){
			System.out.println("Enter your vehicle Number : ");
			int veh=sc.nextInt();
			while(true){			
				System.out.println("Enter Parking Slot : ");
				int park=sc.nextInt();
				if(parking[park-1]==0){
					parking[park-1]=veh;
					System.out.println("Vehicle Parked");
					break;
				}
			}			
		}else{
			System.out.println("Enter your vehicle Number : ");
			int veh=sc.nextInt();
			boolean exit=true;
			for(int i=0;i<20;i++){
				if(parking[i]==veh){
					parking[i]=0;
					exit=false;
					System.out.println("Vehicle exit");
					break;
				}
			}
			if(exit){
				System.out.println("Vehicle Not Found");
			}			
		}
		}
		
	}
}