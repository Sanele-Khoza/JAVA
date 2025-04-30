import java.security.SecureRandom;
import java.util.Collections;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class RandomPasswordJOption {

	public static void main(String[] args) {
		String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String symbols ="!@#$%^&*()-_+=<>?";
		String allStrings = upperCaseLetters + lowerCaseLetters + digits + symbols;
		
		while(true) {
			//Prompt a user to enter the length of the password using dialogBox
			String x;
			Integer length = null;
			do {
				x = JOptionPane.showInputDialog(null, "Enter your Desired Password Length between 8 and 16 : ");
				//length = Integer.parseInt(x);//Pass the string into Integer
				if(x == null || x.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Length cannot be empty", "ERROR!", JOptionPane.ERROR_MESSAGE);
					continue;
				}
				try {
					length = Integer.parseInt(x.trim());//Pass the string into Integer
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null, "Enter a valid number", "ERROR!", JOptionPane.ERROR_MESSAGE);
					length = null;
				}
			}while(length == null);
			
			//length has to be positive and must be between 8 and 16
				if(length < 8 || length > 16) {
					JOptionPane.showMessageDialog(null, "Desired Length must be between 8 to 16 characters");//if length is doesn't meet the required conditions
					continue;
				}
				
				int allStringLength = allStrings.length();//Declared a variable and assigning it to the length of the concatenated   
				
				SecureRandom securerandom = new SecureRandom();//create an object called securerandom to use the class SecureRabdom's class methods
				
				List<Character> list = new ArrayList<Character>();//creating a list to store random characters
				//loop until the desired length is met
				for(int i = 0; i < length; i++) {
					int index = securerandom.nextInt(allStringLength);//choose a random number from the length of allStrings
					char randomChar = allStrings.charAt(index);//select the character at the random index 
					list.add(randomChar);//Add the selected character to the list
				}
				
				Collections.shuffle(list);//after storing characters shuffle the list 
				
				StringBuilder passwordBuild = new StringBuilder();//use string builder class to build the password
				for(char c: list) {
					passwordBuild.append(c);//add each character to the object passwordBuild
				}
				String RandomPassword;//variable RandomPassword
				RandomPassword = passwordBuild.toString();//Store the built password in the variable
				
				JOptionPane.showMessageDialog(null, "Your Generated Password is: \n" + RandomPassword);//print the password
				
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to generate another password.?", "Continue", JOptionPane.YES_NO_OPTION);//if length is doesn't meet the required conditions
				if(choice != JOptionPane.YES_NO_OPTION) {
					break;
				}
		}
		
	}

}
