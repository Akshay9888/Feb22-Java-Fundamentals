package greekstermarchassignment2023;
import java.util.*;
public class assignmentswapingnumber {

	    public static void main(String a[])   
	    {   
	        System.out.println("Enter the value of s and j");  
	        Scanner sc = new Scanner(System.in);  
	        /*Define variables*/  
	        int s = sc.nextInt();  
	        int j = sc.nextInt();  
	        System.out.println("before swapping numbers: "+a +" "+ j);  
	       /*Swapping*/  
	        s = s + j;   
	        j = s - j;   
	        s = s - j;   
	        System.out.println("After swapping: "+a +"  " + j);   
	    }   
	}  