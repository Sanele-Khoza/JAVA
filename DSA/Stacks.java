import java.util.Stack;

public class Stacks{
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

    }
}