/*
 * Data Types and Operators 
 * 
Implement a program to find the area of a circle by using the formula given below and 
display the calculated area. 

Area = pi*radius*radius 
The value of pi is 3.14.

Sample Input and Output
radius=4    area=50.24
radius=10    area=314.0
 */

//package Assignments;

public class Area {
	final double pi=3.14;
	double area,radius;
	//set the value of Radius of the circle 
	void setRadius(double radius){
		this.radius=radius;
	}
	//calculate the area of the circle 
	void calculateArea(){
		area=pi*radius*radius;
	}
	//get  the value of the area of the circle 
	double getArea(){
		return this.area;
	}
	
	//main function to execute the program 
	public static void main(String[] args) {
		 double radius;
		 Area circleArea = new Area();
		 
		 radius=4;
		 circleArea.setRadius(radius);
		 circleArea.calculateArea();
		 System.out.println("Area of the Circle 1 : "+circleArea.getArea());
		 
		 radius=10;
		 circleArea.setRadius(radius);
		 circleArea.calculateArea();
		 System.out.println("Area of the Circle 2 : "+circleArea.getArea());
	}
}
