package Assignment2;
public class Mainpersistence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Persistence obj= new Persistence() {
	            @Override
	            void persist() {
	                System.out.println("calling it");
	            }
	        };
	        obj.persist();
	    }
	}
	




