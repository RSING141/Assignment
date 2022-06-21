package Assignment;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter Subject1 marks:");
		 int subject1=sc.nextInt();
		 
		 System.out.println("Enter Subject2 marks:");
		 int subject2=sc.nextInt();
		 
		 System.out.println("Enter Subject3 marks:");
		 int subject3=sc.nextInt();
		 
		 if(subject1>60&&subject2>60&&subject3>60) {
			 System.out.println("You are Passes!");
			 
		 }
		 else if((subject1>60&&subject2>60&&subject3<60)||(subject1>60&&subject3>60&&subject2>60)||(subject2>60&&subject3>60&&subject1<60)){
			 
			 System.out.println("You are promoted");
		 }
		 else {
			 
			 System.out.println(" you are failed");
		 }
	}

}

