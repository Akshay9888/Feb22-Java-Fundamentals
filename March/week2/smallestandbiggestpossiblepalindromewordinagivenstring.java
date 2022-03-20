package march7to102022assignmnetgreekster;

public class smallestandbiggestpossiblepalindromewordinagivenstring {

public static void main(String[] args) {
		
		int[][] matrix1 ={ {10,12},{10,12} };
		int[][] matrix2 ={ {10,12},{10,12} };
		addMatrices(matrix1, matrix2);
		
	}
	public static int[][] addMatrices(int[][] matrix1 , int[][] matrix2){
		int m=2 ;
		int n =2;
		int sum[][] = new int[m][n];
		for (int c = 0 ; c < m ; c++ ){
	        for (int d = 0 ; d < n ; d++ ){
	           sum[c][d] = matrix1[c][d] + matrix2[c][d];
	        }
		}
		 for ( int  c = 0 ; c < m ; c++ )
	      {
	         for ( int d = 0 ; d < n ; d++ )
	            System.out.print(sum[c][d]+" ");//System.out.print(sum[c][d]+"\t");
	 
	         System.out.println();
	      }
		return sum;
		
	}
}	