/*Purpose: Adds(appends) a character to the end of a StringBuilder
 * Class name: java.lang.StringBuilder
 * Package: java.lang (it's automatically imported so no need to import it*/
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stringbuilder = new StringBuilder();
		/*
		stringbuilder.append("s");
		stringbuilder.append("a");
		stringbuilder.append("n");
		stringbuilder.append("e");
		stringbuilder.append("l");
		stringbuilder.append("e");
		*/
		
		//String build = stringbuilder.toString();
		//System.out.println("built name is: " + build + " in Reverse is: " + stringbuilder.reverse()); 
		
		
		List<Character> alpha = new ArrayList<Character>();
		alpha.add('$');
		alpha.add('@');
		alpha.add('N');
		alpha.add('E');
		
		//System.out.println(alpha);
		Collections.shuffle(alpha);
		
		for(char c: alpha) {
			stringbuilder.append(c);
		}
		String build = stringbuilder.toString();
		System.out.println(build);
		
		

	}

}
