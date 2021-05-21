/*
You need to develop an application for cab service providers by implementing the classes 
based on the class diagram and description given below.

class CabSeviceProvider:
Instance Variables : 	cabServiceName : String 
						totalCabs : int 
Methods :	CabServiceProvider(String cabServiceName, int totalCabs)
			calculateRewardPrice(Driver driver)
			getter and setters of instance variables
			
class Driver :
Instance Variables : 	driverName : String
 						averageRating : float
Methods : 	Driver(String driverName, float averageRating)
			override toString()
			getter and setters of instance variables


Note: Driver class is provided to you.

Method Description
CabServiceProvider
CabServiceProvider(String cabServiceName, int totalCabs)
Initialize all the instance variables appropriately with the values passed to the constructor.

calculateRewardPrice(Driver driver)
Calculate and return the bonus of the driver based on the below table. If averageRating of the driver is less than 4, return the bonus as 0.
Cab Service  ||     Rating    ||   Reward Amount 
Halo 			>=4.5 to <=5	    rating * 10
				>=4 to <=4.5 	    rating * 5
Aber 			>=4.5 to <=5	    rating * 8
				>=4 to <=4.5	    rating * 3

In case of any invalid value, return the bonus as 0. 
Note: Round off the bonus to 2 decimal digits.
Implement the appropriate getter and setter methods.
Perform case-sensitive comparison wherever applicable.
Test the functionalities using the provided Tester class. 

Sample Input and Output
Input
For CabServiceProvider object cabServiceProvider1 with
cabServiceName = Halo and 
totalCabs = 50

Driver object - driver1
driverName = Luke 
avergaeRatings = 4.8f

Driver object - driver2
driverName = Mark
avergaeRatings = 4.2f

Driver object - driver3
driverName = David 
avergaeRatings = 3.9f

Output:
Driver Name: Luke
Bonus: $48.0

Driver Name: Mark
Bonus: $21.0

Driver Name: David
Sorry, bonus is not available!

*/

//package Assignments;

class CabServiceProvider{
    //Implement your code here
    private String cabServiceName;
    private int totalCabs;
    
    //constructor
    public CabServiceProvider(){}
    public CabServiceProvider(String cabServiceName, int totalCabs){
        this.cabServiceName=cabServiceName;
        this.totalCabs=totalCabs;
    }
    
    public double calculateRewardPrice(Driver driver){
        double bonus=0;
        if(cabServiceName.equals("Halo")){
        if(driver.getAverageRating()>=4 && driver.getAverageRating()<4.5){
            bonus=(5*driver.getAverageRating());
        }
        else if(driver.getAverageRating()>=4.5 && driver.getAverageRating()<=5){
            bonus=(10*driver.getAverageRating());
        }
        }
        else if(cabServiceName.equals("Aber")){
            if(driver.getAverageRating()>=4 && driver.getAverageRating()<4.5){
               bonus=(3*driver.getAverageRating());
            }
            else if(driver.getAverageRating()>=4.5 && driver.getAverageRating()<=5){
               bonus=(8*driver.getAverageRating());
            }
        }
        bonus=(double)Math.round(bonus*100)/100;
        return bonus;
    }
    
    //getter and setter of cabServiceName
    public String getCabServiceName(){
        return this.cabServiceName;
    }
    public void setCabServiceName(String cabServiceName){
        this.cabServiceName=cabServiceName;
    }
    
    //getter and setter of totalCabs
    public int getTotalCabs(){
        return this.totalCabs;
    }
    public void setTotalCabs(int totalCabs){
        this.totalCabs=totalCabs;
    }
}

class Driver {
	
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public void setDriverName(String driverName){
		this.driverName=driverName;
	}
	
	public float getAverageRating(){
		return this.averageRating;
	}
	
	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}

public class CabDriver {
	public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);
		
		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}
		
		//Create more objects of CabServiceProvider and Driver classes for testing your code
	}
}
