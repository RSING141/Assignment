package Assignment2;


	abstract class Employee {
		abstract public void salary();  
		}
		class manager extends Employee{
		    int sal,incentive;
		    public manager(int sal,int incentive){
		        this.sal=sal;
		        this.incentive=incentive;
		    }
		    public void salary(){
		        System.out.println("Manager Salary:"+(sal+incentive));
		    }
		    public int get(){
		        return sal+incentive;
		    }
		}
		class labour extends Employee{
		    int overtime;
		    int labour_salary;

		    public labour(int labour_salary,int overtime){
		        this.labour_salary=labour_salary;
		        this.overtime=overtime;
		    }
		    public void salary(){
		        System.out.println("Labour Salary:"+(labour_salary+overtime));
		    }
		    public int get(){
		        return labour_salary+overtime;
		    }
		}


