/*
Anchor College offers both graduate and postgraduate programs. 
The college stores the names of the students, their test scores and 
the final result for each student. 
Each student has to take 4 tests in total. 
You need to create an application for the college by 
implementing the classes based on the class diagram and 
description given below.

class Student 
Instance variable : studentName : String 
 					testScores : int[]
 					testResult : String 
Methods:	Student(studentName : String)
			generateResult() : void 
			setTesScore(testNumber : int,testScore: int) : void 
			getter and setter of rest of the variables

class UndergraduateStudent
Methods:	UndergraduateStudent(studentName : String)
			generateResult() : void
			
class GraduateStudent
Methods:	GraduateStudent(studentName : String)
			generateResult() : void
			
Method Description
Student
Student(String studentName)
Initialize the instance variable studentName with the value passed 
to the constructor and other instance variables to the default values.

setTestScore(int testNumber, int testScore)
Set the value of the testScore in the appropriate position of 
testScores array based on the testNumber.
Implement the getter and setter methods appropriately.

UndergraduateStudent
UndergraduateStudent(String studentName)
Initialize the instance variable studentName with the value passed 
to the constructor and other instance variables to the default values.

generateResult()
Implement the abstract method of Student class by setting the value 
of testResult based on the below details.                                                                                                                                                                              
 
AverageScore || Result
>=60			Pass
<60				Fail

GraduateStudent
GraduateStudent(String studentName)
Initialize the instance variable studentName with the value passed 
to the constructor and other instance variables to the default values.

generateResult()
Implement the abstract method of Student class by setting the value 
of testResult based on the below details. 

AverageScore || Result
>=70			Pass
<70				Fail

Test the functionalities using the provided Tester class.

Sample Input and Output
For UndergraduateStudent
Input
UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
        
For GraduateStudent
Input
GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
        
Output:
Student name: Philip
Result: Pass

Student name: Jerry
Result : Fail

*/

//package Assignments;

abstract class CStudent{
    //Implement your code here
    private String studentName;
    private int[] testScores;
    private String testResult;
    
    public CStudent(String studentName){
        this.studentName=studentName;
        testScores=new int[4];
        testResult="";
    }
    
    abstract public void generateResult();
    
    //setter and getter of testScore
    public void setTestScore(int testNumber,int testScore){
        this.testScores[testNumber]=testScore;
    }
    public int[] getTestScores(){
        return this.testScores;
    }
    
    //getter and setter of studentName
    public String getStudentName(){
        return this.studentName;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    
    //getter and setter of testResult
    public String getTestResult(){
        return this.testResult;
    }
    public void setTestResult(String testResult){
        this.testResult=testResult;
    }
}

class UndergraduateStudent extends CStudent{
    //Implment your code here
    public UndergraduateStudent(String studentName){
        super(studentName);
    }
    
    public void generateResult(){
        int avgScore=0;
        int[] tests=getTestScores();
        for(int i=0;i<4;i++){
            avgScore+=tests[i];
        }
        avgScore/=4;
        if(avgScore>=60){
            this.setTestResult("Pass");
        }
        else this.setTestResult("Fail");
    }
}

class GraduateStudent extends CStudent{
    //Implment your code here
    public GraduateStudent(String studentName){
        super(studentName);
    }
    
    public void generateResult(){
        int avgScore=0;
        int[] tests=getTestScores();
        for(int i=0;i<4;i++){
            avgScore+=tests[i];
        }
        avgScore/=4;
        if(avgScore>=70){
            this.setTestResult("Pass");
        }
        else this.setTestResult("Fail");
    }
}

public class CollegeStudents {
	public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
    }
}
