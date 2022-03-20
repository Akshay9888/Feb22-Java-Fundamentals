package greekstermarchassignment2023;

public class assignmentreversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7891, reversed = 0;
	    
	    System.out.println("Original Number: " + num);

	    
	    while(num != 0) {
	    
	      
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	    	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }
	}