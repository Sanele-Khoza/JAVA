import java.security.SecureRandom;
import java.util.*;

public class RandomNameGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String low = "abcdefghijklmnopqrstuvwxyz";
		String digit = "1234567890";
		String specialchars = "-_.";
		
		SecureRandom random = new SecureRandom();
		
		
		List<Character> list = new ArrayList<Character>();
		list.add(up.charAt(random.nextInt(up.length())));
		list.add(up.charAt(random.nextInt(up.length())));
		list.add(low.charAt(random.nextInt(low.length())));
		list.add(low.charAt(random.nextInt(low.length())));
		list.add(low.charAt(random.nextInt(low.length())));
		list.add(digit.charAt(random.nextInt(digit.length())));
		list.add(digit.charAt(random.nextInt(digit.length())));
		list.add(specialchars.charAt(random.nextInt(specialchars.length())));
		
		Collections.shuffle(list);
		
		StringBuilder build = new StringBuilder();
		for(char c: list) {
			build.append(c);
		}
		
		String Generated_Name = build.toString();	
		
		System.out.println("Random Generated Name: " + Generated_Name);
		
	}

}
