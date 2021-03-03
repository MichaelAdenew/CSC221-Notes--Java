

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class ArrayIntStack {

	private List<Integer> myData; // The data
	
	/** Construct an empty Stack
	 * 
	 */
	public ArrayIntStack(){
		myData = new ArrayList<Integer>();
	}
	
	/** Pushes an item onto the top of this stack.
	 * 
	 * @param item -  the item to be pushed onto this stack.
	 * @return the item argument.
	 */
	public int push(int item){
		myData.add(item);
		
		//This is a place holder
		return item;
	}
	
	/** Removes the object at the top of this stack 
	 * and returns that object as the value of this function.
	 * 
	 * @return The object at the top of this stack 
	 * @throws EmptyStackException if the stack is empty
	 */
	public int pop(){
		try {
			myData.remove(myData.size() - 1);
		//This is a place holder
		return (myData.get(myData.size() - 1));
			
		} catch (Exception emptyStackException) {
			System.out.println("Cannot pop. Stack is empty");
			throw new EmptyStackException();
		}
	}
	/** Return a String representation of this stack object
	 * 
	 * @return a String representation of this stack object
	 */
	public String toString(){
		String s = "";
		for(int i = myData.size()-1; i >=0; i--){
			s += "| " + myData.get(i) + " |\n";
		}
		if(myData.isEmpty()){
			s += "|   |";
		}
		return s;
	}
}
