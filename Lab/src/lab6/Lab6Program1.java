package lab6;

//public class Lab5Program {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TextFileInput in = new TextFileInput("lab5input.txt");
//		String line = in.readLine();
//		
//		while (line != null) {
//			System.out.println(line);
//			line = in.readLine();
//		}
//	}
//
//}

import javax.swing.*;
import java.util.ArrayList;

public class Lab6Program1 {
	public static void main(String[] args) {
		
		String filename = args[0];
		
		
		ArrayList<Integer> numberArray = new ArrayList<Integer>();
		
		inputFromFile(numberArray, filename);
		
		int total_sum = sum(numberArray);
		JOptionPane.showMessageDialog(null,  "Sum: " + total_sum);
		System.out.println(total_sum);
		
		int average_ans = average(numberArray);
		JOptionPane.showMessageDialog(null,  "Average: " + average_ans);
		System.out.println(average_ans);
		
		
		// This line asks the user for input by popping out a single window
		// with text input
		
		
	}
	
	public static int sum (ArrayList<Integer> numArr) {
		int total = 0;
		
		for(int num: numArr) {
			total += num;
		} 
		
		
		return total;
		
		
	}
	
	public static int average (ArrayList<Integer> numArr) {
		int total = sum(numArr);
		int average_ans = total / numArr.size();	
		
		return average_ans;
	}
	
	public static void inputFromFile(ArrayList<Integer> numberArray, String filename) {
		
		TextFileInput in = new TextFileInput(filename);
		String line = in.readLine();
		while (line != null) {
			numberArray.add(Integer.parseInt(line));
			line = in.readLine();
			
		}
	
	}
	
}




 