// import java.io.*;
import java.util.*;

class myStack {
        public static void main(String[] args) {
            

    Stack<Integer> myStack = new Stack <Integer>();

    myStack.push(1);
    myStack.push(2);
    myStack.push(3);

    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    // System.out.println(myStack.pop());

    if(myStack.isEmpty()) {
        System.out.println("My stack is empty");
    }
    else {
        System.out.println("There's something in the top: " + myStack.peek());
    }
    }





}


// Java code for stack implementation 

// import java.io.*; 
// import java.util.*; 

// class Test 
// { 
// 	// Pushing element on the top of the stack 
// 	static void stack_push(Stack<Integer> stack) 
// 	{ 
// 		for(int i = 0; i < 5; i++) 
// 		{ 
// 			stack.push(i); 
// 		} 
// 	} 
	
// 	// Popping element from the top of the stack 
// 	static void stack_pop(Stack<Integer> stack) 
// 	{ 
// 		System.out.println("Pop Operation:"); 

// 		for(int i = 0; i < 5; i++) 
// 		{ 
// 			Integer y = (Integer) stack.pop(); 
// 			System.out.println(y); 
// 		} 
// 	} 

// 	// Displaying element on the top of the stack 
// 	static void stack_peek(Stack<Integer> stack) 
// 	{ 
// 		Integer element = (Integer) stack.peek(); 
// 		System.out.println("Element on stack top: " + element); 
// 	} 
	
// 	// Searching element in the stack 
// 	static void stack_search(Stack<Integer> stack, int element) 
// 	{ 
// 		Integer pos = (Integer) stack.search(element); 

// 		if(pos == -1) 
// 			System.out.println("Element not found"); 
// 		else
// 			System.out.println("Element is found at position: " + pos); 
// 	} 


// 	public static void main (String[] args) 
// 	{ 
// 		Stack<Integer> stack = new Stack<Integer>(); 

// 		stack_push(stack); 
// 		stack_pop(stack); 
// 		stack_push(stack); 
// 		stack_peek(stack); 
// 		stack_search(stack, 2); 
// 		stack_search(stack, 6); 
// 	} 
// } 
