import javax.swing.JOptionPane;


public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = JOptionPane.showInputDialog("Enter the first number: ");
		Double num1 = Double.parseDouble(x);
		
		String y = JOptionPane.showInputDialog("Enter the second number: ");
		Double num2 = Double.parseDouble(y);
		
		String operation = JOptionPane.showInputDialog("Choose an Operation (+,-,*,/): ");
		
		Double results = 0.0;
		boolean validoperation = true;
		
		switch(operation) {
		case "+":
			results = num1 + num2;
			break;
		case "-":
			results = num1 - num2;
			break;
		case "*":
			results = num1 * num2;
			break;
		case "/":
			if(num2 != 0) {
				results = num1 / num2;
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Undefined");
				validoperation = false;
				break;
				}
		default: 
			JOptionPane.showMessageDialog(null, "Error: Not A Valid Operator!! ");
			validoperation = false;
			break;
		}
		
		if(validoperation) {
			JOptionPane.showMessageDialog(null, results);
		}
	}

}
