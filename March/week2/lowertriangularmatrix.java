package march7to102022assignmnetgreekster;

public class lowertriangularmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
			    int rows, cols;    
			      
			        int a[][] = {       
			                        {2, 5, 9},    
			                        {3, 7, 4},    
			                        {4, 8, 5}    
			                    };    
			          
			          rows = a.length;    
			          cols = a[0].length;    
			            
			          if(rows != cols){    
			              System.out.println("Matrix should be a square matrix");    
			          }    
			          else {    
			               
			              System.out.println("Lower triangular matrix: ");    
			              for(int i = 0; i < rows; i++){    
			                  for(int j = 0; j < cols; j++){    
			                    if(j > i)    
			                      System.out.print("  ");    
			                    else    
			                      System.out.print(a[i][j] + " ");    
			                }    
			                System.out.println();    
			            }    
			        }    
			    }    
			}    