import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//can treat LinkedList as a stack or queue
		LinkedList<String> linkedList = new LinkedList<String>();
		
		/*
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		linkedList.pop("F");
		
		System.out.println(linkedList);*/
		
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
		//linkedList.poll("F");
		
		linkedList.add(4, "E");
		linkedList.addFirst("G");
		linkedList.addLast("H");
		
		linkedList.remove();
		linkedList.removeFirst();
		linkedList.removeLast();
		
		System.out.println(linkedList.indexOf("F"));
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList);
		
	}

}

