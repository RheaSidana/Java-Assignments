/*
Find and return the average salary, 
number of salaries greater than the average salary and 
number of salaries lesser than the average salary 
from the salary array passed to the findDetails() method. 
Return a double array containing average salary in index position 0, 
number of salaries greater than the average salary in index position 1 and 
number of salaries lesser than the average salary in index position 2. 
Implement the logic inside findDetails() method.

Test the functionalities using the main method of the Tester class.

Sample Input and Output
Input  :{ 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 }
Output : 
Average salary: 23914.0
Number of salaries greater than the average salary: 2.0
Number of salaries lesser than the average salary: 0.0

*/

//package Assignments;

public class AverageSalary {
	public static double[] findDetails(double[] salary) {
        //Implement your code here and change the return value accordingly
        double resp[]= new double [3];
        double sum=0;
        int i=0;
        while(salary.length>i){
            sum+=salary[i];
            i++;
        }
        sum=(sum)/salary.length;
        resp[0]=sum;
        resp[1]=0;resp[2]=0;
        i=0;
        while(salary.length>i){
            if(salary[i]>sum){
                resp[1]++;
            }
            else if(salary[i]<sum){
                resp[2]++;
            }
            i++;
        }
        
        return resp;     

    }
	
	public static void displayArray(double[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
        System.out.print("Salary array : ");
        displayArray(salary);
        System.out.println("\n\nAverage salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
