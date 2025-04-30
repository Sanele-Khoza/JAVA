/**1. Khoza SR 202056687
 * 2. Seoloana RD 202330079
 * 3. Pako TS 202221238
 * 4. Ramphadi KM 24003626
 * 5. Thekwane MA 20234575
 * */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Shape{
	public void draw(Graphics graphics) {
		System.out.println("Drawing a shape");//impl that can be  overwritten by any subclasses
	}
}

//Circle Class
class Circle extends Shape{
	@Override //if there is a mistake the compiler will show an error and it is easier to detect bug without @Override java will treat it as a new method
	public void draw(Graphics graphics) {
		//Draw a Circle
		graphics.drawOval(100, 100, 100, 100);
	}
}
//Rectangle Class
class Rectangle extends Shape{
	@Override
	public void draw(Graphics graphics){
		//Draw a Rectangle
		graphics.drawRect(100, 100, 150, 100);
		
	}
}
//Triangle shape
class Triangle extends Shape{
	@Override
	public void draw(Graphics graphics){
		//Draw a Triangle
		int[] xPoints = {125, 100, 150};
		int[] yPoints = {100, 150, 150};
		graphics.drawPolygon(xPoints, yPoints, 3);
	}
}

//This is a Drawing Panel class
class DrawingPanel extends JPanel{
	private Shape shape; //This is the current shape
	
	public void setShape(Shape shape) {
		this.shape = shape;
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		if(shape != null) {
			shape.draw(graphics); //Call the draw() method of the specific shape
		}
	}
}

public class DrawingApplication {

	public static void main(String[] args) {
		//Create the main application
		JFrame frame = new JFrame("Drawing Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//To ectually close 
		
		//Create a drawing Panel 
		DrawingPanel drawingPanel = new DrawingPanel();
		frame.add(drawingPanel, BorderLayout.CENTER);
		
		//Create a button
		JPanel buttonPanel = new JPanel();
		JButton circleButton = new JButton("Circle");
		JButton rectangleButton = new JButton("Rectangle");
		JButton triangleButton = new JButton("Triangle");
		
		//Add action listers to buttons
		circleButton.addActionListener(e -> drawingPanel.setShape(new Circle()));
		rectangleButton.addActionListener(e -> drawingPanel.setShape(new Rectangle()));
		triangleButton.addActionListener(e -> drawingPanel.setShape(new Triangle()));
		
		//Add the buttons to the button Panel
		buttonPanel.add(circleButton);
		buttonPanel.add(rectangleButton);
		buttonPanel.add(triangleButton);

		//add the button panel to the bottom of the frame
		frame.add(buttonPanel, BorderLayout.SOUTH);
		
		//Set the size of the frame
		frame.setSize(500, 500);
		//Show the JFrame window
		frame.setVisible(true);
	}

}
