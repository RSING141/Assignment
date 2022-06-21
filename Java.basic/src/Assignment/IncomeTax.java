package Assignment;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		double it,tax=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your CTC:");
		
		double CTC=sc.nextDouble();
		
		if(CTC<=180000)
			tax=0;
		else if(CTC<=300000)
			tax=(CTC*0.1);
		else if(CTC<=500000)
			tax=(CTC*0.2);
		else
			tax=(CTC*0.3);
		
		System.out.println("CTC tax amount is "+tax);
	}

}
