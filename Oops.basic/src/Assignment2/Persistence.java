package Assignment2;


	public abstract class Persistence {
	    abstract void persist();
	}

	class filePersistence extends Persistence{
	    void persist() {
	        System.out.println("file persists");
	    }
	}

	class databasePersistence extends Persistence{
	    void persist(){
	        System.out.println("database persists");
	    }
	}


