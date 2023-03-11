package lecture4;

public class Sorting {
	public static void main(String[] args) {
		// Selection Sort
		
		int[] numbers = {4,22,5,2,6,1,7,8,5,3,4,5,2,1};
		
		int smallest = numbers[0];
		int smallest_index = 0;
		int temp;
		
		
		for (int j = 0; j < numbers.length ; j++) {
			smallest = numbers[j];
			for (int i = j; i < numbers.length; i++) {
				if (numbers[i] < smallest) {
					temp = smallest;
					smallest = numbers[i];
					numbers[i] = temp;
				}
				
			}
			numbers[j] = smallest;
		}
		
		for (int i: numbers) {
			System.out.println(i);
		}
		
		
	}
	
	public static void swap(int[] arr, int num1_index, int num2_index) {
		
	}

}
