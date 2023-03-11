package lab7;
public class TwoDimArray_sol {

	// public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	public static int[][] myArray;

	public static void main(String[] args) {
		String fileName = args[0];

		myArray = fillArray(fileName);

		printArray(myArray);
		printArrayEven(myArray);

	}

	private static void printArray(int[][] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			for (int j = 0; j < theArray[i].length; j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}

	private static void display(int num) {
		if (num < 10)
			System.out.print(num + "  ");
		else
			System.out.print(num + " ");

	}

	private static void printArrayEven(int[][] theArray) {
		for (int r = 0; r < theArray.length; r++) {
			for (int c = 0; c < theArray[r].length; c++) {
				if (theArray[r][c] % 2 != 0) {
					System.out.print("*  ");
				} else
					display(theArray[r][c]);

			}
			System.out.println();
		}
	}

	public static int[][] fillArray(String myFile) {
		TextFileInput tfi = new TextFileInput(myFile);
		int row = Integer.parseInt(tfi.readLine());
		int column = Integer.parseInt(tfi.readLine());
		int[][] myArray = new int[row][column];
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {

				myArray[r][c] = Integer.parseInt(tfi.readLine());

			}
		}
		return myArray;

	}

}
