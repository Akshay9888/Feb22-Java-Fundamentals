package march7to102022assignmnetgreekster;

public class sparsematrix {

	public static void main(String[] args) {	
		int i, j, total = 0;
		
		int[][] sp_arr = {{0, 9, 0}, {0, 1, 0}, {5, 4, 9}, {3, 0, 0}};
			
		for(i = 0; i < 4 ; i++) {
			for(j = 0; j < 3; j++){
				if(sp_arr[i][j] == 0) {
					total++;
				}
			}
		}	
		if(total > ((4 * 3)/2)) {
			System.out.println("\nMatrix is a Sparse Matrix");
		}
		else {
			System.out.println("\nMatrix is Not a Sparse Matrix");
		}
	}
}