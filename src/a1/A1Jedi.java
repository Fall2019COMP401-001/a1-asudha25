package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
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
		//array of number of groceries bought by all customers 
		int[] number_bought_by_customers = new int[amount_of_groceries];
		//array of how many customers bought that grocery
		int[] number_of_customers= new int[amount_of_groceries];
		double[] all_values = new double[amount_of_customers];
		//this for loop is to arrange by customer 
		for (int j=0; j<amount_of_customers; j++) {
			String first_name = scan.next();
			String last_name = scan.next(); 
			int number_of_items = scan.nextInt();
			//this for loop is to give me a list of items and how much there are of each
			double total_amount = 0;
			for (int k=0; k<number_of_items; k++) {
				double amount_of_items = scan.nextInt();
				String type_of_item = scan.next(); 
				//this for loop is to match the items with the initial array and add the values to my arrays   
				for (int l=0; l<amount_of_groceries; l++) {
					if (type_of_item.equals(names_of_items[l])){
						number_of_customers[l] += 1;
						number_bought_by_customers [l] += amount_of_items;
						break;

					}
				}
			}
		}
		for (int m=0; m<amount_of_groceries; m++ ) {
			if(number_of_customers[m] == 0) { 
				System.out.println("No customers bought "+names_of_items[m]);
			}
			else{
				System.out.println(number_of_customers[m]+" customers bought "+number_bought_by_customers[m]+" "+names_of_items[m]);
			}
				
		}
	}
}
