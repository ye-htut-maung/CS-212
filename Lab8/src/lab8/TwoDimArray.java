package lab8;
import java.util.*;
public class TwoDimArray {

//	public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static StringTokenizer myTokens;
	public static String[][] numbers;
	
	public static void main(String[] args) {
		printArray(fillArray(args[0]));
//		printArray(fillArray("twodimension8.txt"));
		//printArrayEven(myArray);
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
	
	private static int[][] fillArray (String myFile) {
		TextFileInput in = new TextFileInput(myFile);
		String line = in.readLine();
		myTokens = new StringTokenizer(line, ",");
		
		int row = Integer.parseInt(myTokens.nextToken());
		
		int col = Integer.parseInt(myTokens.nextToken());

		int[][] array = new int [row][col];
		
		for (int r=0; r<array.length; r++) {
			line = in.readLine();
			myTokens = new StringTokenizer(line, ","); // need to ask
			for (int c=0; c<array[r].length; c++) {		
				array[r][c] = Integer.parseInt(myTokens.nextToken());
			}
		}
//				array[r][c] = Integer.parseInt(in.readLine());
		
		return array;
	}
	
	
}





