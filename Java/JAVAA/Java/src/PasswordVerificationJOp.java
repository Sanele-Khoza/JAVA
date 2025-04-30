
import javax.swing.JOptionPane;

public class PasswordVerificationJOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attempts = 3;
		//System.out.println(JOptionPane.showConfirmDialog(null, "Do you wish to Register with us..??", "Start", JOptionPane.YES_NO_OPTION));
		
		int answer = JOptionPane.showConfirmDialog(null, "Do you wish to Register with us..??", "Start", JOptionPane.YES_NO_OPTION);
		if(answer == 1) {
			return;
		}
		String name = JOptionPane.showInputDialog(null, "Enter your name: ");
		String surname = JOptionPane.showInputDialog(null, "Enter surname: ");
		String email = JOptionPane.showInputDialog(null, "Enter your Email: ");
			
		
		while(attempts > 0) {

			String password;
			String confirmpassword;
			
			do {
				password = JOptionPane.showInputDialog(null, "Enter Password: ");
				if(password == null) {
					JOptionPane.showMessageDialog(null, "Aborted!!", "Warning!", JOptionPane.WARNING_MESSAGE, null);
					//attempts = 0;
					return;
				} 
				if(password.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, 
							"Cannot be empty try again",
							"Warning", 
							JOptionPane.WARNING_MESSAGE, 
							null);
					attempts = 3;
				}
			}while(password.trim().isEmpty());

			do {
				confirmpassword = JOptionPane.showInputDialog("Confirm Password: ");
				if(confirmpassword == null) {
					JOptionPane.showMessageDialog(null, "Aborted!!", "Warning!", JOptionPane.WARNING_MESSAGE, null);
					//attempts = 0;
					//break;
					return;
				}
				if(confirmpassword.trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, 
							"Cannot be empty try again", 
							"Warning", 
							JOptionPane.WARNING_MESSAGE, 
							null);
					attempts = 3;
				}
			}while(confirmpassword.trim().isEmpty());
			
			if(password.equals(confirmpassword)){
				JOptionPane.showMessageDialog(null, "Registration Successful!!", 
						"Success!", 
						JOptionPane.INFORMATION_MESSAGE, null);
				JOptionPane.showMessageDialog(null, "Name: " + name + "\nSurname: " + surname + "\nEmail: " + email + "\n***Enjoy***" , 
						"Details", 
						JOptionPane.INFORMATION_MESSAGE, null);
				
				//sattempts = 0;
				return;
			}else{
				attempts = attempts -1;
				JOptionPane.showMessageDialog(null, "Passwords do not match! " + "|| You have \"" + attempts + "\" attempts Remaining!!",
						"Error!", 
						JOptionPane.ERROR_MESSAGE, null);
			}
			if(attempts == 0) {
				//attempts = 0;
				JOptionPane.showMessageDialog(null, "Access Denied!", 
						"Error!", 
						JOptionPane.ERROR_MESSAGE, null);
				return;
			}
	
			
		}
	}

}
