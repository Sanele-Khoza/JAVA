package stack;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pop(), peek(), push(), empty(), search()
		
		//Stack<datatype> stackname = new Stack<datatype>();
		Stack<String> stackname = new Stack<String>();
		/*
		stackname.push("Call of Duty Mobile");
		stackname.push("Warzone");
		stackname.push("Clash of Clans");//Top of the stack
		
		System.out.println(stackname);
		System.out.println(stackname.peek() + " is at the top of the stack");
		*/
		
		/*
		stackname.push("Call of Duty Mobile");
		stackname.push("Warzone");
		stackname.push("Clash of Clans");//Top of the stack
		
		//to remove at the top of the stack -----> pop()
		
		String removed = stackname.pop(); //i assign the popped object to remove so that it can be stored there
		
		System.out.println(stackname);
		System.out.println(stackname.peek() + " is at the top of the stack");
		System.out.println("The Object removed is " + removed);
		
		//if you need to search for an object we use search()
		System.out.println(stackname.search("Call of Duty Mobile"));
		*/
		
		/*
		stackname.push("Call of Duty Mobile");
		stackname.push("Warzone");
		stackname.push("Clash of Clans");//Top of the stack
		
		
		//if you need to search for an object we use search()
		System.out.println(stackname.search("Call of Duty Mobile"));
		System.out.println(stackname.search("Clash of Clans"));
		*/
		
		/*
		stackname.push("Call of Duty Mobile");
		stackname.push("Warzone");
		stackname.push("Clash of Clans");//Top of the stack
		
		for(int i = 0; i < 2; i++) {
			stackname.push("FC Mobile");
		}
		
		System.out.println(stackname);
		*/
		
		/*Uses of stack
		  1. undo/redo features in text editors
		  2. moving back and forward through browser history
		  3. backtraction algorithms (maza, file directories)
		  4. calling functions (call stack)
		 */
		
		stackname.push("Call of Duty Mobile");
		stackname.push("Warzone");
		stackname.push("Clash of Clans");//Top of the stack
		
	}

}
