package iteratordesignpattern;
/**
 * item class for wishlist items
 * @author miller
 */
public class Item {
	//attributes
	String title;
	String desc;
	double price;
	/**
	 * Item constructor
	 * @param title of item
	 * @param description of item
	 * @param price of item
	 */
	public Item(String title, String description, double price)
	{
		this.title = title;
		this.desc = description;
		this.price = price;
	}
	/**
	 * display the details of an item
	 * @return string representation of an item
	 */
	public String toString()
	{
		return ("\n****" + this.title + "****" + "\n" + this.desc + "\n" + "Price: $" + this.price);
	}
	/**
	 * get the price of an item
	 * @return item price
	 */
	public double getPrice()
	{
		return this.price;
	}
	/**
	 * prints the details of an item
	 */
	public void print()
	{
		System.out.println(this.toString());
	}
}
