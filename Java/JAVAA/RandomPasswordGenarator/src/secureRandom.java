/*SecureRandom is a class in java
 * Full name: java.security.SecureRandom
 * Type: Class
 * Superclass: it extends the java.util.Random class it overrides its methods and makes them secure
 * 
 * BECAUSE IT IS A CLASS YOU'LL NEED TO
 * 1. import it: import java.security.SecureRandom
 * 2. Create an object: SecureRandom random = new SecureRandom();
 * 3. Use it's methods: random.nextInt(), random.nextBytes() and more*/

import java.security.SecureRandom;

public class secureRandom {

	//Generate a random number between 0-9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;//Declare the number
		//SecureRandom is a class
		SecureRandom random = new SecureRandom();//create new instance of SecureRandom and random is the object name(the reference variable
		number = random.nextInt(10);
		//System.out.println(number);
		
		//Generating a random character
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//char randomCharacter;
		//randomCharacter = alphabets.charAt(random.nextInt(alphabets.length()));
		//System.out.println(randomCharacter );
		
		//or
		int length = alphabets.length();
		
		StringBuilder strng = new StringBuilder();
		
		for(int i = 0; i < 2; i++) {
			int index = random.nextInt(length);
			char randomCharacter = alphabets.charAt(index);
			strng.append(randomCharacter);
			
		}
		System.out.println(strng.toString() );
	}

}
