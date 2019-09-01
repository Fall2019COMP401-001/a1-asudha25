package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int number_of_customers = scan.nextInt();
		String[] output = new String[number_of_customers];
		//this for loop calls on my function below 
	    for (int j=0; j<number_of_customers; j++) {
	    	output[j] = readandprintfunction(scan); 
	    	 
	    }
	    //this for loop puts out my output at once
	    for (int j=0; j<number_of_customers; j++) {
	    	System.out.println(output[j]);
	    }
	}

	static String readandprintfunction(Scanner scan) {

		String first_name = scan.next();
		String last_name = scan.next();
		int number_of_groceries = scan.nextInt();
		double total_value = 0;
		// this for loop sums the price of the groceries together for each customer
		for (int i=0; i<number_of_groceries; i++ ) {
			int quantity_of_groceries = scan.nextInt();
			String item = scan.next();
			double price_of_groceries = scan.nextDouble();
			
			double total_price = quantity_of_groceries * price_of_groceries;
			total_value += total_price;
		}
		String actual_price = String.format("%.2f",total_value);
		String final_answer = (first_name.charAt(0)+". "+last_name+": "+actual_price);
		return final_answer;
			
			
	}
}
