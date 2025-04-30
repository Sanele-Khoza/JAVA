import java.util.Queue;
import java.util.LinkedList;

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Queue = FIFO data structure (First in first out) removal at head, insertion at tail
		// Linear Data
		// add = enqueue, offer() / add()
		// remove = dequeue, poll() / remove()
		// peek = element() / peek()
		//Linked list and Priority queue 
		
		//Queue<String> queue = new Queue<String>();//Queue is an interface not a class so  
		//we cannot instantiate a queue because it is an interface
		Queue<String> queue = new LinkedList<String>();//instantiate
		
		//System.out.println(queue.isEmpty());
		/*
		queue.offer("Sanele"); //Head
		queue.offer("Dima");
		queue.offer("Linda");
		queue.offer("Rondo");
		queue.add("Ratso"); //Tail

		
		System.out.println(queue);
		System.out.println(queue.peek());
		
		//Removal (dequeue)
		queue.poll();
		queue.poll();
		System.out.println(queue);
		*/
		
		/*
		queue.offer("Sanele"); //Head
		queue.offer("Dima");
		queue.offer("Linda");
		queue.offer("Rondo");
		queue.add("Ratso"); //Tail
		
		//check the size of the queue
		System.out.println(queue.size());
		*/
		
		queue.offer("Sanele"); //Head
		queue.offer("Dima");
		queue.offer("Linda");
		queue.offer("Rondo");
		queue.add("Ratso"); //Tail
		
		//to check if the queue contains a certain object
		System.out.println(queue.contains("Sanele"));
		
	}

}
