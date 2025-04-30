import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class List_ArrayList_Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		
		List<Character> letters = new ArrayList<Character>();
		letters.add('S');
		letters.add('A');
		letters.add('N');
		letters.add('E');
		letters.add('L');
		letters.add('E');
		
		System.out.println("Before Shuffling: " + letters);
		
		Collections.shuffle(letters);
		System.out.println("After Shuffling: " + letters);
		
		String alphabets = "QWERTYUIOPASDFGHJKLZXCVBNM";
		
		List<Character> list = new ArrayList<Character>();
		for(char letters_: alphabets.toCharArray()) {
			list.add(letters_);
		}
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
