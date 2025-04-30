import java.util.*;

public class SuperclassAndSubclasses {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	public SuperclassAndSubclasses() {
		dateCreated = new java.util.Date();
	}
	//construct a geometric object with specified color and filled value
	public SuperclassAndSubclasses(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/*Return Color*/
	public String getColor() {
		return color;
	}
	
	/*set a new color*/
	public void setColor(String color) {
		this.color = color;
	}
	/*return filled. since filled is boolean*/
	public boolean isFilled() {
		return filled;
	}
	/*set new filled*/
	public void setFilled() {
		this.filled = filled;
	}
	public java.util.Date getDateCreated(){
		return dateCreated
				;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
