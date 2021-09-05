import java.util.Scanner;

public class testApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int x=0;
	    wheatherStates ob=new wheatherStates();
		
		
		
		while(x==0) {
			
			System.out.println("Press a to Insert Data");
			System.out.println("Press b to Sort the temperature values to Accending order");
			System.out.println("Press c to Sort the temperature values to Descending order");
			System.out.println("Press d to see the report");
			System.out.println("Press any key to terminate the program");
			System.out.println("*******************************************************************************************");
			
			
			String y=sc.next();
			
			switch(y) {
			
			
			case "a":
				
				ob.insertD();
				break;
				
			case "b":
			    ob.sortAccend();
				break;
				
			case "c":
			    ob.sortDecend();
				break;
				
			case "d":
				ob.showReport();
				break;
				
			default:
				x=2;
				
			}
		}
		sc.close();
		
		
		
		
	}

}
