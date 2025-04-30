import java.util.*;

public class PriorityQueues {
	
	public static void main(String[] args) {
		//Priority Queue = FIFO data structure that serves elements with 
		//                 highest priority before 
		
		/*
		//LinedList
		Queue<Double> queue = new LinkedList<Double>();
		
		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);
		
		//use a while loop because if not it'll print the first element in the head
		while(!queue.isEmpty()) {//while gpa is not empty do
			System.out.println(queue.poll());
		}
		*/
		
		//now Priority Queue
		//Ascending Order
		Queue<Double> queue = new PriorityQueue<Double>();//it's gonna print in order since we working with numbers
		
		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);
		
		//use a while loop because if not it'll print the first element in the head
		while(!queue.isEmpty()) {//while gpa is not empty do
			System.out.println(queue.poll());
		}
		
		/*
		System.out.println();
		
		//Priority Queue
		//Descending Order
		//pass a comparator Collection.reverseOrder()
		Queue<Double> queue2 = new PriorityQueue<Double>(Collections.reverseOrder());//it's gonna print in Dorder since we working with numbers
		
		queue2.offer(3.0);
		queue2.offer(2.5);
		queue2.offer(4.0);
		queue2.offer(1.5);
		queue2.offer(2.0);
		
		//use a while loop because if not it'll print the first element in the head
		while(!queue2.isEmpty()) {//while gpa is not empty do
			System.out.println(queue2.poll());
		}
		*/
		
		System.out.println();
		
		//Priority Queue
		//Ascending Order
		//pass a comparator Collection.reverseOrder()
		Queue<String> queue3 = new PriorityQueue<>();//it's gonna print in Aorder since we working with numbers
		
		queue3.offer("D");
		queue3.offer("A");
		queue3.offer("C");
		queue3.offer("E");
		queue3.offer("B");
		
		//use a while loop because if not it'll print the first element in the head
		while(!queue3.isEmpty()) {//while gpa is not empty do
			System.out.println(queue3.poll());
		}
		
		System.out.println();
		
		//Priority Queue
	 	//Descending Order
		//pass a comparator Collection.reverseOrder()
		Queue<String> queue4 = new PriorityQueue<>(Collections.reverseOrder());//it's gonna print in Dorder since we working with numbers
		
		queue4.offer("D");
		queue4.offer("A");
		queue4.offer("C");
		queue4.offer("E");
		queue4.offer("B");
		
		//use a while loop because if not it'll print the first element in the head
		while(!queue4.isEmpty()) {//while gpa is not empty do
			System.out.println(queue4.poll());
		}
		
		
		
	}
}
