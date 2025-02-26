import javax.swing.JOptionPane;

public class JOption2 {
    public static void main(String[] args) {
        String FirstName, LastName, Age, Gender, Occupation;
        
        FirstName = JOptionPane.showInputDialog(null, "What is your Name");
        LastName = JOptionPane.showInputDialog(null, "What is your Surname");
        Age = JOptionPane.showInputDialog(null, "What is your Age");
        Gender = JOptionPane.showInputDialog(null, "What is your Gender");
        Occupation = JOptionPane.showInputDialog(null, "What is your Occupation");
        
        JOptionPane.showMessageDialog(null, "First Name: " + FirstName + "\n" + " Last Name: " + LastName + "\n" +  " Age: " + Age + "\n" + " Gender: " + Gender + "\n" +  " Occupation: " + Occupation + "!");
    }
}
