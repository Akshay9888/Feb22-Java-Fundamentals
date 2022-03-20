package greekstermarchassignment2023;

import java.util.*;

public class assignmentfibonacinumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        int k1 = 0, k2 = 1;
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();   //Declare and Initialize the number of terms
        System.out.println("First " + n + " terms of fibonnaci series: ");
        //Print the fibonacci series
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(k1 + " ");
            int sum = k1 + k2;
            k1 = k2;
            k2 = sum;
        }
    }
}