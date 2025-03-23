import javax.swing.JOptionPane;

public class Password{
    public static void main(String[] args){
        int attempts = 3;

        int accept = JOptionPane.showConfirmDialog(null, "Hello There Do you want to register", "Register",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(accept == 1){
            return;
        }

        String name = JOptionPane.showInputDialog(null, "Enter your name: ", "Details", JOptionPane.INFORMATION_MESSAGE);
        String surname = JOptionPane.showInputDialog(null, "Enter your surname: ", "Details", JOptionPane.INFORMATION_MESSAGE);
        String email = JOptionPane.showInputDialog(null, "Enter your email: ", "Details", JOptionPane.INFORMATION_MESSAGE);
        //int x =Integer.parseInt(x);
        String phone;
        do{     
            phone = JOptionPane.showInputDialog(null, "Enter your number: ", "Details", JOptionPane.INFORMATION_MESSAGE);
            if(!phone.matches("\\d+")){
            JOptionPane.showMessageDialog(null, "Enter Digits", "Error!", JOptionPane.WARNING_MESSAGE);
            }
        }while(!phone.matches("\\d+"));

        while(attempts > 0){
            String password;
            String confirmpassword;

            do{
                password = JOptionPane.showInputDialog(null, "Enter Password: ");
                if(password == null){
                    JOptionPane.showMessageDialog(null, "Cancelled",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(password.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Password is Empty try AGAIN!!",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);  
                }
            }while(password.trim().isEmpty());

            do{
                confirmpassword = JOptionPane.showInputDialog(null, "Confirm Password: ");
                if(confirmpassword == null){
                    JOptionPane.showMessageDialog(null, "Cancelled",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(confirmpassword.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Password is Empty try AGAIN!!",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);  
                }
            }while(confirmpassword.trim().isEmpty());

            if(password.equals(confirmpassword)){
                JOptionPane.showMessageDialog(null, "Successfully registered", "Success!", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Your info:" + "\nName:" + name + "\nSurname: "+ surname + "\nEmail: " + email + "\nContact: " + phone,
                "Success!",
                JOptionPane.INFORMATION_MESSAGE);
                return;
            }else{
                attempts--;
                JOptionPane.showMessageDialog(null, "Passwords do not Match", "Error!", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "You Have: \"" + attempts + "\" remaining", "Attempts Remaining!", JOptionPane.WARNING_MESSAGE);
            }
            if(attempts == 0){
                JOptionPane.showMessageDialog(null, "Access Denied", "Failed!", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
       
    }
}