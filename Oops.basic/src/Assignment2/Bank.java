package Assignment2;
	
	public abstract class Bank {
		 abstract public void disp();
		}
		class savings_Account extends Bank{
		    double bal;
		    double fd;
		    public savings_Account(double bal,double fd){
		        this.bal=bal;
		        this.fd=fd;
		    }
		    public void disp(){
		        System.out.println("Total money in saving:"+(bal+fd));
		    }
		    public double get(){
		        return bal+fd;
		    }
		}
		class current_Account extends Bank{
		    double bal;
		    double cc;
		    public current_Account(double bal,double cc){
		        this.bal=bal;
		        this.cc=cc;
		    }
		    public void disp(){
		        System.out.println("Total money in current: "+(bal+cc));
		    }
		    public double get(){
		        return bal+cc;
		    }
		}
