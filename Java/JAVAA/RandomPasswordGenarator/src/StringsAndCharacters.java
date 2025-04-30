public class StringsAndCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Strings and Characters

		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(text.length());

		// toUpperCase()
		String txt = "Hello World";
		String up = txt.toUpperCase();// Converts the text to upper case
		String low = txt.toLowerCase();// Converts the text to lower case
		System.out.println(up + " " + low);// Prints the String text in both Upper and Lower cases

		// Finding a character in a string
		// indexOf() - this method returns the position of the first occurrence(Letter)
		// of the specified text
		String msg = "Sanele Please go get water";
		String key = "go";
		int index = msg.indexOf(key);
		System.out.println(index);
		// or
		System.out.println(msg.indexOf("le"));

		// String Methods
		// 1. charAt() - Returns the character at a specific index 0-n
		// Syntax - public char charAt(int index);
		String myStr = "Hello Universe";
		// System.out.println(myStr.charAt(8));
		char result = myStr.charAt(6);
		System.out.println(result);

	}

}
