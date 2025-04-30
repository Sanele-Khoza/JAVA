import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){
		
		this.setTitle("First JFrame");//set title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application when  closing
		this.setResizable(false);//prevent frame frome being resized
		this.setSize(420, 420);//x and y dimension
		this.setVisible(true);//make frame visible
		
		ImageIcon image = new ImageIcon("visualhunter-d10fe97fec.png");//create an ImageIcon instance
		this.setIconImage(image.getImage());//change icon of image
		//this.getContentPane().setBackground(new Color(143, 34, 250));
		//or
		this.getContentPane().setBackground(new Color(0x123456));
	}
}
