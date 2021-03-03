import java.util.NoSuchElementException;

import java.util.Stack;

/**
 * Implement a queue using two stacks
 * 
 * @author Michael 
 *
 */
public class StackQueue {
	// Create your two stacks here, as private variables. Call them myStackIn and myStackOut
	// First stack here
	Stack <Integer> myStackIn;
	// Second stack here
	Stack <Integer> myStackOut;

	private int mySize; // Keeps track of the number of elements in the queue

	/** Constructor: constructs an empty queue.
	 * 
	 *  Initialize the two stacks and set the size to zero.
	 */
	public StackQueue(){
		myStackIn = new Stack <Integer>();
		myStackOut = new Stack <Integer>();
		mySize = 0;
	}

	/** Add an element to the end of the queue.
	 * 
	 * 
	 * @param integer element to be added to the end of the queue.
	 */
	public void enqueue(int element){
		myStackIn.add(element);
		mySize++;
	}


	/** Remove an item from the queue and return the value.
	 * 
	 * @return The first integer in the queue.
	 * @throw  NoSuchElementException if the queue is empty.
	 */
	public int dequeue(){
		if (mySize == 0){
			throw new NoSuchElementException("Sorry! This stack is empty");
		}
		else{
			for (int i = 0; i < mySize; i++) {
			myStackOut.push(myStackIn.pop());
			}
			mySize--;
			int toReturn = myStackOut.pop();

			for (int i = 0; i < mySize; i++){
				myStackIn.push(myStackOut.pop());
			}

			return toReturn;
			

		}
	}

	/** Returns true if the queue is empty and false otherwise.
	 * 
	 * @return boolean true if queue is empty, and false otherwise.
	 */
	public boolean isEmpty(){
		if (mySize == 0){
			return true;
		}
		else{

		return false;
		}
	}

	/** Returns the size of the queue.
	 * 
	 * @return integer size of the queue.
	 */
	public int size(){
		return mySize;
	}
}
