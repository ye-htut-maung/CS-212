package lab7;
public class TwoDimArray {

//	public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) {
		int myArray[][] = fillArray("twodimesion.txt");
		printArray(myArray);
		printArrayEven(myArray);
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	private static void display (int num){
		if (num < 10) {
			System.out.print(" "+ num);
			System.out.print(" ");
 		} else 
 		{
 			System.out.print(num+" ");
 		}
	}
	private static void printArrayEven(int[][] theArray){
		for(int i=0; i < theArray.length; i++) {
			for (int j=0; j < theArray[i].length; j++) {
				if (theArray[i][j] % 2 != 0) {
					System.out.print(" " + "*" + " ");
				}else {
					display(theArray[i][j]);
				}
			}
			System.out.println();
		}
	}
	public static int[][] fillArray(String myFile) {
		 TextFileInput in = new TextFileInput(myFile);
		 int row = Integer.parseInt(in.readLine());
		 int col = Integer.parseInt(in.readLine());
		 
		 int[][] arr = new int[row][col];
		 for (int i = 0; i < row; i++) {
			 for (int j = 0; j < col; j++) {
				 arr[i][j] = Integer.parseInt(in.readLine());
			 }
		 }
		 return arr; 
	}
}
