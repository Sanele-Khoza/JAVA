import java.security.SecureRandom;
import java.util.*;

public class SecureRandomPasswordGenerator {

	public static void main(String[] args) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String symbols ="!@#$%^&*()-_+=<>?";
		String stringConc = upper + lower + digits + symbols;
	
		
		SecureRandom random = new SecureRandom();
		
		List<Character> list = new ArrayList<Character>();
		for(int i = 0; i < 8; i++) {
			char randomChar = stringConc.charAt(random.nextInt(stringConc.length()));
			list.add(randomChar);
		}
		
		Collections.shuffle(list);
		
		StringBuilder password = new StringBuilder();
		for(char c: list) {
			password.append(c);
		}
		String RandomPass;
		RandomPass = password.toString();
		
		System.out.println("Your Generated Password is: " + RandomPass);
	}

}
