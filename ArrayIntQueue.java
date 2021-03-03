import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayIntQueue {
	private List<Integer> myData; //The data

	/** Construct an empty Queue
	 * 
	 */
	public ArrayIntQueue(){
		myData = new ArrayList<Integer>();
	}

	/** Adds an item to the end of this queue.
	 * 
	 * @param item -  the item to be added to this queue.
	 * @return the item argument.
	 * 
	 * 
	 */

	public int enqueue(int item){
		myData.add(item);
		//This is a place holder
		return item;
	}

	/** Removes the object at the front of the queue 
	 * and returns that object as the value of this function.
	 * 
	 * @return The object at the front of the queue
	 * @throws NoSuchElementException if the queue is empty
	 */
	public int dequeue(){
		try {
			int ToRemove = myData.get(0);
			myData.remove(0);
			return ToRemove;
		} catch (Exception noSuchElementException) {
			System.out.println("There's no element to remove");
			throw new NoSuchElementException();
		}
	}

	/** Return a String representation of this queue object
	 * 
	 * @return a String representation of this queue object
	 */
	public String toString(){
		String s = "";
		if(!myData.isEmpty()){
			for(int i = 0; i < myData.size()-1; i++){
				s += myData.get(i) + " -> ";
			}
			s += myData.get(myData.size()-1);
		}
		else{
			s += " -> ";
		}
		return s;
	}
}
