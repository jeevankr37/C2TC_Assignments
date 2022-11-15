package array;

public class Array2d {

	public static void main(String[] args) {
		int a[]= {4,2,3,4};
		int b[]= {2,3,5,8};
		int c[]= {2,3,6,9};
		
		int d[][]= { //this is an two dimensional array
				{4,2,3,4},  //if number of columns are not fixed is called jagged array;
				{2,3,5,8},
				{2,3,6,9}
		};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
			
		}
		
	}

}
