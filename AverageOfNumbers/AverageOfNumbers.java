/*
Implement a class Calculator with the method mentioned below. 
Method: findAverage(int number1,int number2,int number3) : double

Method Description
findAverage()
Calculate the average of three numbers
Return the average rounded off to two decimal digits
Test the functionalities using the provided Tester class. 

Sample Input and Output
Input: 12,8,15		Output:11.67
Input: 10,20,30		Output:20.0

*/

//package Assignments;

class Calculators {
	public double findAverage(int number1,int number2,int number3){
	    double avg=(((double)number1+(double)number2+(double)number3)/3);
	    avg=(double)Math.round(avg*100.0)/100.0;
	    return avg;
	}
}

public class AverageOfNumbers {
	public static void main(String args[]) {
		Calculators calculator = new Calculators();
		// Invoke the method findAverage of the Calculator class and display the average
		int a=12,b=8,c=15;
		double average=calculator.findAverage(a,b,c);
		System.out.println("Numbers : "+a+","+b+","+c+"\tAverage : "+average);
		
		System.out.println("");
		
		//case 2
		a=10;b=20;c=30;
		average=calculator.findAverage(a,b,c);
		System.out.println("Numbers : "+a+","+b+","+c+"\tAverage : "+average);
		
	}
}
