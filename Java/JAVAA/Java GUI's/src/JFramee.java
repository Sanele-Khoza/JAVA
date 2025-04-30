import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFramee {

	public static void main(String[] args) {
		
		//JFrame frame = new JFrame();
		
		/*
		 * frame.setTitle("First JFrame");//set title of frame
		 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of
		 * application when closing frame.setResizable(false);//prevent frame from
		 * being resized frame.setSize(420, 420);//x and y dimension
		 * frame.setVisible(true);//make frame visible
		 * 
		 * ImageIcon image = new ImageIcon("visualhunter-d10fe97fec.png");//create an
		 * ImageIcon instance frame.setIconImage(image.getImage());//change icon of
		 * image //frame.getContentPane().setBackground(Color.blue);//change background
		 * color //or //frame.getContentPane().setBackground(new Color(143, 34, 250));
		 * //or frame.getContentPane().setBackground(new Color(0x123456));
		 */
		
		new MyFrame(); //if you wont make any changes
		
		MyFrame myFrame = new MyFrame();
	}

}
