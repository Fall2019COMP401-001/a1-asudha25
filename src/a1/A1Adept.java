package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int amount_of_groceries = scan.nextInt();
		// System.out.println(amount_of_groceries);
		String[] names_of_items = new String[amount_of_groceries];
		double[] prices = new double[amount_of_groceries];
		//this for loop is to sort the names and prices of all the groceries into 2 arrays 
		for (int i=0; i<amount_of_groceries; i++) {
			names_of_items[i] = scan.next();
			prices[i] = scan.nextDouble(); 

		}
		int amount_of_customers = scan.nextInt();
		String[] all_names = new String[amount_of_customers];
		double[] all_values = new double[amount_of_customers];
		//this for loop is to arrange by customer 
		for (int j=0; j<amount_of_customers; j++) {
			String first_name = scan.next();
			String last_name = scan.next(); 
			//this is an array of all the people 
			all_names[j] = first_name+" "+last_name;
			int number_of_items = scan.nextInt();
			//this for loop is to give me a list of items and how much there are of each
			double total_amount = 0;
			for (int k=0; k<number_of_items; k++) {
				double amount_of_items = scan.nextInt();
				String type_of_item = scan.next(); 
				//this for loop is to match the items with the initial array and find the total price 
				for (int l=0; l<amount_of_groceries; l++) {
					if (type_of_item.equals(names_of_items[l])){
						double one_item_price = prices[l] * amount_of_items;
						total_amount += one_item_price;
						//this should give me an array of the total amounts for each person 
						all_values[j] = total_amount;
						break;

					}
				}
			}
		}
		double initial_max = all_values[0];
		double initial_min = all_values[0];
		double total_sum_of_prices = all_values[0];
		int name_indx_min = 0;
		int name_indx_max = 0;
		//this for loop gives me the min, max, and total sum 
		for (int m=1; m<all_values.length; m++) {	
			if (all_values[m] > initial_max) {
				initial_max= all_values[m];
				name_indx_max = m;
			}
			if (all_values[m] < initial_min) {
				initial_min = all_values [m];
				name_indx_min = m;
			}
			total_sum_of_prices += all_values[m];
			
		}
		double average = total_sum_of_prices / amount_of_customers;
		String some_string2 = String.format("%.2f", average);

		
		String some_string = String.format("%.2f", all_values[name_indx_max]);
		System.out.println("Biggest: "+all_names[name_indx_max]+ " ("+some_string+")");
		String some_string1 = String.format("%.2f", all_values[name_indx_min]);
		System.out.println("Smallest: "+all_names[name_indx_min]+ " ("+some_string1+")");
		System.out.println("Average: "+some_string2);
	}
}
