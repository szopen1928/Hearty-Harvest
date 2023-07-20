import java.util.ArrayList;
import java.util.List;

public class HeartyHarvest {
	
	// create a list of items 
	public List<String> items = new ArrayList<String>();
	
	// add items to the list 
	public void addItem(String itemName) {
		items.add(itemName);
	}
	
	// remove items from the list 
	public void removeItem(String itemName) {
		int itemIndex = items.indexOf(itemName);
		if (itemIndex >= 0) {
			items.remove(itemIndex);
		}
	}
	
	// search for items in the list 
	public boolean containsItem(String itemName) {
		return items.contains(itemName);
	}
	
	// print out list of items 
	public void printItems() {
		if (items.size() > 0) {
			for (String item : items) {
				System.out.println(item);
			}
		}
	}
	
	// clear out list of items 
	public void clear() {
		items.clear();
	}
	
	// sort items in the list 
	public void sortItems() {
		items.sort(String::compareToIgnoreCase);
	}
	
	// create a string representation of all the items
	public String getStringRepresentation() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < items.size(); i++) {
			sb.append(items.get(i));
			if (i < items.size() - 1) {
				sb.append(", ");
			}
		}
		return sb.toString();
	}
	
	// get the number of items 
	public int getNumberOfItems() {
		return items.size();
	}
	
	// find the position of a particular item 
	public int getItemPosition(String itemName) {
		return items.indexOf(itemName);
	}
	
	// get the item at a particular position 
	public String getItemAtPosition(int position) {
		return items.get(position);
	}
	
	// check if an item is empty
	public boolean isEmpty() {
		return items.isEmpty();
	}
	
	// update the item at a particular position
	public void updateItemAtPosition(int position, String newItem) {
		items.set(position, newItem);
	}
	
	// swap two items at particular positions
	public void swapItems(int firstPosition, int secondPosition) {
		String temp = items.get(firstPosition);
		items.set(firstPosition, items.get(secondPosition));
		items.set(secondPosition, temp);
	}
	
	// reverse the order of items in the list
	public void reverseItems() {
		for (int i = 0; i < items.size() / 2; i++) {
			swapItems(i, items.size() - 1 - i);
		}
	}
	
	// get all the items in the list
	public List<String> getAllItems() {
		return items;
	}
	
	// print an item at particular position
	public void printItemAtPosition(int position) {
		System.out.println(items.get(position));
	}
}