public class Array2DExercises {

	// return the total of all the values in the array.
	public static int getTotal(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

	// return the average of all the values in the array.
	public static double getAverage(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum = (a[i][j]) / (a[i].length);
			}
		}
		return sum;
	}

	// return the total of the values in the specified row.
	public static int getRowTotal(int[][] a, int row) {
		return -1;
	}

	// return the total of the values in the specified column.
	public static int getColumnTotal(int[][] a, int column) {
		return -1;
	}

	// return the highest value in the specified row of the array.
	public static int getHighestInRow(int[][] a, int row) {
		return -1;
	}

	// return the lowest value in the specified row of the array.
	public static int getLowestInRow(int[][] a, int row) {
		return -1;
	}

	// return the lowest value in the specified column of the array
	public static int getHighestInColumn(int[][] a, int column) {
		return -1;
	}

	// return the highest value in the specified column of the array
	public static int getLowestInColumn(int[][] a, int column) {
		return -1;
	}

	// return the diagonal sum, bottom left to top right
	public static int getBottomLeftToTopRightDiagonalSum(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			
		}
		return -1;
	}

	// return the diagonal sum, top left to bottom right
	public static int getTopLeftToBottomRightDiagonalSum(int[][] a) {
		return -1;
	}

	// return true if the array is sorted low to high
	public static boolean isArraySorted(int[][] a) {
		return false;
	}

	// return true if array is sorted high to low
	public static boolean isArrayReversed(int[][] a) {
		return false;
	}

	// return true if array is jagged
	
	public static boolean isJaggedArray(int[][] a) {
		for(int i = 0; i < a.length; i++) {
	        System.out.print("\n" + i + ": ");
	        for(int j = 0; j < a[i].length; j++) {
	                System.out.print(j + ",");
	        }
	}
		return false;
	}

	// return true if array is square (n x n)
	//just find if the boxes make a square or not
	public static boolean isSquareArray(int[][] a) {
		 
		int product = 0;
		for (int m = 0; m < a.length; m++){
			for (int n = 0; n < a[n].length; n++) {
				product *= a[n][m];
			}
		}
		return false;
	}

	// return true if array is rectangular (n x m)
	//find if it makes a square or not
	public static boolean isRectangularArray(int[][] arr) {

		int product = 0;
		for (int m = 0; m < arr.length; m++) {
			for (int n = 0; n < arr[n].length; n++) {
				product *= arr[n][m];
			}

			return false;
		}
		return false;
	}
}
