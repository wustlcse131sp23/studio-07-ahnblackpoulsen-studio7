package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	public double area() { //rectangle already initialized
		double area = length*width;
		return area;
	}
	
	public double perimeter() {
		double perimeter = (2*length)+(2*width);
		return perimeter;
	}
	
	public boolean isSmaller(Rectangle rectangle2) {
		double area = this.area(); //whatever instance variables are right now
		double otherArea = rectangle2.area();
		if (area < otherArea)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isSquare() {
		if (length == width)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void drawRectangle() {
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.rectangle(0.5, 0.5, 0.05 * width, 0.05 * length);
	}
	
	public static void main (String[] args) {
		Rectangle R1 = new Rectangle(2, 5);
		
		double area = R1.area();
		System.out.println("The area is " + area);
		
		double perimeter = R1.perimeter();
		System.out.println("The perimeter is " + perimeter);
		
		boolean isSquare = R1.isSquare();
		System.out.println("Is this a square?: " + isSquare);
		
		R1.drawRectangle();
		
		Rectangle R2 = new Rectangle(3, 3);
		
		boolean isSmaller = R1.isSmaller(R2);
		System.out.println("Rectangle 1 is smaller: " + isSmaller);
		
	}
	
}

