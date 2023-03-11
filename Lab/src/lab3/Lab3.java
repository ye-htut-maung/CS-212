package lab3;

public class Lab3 {
	public static void main (String[] args) {
		float fahrenheit;
		float centigrade;
		
		fahrenheit = 98.6f;
		
		centigrade = (5f/9f) * (fahrenheit-32f);
		
		System.out.println("F: " + fahrenheit);
		System.out.println("C: " + centigrade);
		
		System.out.println("------------------------");
		
		for (float i = 0.0f; i <= 40.0f; i += 5.0f ) {
			centigrade = (5f/9f) * (i-32f);
			System.out.println("F: " + i + "    C: " + centigrade);
			
		}
		
		System.out.println("------------------------");
		float f = 0.0f;
		while (f <= 40.0f) {
			
			
			centigrade = (5f/9f) * (f-32f);
			System.out.println("F: " + f + "    C: " + centigrade);
			f += 5.0;
		}
		
	}

}
