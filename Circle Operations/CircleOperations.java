/*
Implement the following class based on the class diagram and 
description given below.

class Circle 
Instance Variables : 	double PI=3.14
						double diameter
						double area
    					double circumference
Method :	Circle(double diameter)
			calculateCircumference()
			calculateArea()
			getPI()
			getter and setter of the rest of the instance variables 
			
Method Description
Circle(double diameter)
Initialize the instance variable diameter with the 
value passed to the constructor.

calculateCircumference()
Calculate and set the circumference of the circle 
using the formula given below.
circumference = PI*d, where d is the diameter

calculateArea()
Calculate and set the area of the circle using the 
formula given below.
area=PI*r2, where r is the radius 

Note: PI is a final variable.
Implement the getter and setter methods appropriately.

Test the functionalities using the provided Tester class. 

Sample Input and Output
Input : diameter 10.2
		diameter 5.7

Output : 
Diameter of the circle is 10.2
Circumference of the circle is 32.03
Area of the circle is 81.67

Diameter of the circle is 5.7
Circumference of the circle is 17.9
Area of the circle is 25.5
*/

//package Assignments;

class Circle{
    //Implement your code here
    private final double PI=3.14;
    private double diameter;
    private double area;
    private double circumference;
    
    public Circle(double diameter){
        this.diameter=diameter;
    }
    
    public void calculateCircumference(){
        this.circumference=PI*this.diameter;
    }
    
    public void calculateArea(){
        double r=this.diameter/2;
        this.area=PI*r*r;
    }
    
    //getter of PI
    public double getPI(){
        return this.PI;
    }
    
    //getter and setter of diameter
    public double getDiameter(){
        return this.diameter;
    }
    public void setDiameter(double diameter){
        this.diameter=diameter;
    }
    
    //getter and setter of area
    public double getArea(){
        return this.area;
    }
    public void setArea(double area){
        this.area=area;
    }
    
    //getter and setter of perimeter
    public double getCircumference(){
        return this.circumference;
    }
    public void setCircumference(double circumference){
        this.circumference=circumference;
    }
}

public class CircleOperations {
	public static void main(String[] args) {
        
        Circle circle1 = new Circle(10.2);
        Circle circle2 = new Circle(5.7);
        Circle circle3 = new Circle(12.2);
        Circle circle4 = new Circle(33.2);

        //Create more objects of Circle class and add to the array given below for testing your code    
        Circle[] circles = {circle1, circle2,circle3,circle4};
            
        for (Circle circle : circles) {
                  
            circle.calculateCircumference();
            circle.calculateArea();
                  
            System.out.println("Diameter of the circle is "+circle.getDiameter());
            System.out.println("Circumference of the circle is " + Math.round(circle.getCircumference()*100)/100.0);
            System.out.println("Area of the circle is " + Math.round(circle.getArea()*100)/100.0);
            System.out.println();
        }           
    }
}
