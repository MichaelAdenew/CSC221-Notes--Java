import java.util.NoSuchElementException;

public class StackQueueClient {
	public static void main(String[] args){
		// Create a new queue object
		StackQueue queue = new StackQueue();

		// You should be able to call StackQueue 
		// methods on your queue as soon as you implement its functionality

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		while(queue.size() > 0) {
			System.out.println(queue.dequeue());
		}
		queue.enqueue(9);

		try {
			System.out.println("Found something: " + queue.dequeue());
		}
		catch(NoSuchElementException e) {
			System.out.println("Trying to get elements out of an empty queue.");
		}

		System.out.println("Yay! Congratulations!");
	}
}
