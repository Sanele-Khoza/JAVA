import java.util.*;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
			String password = generate_pass(8, 12);
			System.out.println("Random Password: " + password);
			
			
	}
	
	static String generate_pass(int min, int max) {
		Random random = new Random();
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String numbers ="0123456789";
		String specialChars = "!@#$%&*()_+{}?";
		String everything = upperCase + lowerCase + numbers + specialChars;
		
		List<Character> lettersList = new ArrayList<Character>();
		for(char c: everything.toCharArray()) {
			lettersList.add(c);
		}
		Collections.shuffle(lettersList);
		String password = "";
		for(int i = random.nextInt(max - min) + min; i > 0; i--) {
			password += lettersList.get(random.nextInt(lettersList.size()));
		}
		return password;
	}
		
}
