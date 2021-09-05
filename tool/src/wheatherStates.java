import java.util.Scanner;

public class wheatherStates {
	
	int[] temp;
	String[] name;
	int entries=0;
	Scanner sc=new Scanner(System.in);

	
	
	public void insertD() {
		
		System.out.println("*******************************************************************************************");
		
		System.out.println("Enter the number of entries");
		entries=sc.nextInt();
		
		temp=new int[entries];
		name=new String[entries];
		
		

			for(int x=0;x<temp.length;x++) {
			
			System.out.println("enter City :");
			name[x]=sc.next();
			System.out.println("enter temperature :");
		    temp[x]=sc.nextInt();
		}
	
	}
	
	public void sortAccend() {
		for(int x=0;x<temp.length-1;x++) {
			for(int y=0;y<temp.length-1;y++) {
				
				if(temp[y]>temp[y+1]) {
					int Tvalue=temp[y];
					String Nvalue=name[y];
					
					temp[y]=temp[y+1];
					name[y]=name[y+1];
					
					temp[y+1]=Tvalue;
					name[y+1]=Nvalue;
				}
			}
		}
		System.out.println("*******************************************************************************************");
		System.out.println("*******************************************************************************************");
	
		
		for(int z=0;z<temp.length;z++) {
			System.out.println("City :"+name[z]+"   "+"Temperature :"+temp[z]);
		
		}
		System.out.println("*******************************************************************************************");
		System.out.println("*******************************************************************************************");
	
		
	}
	
	public void sortDecend() {
		
		for(int x=0;x<temp.length-1;x++) {
			for(int y=0;y<temp.length-1;y++) {
				
				if(temp[y]<temp[y+1]) {
					int Tvalue=temp[y];           
					String Nvalue=name[y];
					
					temp[y]=temp[y+1];
					name[y]=name[y+1];
					
					temp[y+1]=Tvalue;
					name[y+1]=Nvalue;
				}
			}
		}
		
		
		System.out.println("*******************************************************************************************");
		System.out.println("*******************************************************************************************");
		
		for(int z=0;z<temp.length;z++) {
			System.out.println("City :"+name[z]+"   "+"Temperature :"+temp[z]);
		
		
		
	}
		System.out.println("*******************************************************************************************");
		System.out.println("*******************************************************************************************");

	
	
	}
	
	public void showReport() {
		int average;
		int tot=0;
		
		for(int x=0;x<temp.length-1;x++) {
			for(int y=0;y<temp.length-1;y++) {
				
				if(temp[y]>temp[y+1]) {
					int Tvalue=temp[y];
					String Nvalue=name[y];
					
					temp[y]=temp[y+1];
					name[y]=name[y+1];
					
					temp[y+1]=Tvalue;
					name[y+1]=Nvalue;
				}
			}
		}
		for(int z=0;z<temp.length;z++) {
			tot=tot+temp[z];
			
		}
		average=tot/temp.length;
		
		
		System.out.println("*******************************************************************************************");
		System.out.println("*******************************************************************************************");
		
		System.out.println("Lowest Temperature value is "+" "+temp[0]+" at "+name[0]);
		System.out.println("Highest Temperature value is"+" "+temp[temp.length-1]+" at "+name[temp.length-1]);
		System.out.println("Average Temperature value is"+" "+average);
		
		System.out.println("*******************************************************************************************");
		System.out.println("*******************************************************************************************");
		
		
		
		
		
		
		
	}
	
	
		
		
	
	

}
