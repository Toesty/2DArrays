public class Array2DExercises {
//<<<<<<< HEAD
//	
//		// return the total of all the values in the array.
//		public static int getTotal(int[][] a) {
//			 int sum = 0;
//		        for(int i = 0; i < a.length; i++) {
//		                for(int j = 0; j < a[i].length; j++) {
//		                        sum += a[i][j];
//		                }
//		        }
//		        return sum;
//		}
//		
		// return the average of all the values in the array.
		public static double getAverage(int[][] a) {
			double sum = 0;
		    double numOfAssign = 0;
		    double average = 0;
			for(int i = 0; i < a.length; i++){
			    for(int j = 1; j < a[i].length-1; j++){
			       numOfAssign++;
			       sum = sum + a[i][j];
			     }
			    average = sum / numOfAssign;
			
			}
			return average;
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
//=======

	// return the total of all the values in the array.
	public static int getTotal(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}

<<<<<<< HEAD
		}
		return sum;
	}


=======
	// return the average of all the values in the array.
		public static double getAverage(int[][] x, int rowCount, int colCount)
		{
		    int total = 0; 
		    for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
		    {
		         for (int colIndex = 0; colIndex < colCount; colIndex++)
		         {
		             total += x[rowIndex][colIndex];   
		         }
		    }     
		    double average = (total/(colCount*rowCount));
		    System.out.println("The average is "+ average);
		    return average; 
		 }

	// return the total of the values in the specified row.
		public static int getRowTotal(int[][] x, int rowCount, int colCount)
		{
		    int rowTotal = 0; 
		    int rowIndex = 0;
		    for (rowIndex = 0; rowIndex < rowCount; rowIndex++)
		    {
		        for (int colIndex = 0; colIndex < colCount; colIndex++)
		        {
		            rowTotal += x [rowIndex][colIndex];      
		        }
		        System.out.println("The total for row " + (rowIndex+1) + " is " + rowTotal);
		        rowTotal = 0;
		    }   
		    return rowTotal;
		    }

	// return the total of the values in the specified column.
		public static int getColumnTotal(int[][] x, int rowCount, int colCount)
		{
		    int columnTotal = 0; 
		    int rowIndex = 0;
		    int colIndex = 0;
		    for (colIndex = 0; colIndex < colCount; colIndex++)
		    {
		        for (rowIndex = 0; rowIndex < rowCount; rowIndex++)
		        {             
		            columnTotal += x [rowIndex][colIndex];          
		        }
		        System.out.println("The total for column " + (colIndex+1) + " is " + columnTotal);
		        columnTotal = 0;
		    }   
		    return columnTotal; 
		 }

	// return the highest value in the specified row of the array.
		public static int getHighestInRow (int[][] a, int rowCount, int colCount)
		 {
		     int highestInRow = a[0][0];

		     for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
		     {
		       for (int colIndex = 0; colIndex < colCount; colIndex++)
		       {
		       if (a[rowIndex][colIndex]>highestInRow)
		             highestInRow=a[rowIndex][colIndex];
		       }
		     System.out.println(highestInRow + " is the highest number in row " + (rowIndex+1) + ".");
		     highestInRow = 0;
		     }
		     return highestInRow;
		 }

	// return the lowest value in the specified row of the array.
		public static int getLowestInRow (int[][] a, int rowCount, int colCount)
		{
		     int lowestInRow = a[0][0];

		     for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
		     {
		         lowestInRow = a[rowIndex][0];
		       for (int colIndex = 0; colIndex < colCount; colIndex++)
		       {
		       if (a[rowIndex][colIndex]<lowestInRow)
		             lowestInRow=a[rowIndex][colIndex];
		       }
		     System.out.println(lowestInRow + " is the lowest number in row " + (rowIndex+1) + ".");       

		     }
		    return lowestInRow;

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
>>>>>>> 0319743b18d1f68f45ab4eb7f378bc0d1d698ff4

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

