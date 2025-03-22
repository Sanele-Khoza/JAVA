import javax.swing.JOptionPane;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int x = -1;//This is done to ensure that the game enters the loop
		int attempts = 0;
		
		while(x != num) {//The loop runs until x == num
			//Get the user input
			String n = JOptionPane.showInputDialog(null, "Guess the number between 1 and 10:");
			
			//This section if no number entered
			//Handle cancel button
			if(n == null ) {
				JOptionPane.showMessageDialog(null, "Game Cancelled");
				return;
			}
			
			//Validate input (check if it is a number)
			if(!n.matches("\\d+")) {//if n is not a digit
				JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number.");
				continue;
			}
			
			//This section if a number is entered
			x = Integer.parseInt(n);//convert into Integer
			attempts++;
			
			//check the guess
			if(x < 1 || x > 10) {
				JOptionPane.showMessageDialog(null, "Number Out of bound!!");
			} else if(x < num) {
				JOptionPane.showMessageDialog(null, "Too Small");
			} else if(x > num) {
				JOptionPane.showMessageDialog(null, "Too Big");
			} else {
				JOptionPane.showMessageDialog(null, "Bingoo You guessed it in " + attempts + " attempts");
			}
		}
	
	}

}
