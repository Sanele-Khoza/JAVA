//import java.util.*;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Collections;

public class Queues {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("CODM");
        stack.push("PES 2025");
        stack.push("WARZONE");
        stack.push("CLASH OF CLANS");
        stack.push("GTA 6");

        //System.out.println(stack.empty());
        System.out.println(stack);
        System.out.println("This object is removed " + stack.pop());//GTA 6 will be removed 
        String removed = stack.pop();
        System.out.println("This object is removed " + removed); //CLASH OF CLANS will be removed

        for(int i = 20; i < 25; i++){
            stack.push("FIFA" + " " + i);
        }
        System.out.println(stack);
        System.out.println();

        //Queues
        System.out.println("Queues");

        Queue<Double> queue = new LinkedList<>();
        
        queue.offer(2.5);
        queue.offer(1.8);
        queue.offer(3.7);
        queue.offer(8.0);

        System.out.println(queue);
        System.out.println();

        System.out.println("Priority Queue");

        Queue<Double> queue1 = new PriorityQueue<>();

        queue1.offer(2.5);
        queue1.offer(1.8);
        queue1.offer(3.7);
        queue1.offer(8.0);
        System.out.println(queue1);

        System.out.println("Priority Queue Reversed");

        Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder());//Uses a comparator to reverse

        queue2.offer(2.5);
        queue2.offer(1.8);
        queue2.offer(3.7);
        queue2.offer(8.0);
        System.out.println(queue2);
    }
    
}
