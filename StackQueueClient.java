
public class StackQueueClient {
	public static void main(String[] args){
		ArrayIntStack stack = new ArrayIntStack();
		ArrayIntQueue queue = new ArrayIntQueue();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue.toString());
		queue.dequeue();
		System.out.println(queue.toString());
	}
}
