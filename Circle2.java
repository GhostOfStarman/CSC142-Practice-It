package prac.circle;

import java.util.*;
import java.io.*;
import java.awt.*; 


//named Circle2 b/c this is the second draft
public class Circle2 {

	private Point center;
	private int radius;
	private int x;
	private int y;
	
	public static void main(String[] args) {
		
		
		Circle2 circ1 = new Circle2(new Point(4,9),6);
		
		System.out.println(circ1.getCenter());

	}

	
	//only constructor needed
	public Circle2(Point center, int radius) {

		this.center = center;
		this.radius = radius;
		
	}
	
	//returns the center point
	public Point getCenter() {
		
		return center;
	}
	
	//returns radius
	public int getRadius() {
		
		return radius;
	}
	
	//returns area of circle
	public double getArea() {
		
		double area = Math.PI * radius * radius;
		
		return area;
	}
	
	public double getCircumference() {
		
		double circ = 2*Math.PI*radius;
		
		return circ;
		
	}
	
	
	//returns center coordinates and radius
	public String toString() {
		
		String circString = "Circle[center=(" + this.center.x +", " + this.center.y + "),radius=" + this.getRadius() +"]";
		
		return circString;
	}
	
	
	//uses DrawingPanel to draw the circle
	public Graphics draw(Graphics g) {
		
		DrawingPanel panel = new DrawingPanel(this.radius*2,this.radius*2);
		
		Graphics draw = panel.getGraphics();
		
		draw.drawOval(x+ center.x, y+ center.y,this.radius*2,this.radius*2);
		
		return draw;
		
	}
	
	
	//method uses pythagorean formula to determine the distance between a point and the center point, compare to radius(squared) 
	//determine if the point is inside the circle or not
	public boolean contains(Point p)
	{
		int x_p = p.x;
		int y_p = p.y;
		int x_c = center.x;
		int y_c = center.y;
		
		int d_2 = ((x_p-x_c)*(x_p-x_c)) + ((y_p-y_c)*(y_p-y_c));
		
		int r_2 = radius*radius;
		
		if(r_2 > d_2) {
			
			return true;
			
		}
        
        else if(r_2 == d_2){
            
            return true;
        }
		
		return false;
	
	}
}