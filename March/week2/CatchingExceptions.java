package march7to102022assignmnetgreekster;

public class CatchingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
	            System.out.println("Inside try block");
	  
	            // Throw an Arithmetic exception
	            System.out.println(34 / 0);
	        }
	  
	        // Can not accept Arithmetic type exception
	        // Only accept Null Pointer type Exception
	        catch (NullPointerException e) {
	  
	            System.out.println(
	                "catch : exception not handled.");
	        }
	  
	        // Always execute
	        finally {
	  
	            System.out.println(
	                "finally : i will execute always.");
	        }
	        // This will not execute
	        System.out.println("i want to run");
	    }
	}