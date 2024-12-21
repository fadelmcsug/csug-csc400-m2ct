/*
Title: Bag
Description: This app implements a Bag data structure with additional methods and tests it
Author: Fadel Makhzoum
Date: 22-Dec-2024
*/

package bagpack;

public class BagTest {

	public static void main(String[] args) {
		// create 2 bag instances of type string
		Bag<String> bag1 = new Bag<>();
		Bag<String> bag2 = new Bag<>();
		
		// fill bag1 with numbered string items
		System.out.println("Adding items to bag1...");
		bag1.add("item1");
		bag1.add("item1");
		bag1.add("item3");
		bag1.add("item5");
		bag1.add("item3");
		bag1.add("item2");
		bag1.add("item7");
		bag1.add("item8");
		bag1.add("item6");
		bag1.add("item5");
		bag1.add("item3");
		
		// fill bag2 with numbered string items
		System.out.println("\nAdding items to bag2...");
		bag2.add("item2");
		bag2.add("item2");
		bag2.add("item5");
		bag2.add("item5");
		bag2.add("item5");
		bag2.add("item1");
		bag2.add("item8");
		bag2.add("item8");
		bag2.add("item6");
		
		// get and print size of each bag
		System.out.println("\nGetting size of bag1...");
		bag1.size();
		System.out.println("\nGetting size of bag2...");
		bag2.size();
		
		// merge bag2 with bag1
		System.out.println("\nMerging bag2 with bag1...");
		bag1.merge(bag2);
		
		// print merged bag contents
		System.out.println("\nGetting bag1 contents...");
		bag1.printContents();
		
		// create a new bag with distinct items
		System.out.println("\nCreating bag with distinct items from bag1...");
		Bag<String> distinctBag = bag1.distinct();
		
		// print distinct bag contents
		distinctBag.printContents();

	}

}
