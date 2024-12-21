/*
This class implements a Bag data structure
 */

package bagpack;

import java.util.List;
import java.util.ArrayList;

public class Bag<T> {
	public List<T> contents;
	
	// creates a new bag instance with its contents stored in an ArrayList instance
	public Bag() {
		contents = new ArrayList<>();
	}
	
	// adds a specified item to the bag contents
	public void add(T item) {
		System.out.println(item + " added to bag.");
		contents.add(item);
	}
	
	// removes a specified item to the bag contents
	public void remove(T item) {
		System.out.println(item + " removed from bag.");
		contents.remove(item);
	}
	
	// checks if the bag contains the specified item
	public boolean contains(T item) {
		boolean contains = contents.contains(item);
		if (contains) {
			System.out.println(item + " is in the bag.");
		} else {
			System.out.println(item + " is not in the bag.");
		}
		return contains;
	}
	
	// gives the amount of specified items in the bag
	public int count(T item) {
		int amount = 0;
		for (T c : contents) {
			if (c.equals(item)) {
				amount++;
			}
		}
		switch (amount) {
		case 0:
			System.out.printf("There are no %ss in the bag.\n", item);
			break;
		case 1:
			System.out.printf("There is 1 %s in the bag.\n", item);
			break;
		default:
			System.out.printf("There are %d %ss in the bag.\n", amount, item);
			break;
		}
		return amount;
	}
	
	// prints the contents of the bag
	public void printContents() {
		System.out.println("The bag contains: " + contents);
	}
	
	// returns the total number of elements in the bag, including duplicates
	public int size() {
		int num = contents.size();
		System.out.printf("The bag has %d items.\n", num);
		return num;
	}
	
	// merges the elements of 'otherBag' into the current bag
	public void merge(Bag<T> otherBag) {
		contents.addAll(otherBag.contents);
		System.out.println("The two bags have been merged successfully.");
	}
	
	// returns a new bag that contains only the distinct elements from the current bag
	public Bag<T> distinct() {
		Bag<T> distinctBag = new Bag<T>();
		for (T item : this.contents) {
			if (!distinctBag.contents.contains(item)) {
				distinctBag.contents.add(item);
			}
		}
		
		System.out.println("New bag with distinct items successfully created.");
		return distinctBag;
	}
	
}
