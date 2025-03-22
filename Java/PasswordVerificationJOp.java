import javax.swing.JOptionPane;

public class PasswordVerificationJOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attempts = 3;
		
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
			}while(password.trim().isEmpty());//trim() it removes blank spaces and isEmpty() checks if it is empty 

			do {
				confirmpassword = JOptionPane.showInputDialog("Confirm Password: ");
				if(confirmpassword == null) {//if cancel button is pressed then do
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
			
			if(password.equals(confirmpassword){
				JOptionPane.showMessageDialog(null, "Welcome to the Call Of Duty VIP section", 
						"Success!", 
						JOptionPane.INFORMATION_MESSAGE, null);
				//attempts = 0;
				return;
			}else{
				attempts = attempts -1;
				JOptionPane.showMessageDialog(null, "Passwords do not match! " + "|| You have \"" + attempts + "\" Remaining!!",
						"Error!", 
						JOptionPane.ERROR_MESSAGE, null);
			}
			if(attempts == 0) {
				//attempts = 0;
				JOptionPane.showMessageDialog(null, "Account Blocked!", 
						"Error!", 
						JOptionPane.ERROR_MESSAGE, null);
				return;
			}
	
			
		}
	}

}
