package iteratordesignpattern;
import java.util.Iterator;
public class WishListIterator implements Iterator<Object> {
	//attributes
	Item[] items;
	int position;
	/**
	 * wishlist iterator constructor
	 * @param items array
	 */
	public WishListIterator(Item[] items)
	{
		this.items = items;
		this.position = -1;
	}
	/**
	 * method that sees if there is another item in the list
	 */
	public boolean hasNext()
	{
		try {
			if(this.items[position + 1] != null)
			{
				return true;
			}
			else
			{
				return false;
			}
		}catch(Exception e) 
		{
			return false;
		}
	}
	/**
	 * method that gets the next item in the list
	 */
	public Item next()
	{
		this.position = this.position + 1;
		if (this.items[position] == null)
		{
			return null;
		}
		else
		{
			return this.items[position];
		}
	}
}
