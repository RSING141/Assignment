
public class Bank_s {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 savings_ac cust1=new savings_ac(101,20000);
	        System.out.println("Your account created succesfully with your ID "+cust1.getID()+" and your current balance is "+cust1.getBalance());
	        cust1.Deposite(5000);
	        System.out.println(cust1.getBalance());
	}

}

class savings_ac{
    long id;
    double balance;

    public savings_ac(long id,double balance){
        this.id=id;
        this.balance=balance;
    }
    public void Deposite(double deposite) {
        balance=balance+deposite;
    }
    public long getID(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(int Withdrawl_amount) throws InsufficientBalanceException, illeagalBankTransactionException{
        if(Withdrawl_amount>balance || balance==0){
            throw new InsufficientBalanceException("Exception");
        }
        else if(Withdrawl_amount<0){
            throw new illeagalBankTransactionException("Exception");
        }
        balance=balance-Withdrawl_amount;
        System.out.println("You've received "+ (int)(Withdrawl_amount)+" in cash:" );
    }

}
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String exception){
        super(exception);
    }
}
class illeagalBankTransactionException extends Exception{
    illeagalBankTransactionException(String exception2){
        super(exception2);
    }
} 


