package Assignment2;

public class Clint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		manager m=new manager(500,100);
        labour l=new labour(150,40);
        m.salary();
        l.salary();
        int totalSalary=m.get()+l.get();
        System.out.println("Total Salary of all employees: "+totalSalary);
	}

}


