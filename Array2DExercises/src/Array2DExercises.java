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
		for (int i = 0; i < a.length; i++) {

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

	public static boolean isJaggedArray(int[][] arr) {
		
		boolean isJagged = false;

		if (arr != null) {
			Integer lastLength = null;
			for (int i = 0; i < arr.length; i++) {
				if (lastLength == null) {
					lastLength = arr[i].length;
				} else if (lastLength.equals(arr[i].length)) {
					continue;
				} else {
					isJagged = true;
					break;
				}
			}
		}
		return isJagged;
	}

	// return true if array is square (n x n)
	// just find if the boxes make a square or not
	public static boolean isSquareArray(int[][] arr) {
		 boolean isSquare = false;

	        if (arr != null) {
	            for (int i = 0; i < arr.length; i++) {
	                if (arr[i].length != arr.length) {
	                    break;
	                } else if (i != arr.length - 1) {
	                    continue;
	                } else {
	                    isSquare = true;
	                }
	            }
	        }

	        return isSquare;
	    }


	// return true if array is rectangular (n x m)
	// find if it makes a square or not
	public static boolean isRectangularArray(int[][] arr) {
		 boolean isSquare = true;

	        if (arr != null) {
	            for (int i = 0; i < arr.length; i++) {
	                if (arr[i].length != arr.length) {
	                    break;
	                } else if (i != arr.length - 1) {
	                    continue;
	                } else {
	                    isSquare = false;
	                }
	            }
	        }

	        return isSquare;
	    }
}

