import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JLabell {

	public static void main(String[] args) {
		Border border = BorderFactory.createLineBorder(Color.green,3);
		JLabel label = new JLabel();
		label.setText("Sanele is king");
		label.setForeground(new Color(0x00FF00));
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		
		JFrame frame = new JFrame();
		frame.setTitle("First JFrame");//set title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application when  closing
		frame.setSize(500, 500);//x and y dimension
		frame.setVisible(true);//make frame visible
		frame.add(label);
		
	}

}
