package iteratordesignpattern;
/**
 * wishlist object class for arrays of item objects
 * @author miller
 *
 */
public class WishList{
	//attributes
	String name;
	Item[] items;
	int count;
	/**
	 * wishlist constructor
	 * @param name
	 */
	public WishList(String name)
	{
		this.name = name;
		this.count = 0;
		this.items = new Item[5];
	}
	/**
	 * method to add an item to a wishlist
	 * @param title of item
	 * @param description of item
	 * @param price of item
	 */
	public void addItem(String title, String description, double price)
	{
		Item newItem = new Item(title, description, price);
		this.items[this.count] = newItem;
		this.count = this.count + 1;
	}
	/**
	 * method that creates a wishlist iterator object
	 * @return wishlist iterator object
	 */
	public WishListIterator createIterator()
	{
		WishListIterator wli = new WishListIterator(this.items);
		return wli;
	}
	/**
	 * method that gets the total cost of all the items in the list
	 * @return total cost of all the items in the list
	 */
	public double getTotalCost()
	{
		double totalCost = 0;
		for (Item i: this.items)
		{
			totalCost = totalCost + i.price;
		}
		return totalCost;
	}
	/**
	 * method that returns a new array that is double the size of a wishlist w/ the same information
	 * @param items array
	 * @return new items array
	 */
	public Item[] growArray(Item[] items)
	{
		int newLength = items.length * 2;
		Item[] newList = new Item[newLength];
		int minicounter = 0;
		for (Item i : items)
		{
			newList[minicounter] = items[minicounter];
			minicounter++;
		}
		return newList;
	}
}
