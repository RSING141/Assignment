import java.util.Scanner;

public class DivededbyZero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the numerator and denominator : ");
			int n=s.nextInt();
			int d=s.nextInt();
			double r=divide(n,d);
			System.out.println("The quotient is "+r);
		}
		catch(ArithmeticException e) {
			System.out.printf("cant divide br zero");
		}
	}

	public static double divide(int n,int d) {
		return n/d;
	}
}


