package Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class LoginPassword {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			 HashMap<String,Integer>user=new HashMap<String,Integer>();
			 Scanner s=new Scanner(System.in);
			 user.put("Rishi",63018);
			 user.put("ravi",950245);
			 System.out.println("Enter your username");
			 String username=s.next();
			 int count=0;
			 for(int i=0;i<5;i++) {
				 if(count==3) {
					 System.out.println("contact Admin");
					 break;
				 }
				 if(user.containsKey(username)) {
					 System.out.println("Enter your password");
					 int p=s.nextInt();
					 if(user.get(username)==p) {
						 System.out.println("welcome :"+username);
						 break;
					 }
					 else {
						 count++;
						 System.out.println("Wrong password");
					 }
					 
					 }
				 
			 }
		}
}
		
	
