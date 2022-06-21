package Assignment2;

public class Singletone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	    ex object=ex.return_obj();
	    }
	}

	class ex{
	    static ex obj= new ex();
	    private ex(){

	    }
	    public static ex return_obj(){
	        return obj;
	}


}
