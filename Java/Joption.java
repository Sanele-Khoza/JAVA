import javax.swing.JOptionPane;

public class Joption {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null, "What is your Name");
        JOptionPane.showMessageDialog(null, "Hello" + result + "!");
    }
}
