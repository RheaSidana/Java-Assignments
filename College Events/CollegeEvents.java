/*
A college cultural event "Show Your Talent" is being conducted and 
the organizing committee has decided to open online registration 
for the same. 
The students can participate in solo events as well as team events. 
You need to develop an application for the online registration by 
implementing the classes based on the class diagram and description 
given below.

class Event :
Instance Variables :	String eventName
						String participantName
						double registrationFee
Methods : 	Event(String eventName, String participantName)
			void registerEvent()
			getter and setter of instance variables
			
class SoloEvent
Instance Variables :	int participantNo
Methods :	SoloEvent(String eventName, String participantName, int participantNo)
			void registerEvent()
			getter and setter of instance variables
			
class TeamEvent
Instance Variables :	int noOfParticipants
						int teamNo
Methods : 	TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo)
			void registerEvent()
			getter and setter of instance variables
			
Method Description
Event 
Event(String eventName, String participantName)
Initialize the instance variables eventName and 
participantName using the values passed to the constructor.

registerEvent()
Register participants for the event by setting the 
registrationFee with the help of the below table.

Events  	||    Base Fee
Singing 			8
Dancing 			10
DigitalArt 			12
Acting 				15

For any invalid event, set the registrationFee to 0.
Implement the appropriate getter and setter methods.

SoloEvent
SoloEvent(String eventName, String participantName, int participantNo)
Initialize the instance variables eventName, participantName 
and participantNo using the values passed to the constructor.

registerEvent()
Register participants for the event by setting the registrationFee 
with the help of the parent class method.
Implement the appropriate getter and setter methods.

TeamEvent
TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo)
Initialize the instance variables eventName, participantName, 
noOfParticipants and teamNo using the values passed to the constructor.

registerEvent()
Register participants for the event by setting the registrationFee 
with the help of the below table. 
The fee given in the table is for each member. 
The registrationFee should be calculated by considering the number 
of members in the team.

Events  	||    Base Fee
Singing 			4
Dancing 			6
DigitalArt 			8
Acting 				10

For any invalid event, set the registrationFee to 0.
Implement the appropriate getter and setter methods.

Test the functionalities using the provided Tester class.

Sample Input and Output
For SoloEvent
Input	:	SoloEvent("Dancing", "Jacob", 1)

For TeamEvent
Input	:	TeamEvent("Acting", "Serena", 5, 1)


Output : 
Thank You Jacob for your participation! Your registration fee is $10.0
Your participant number is 1

Thank You Serena for your participation! Your registration fee is $10.0
Your team number is 1
*/
//package Assignments;

class Event{
    //Implement your code here
    private String eventName ;
    private String participantName;
    private double registrationFee;
    
    public Event(String eventName, String participantName){
        this.eventName=eventName;
        this.participantName=participantName;
    }
    
    public void registerEvent(){
        if(eventName.equals("Singing")){
            this.registrationFee=8;
        }
        else if(eventName.equals("Dancing")){
            this.registrationFee=10;
        }
        else if(eventName.equals("DigitalArt")){
            this.registrationFee=12;
        }
        else if(eventName.equals("Acting")){
            this.registrationFee=15;
        }
        else {
            this.registrationFee=0;
        }
    }
    
    //getter and setter of eventName
    public String getEventName(){
        return this.eventName;
    }
    public void setEventName(String eventName){
        this.eventName=eventName;
    }
    
    //getter and setter of participantName
    public String getParticipantName(){
        return this.participantName;
    }
    public void setParticipantName(String participantName){
        this.participantName=participantName;
    }
    
    //getter and setter of registrationFee
    public double getRegistrationFee(){
        return this.registrationFee;
    }
    public void setRegistrationFee(double registrationFee){
        this.registrationFee=registrationFee;
    }
}

class SoloEvent extends Event{
    //Implement your code here
    private int participantNo;
    
    public SoloEvent(String eventName, String participantName, int participantNo){
        super(eventName,participantName);
        this.participantNo=participantNo;
    }
    
    public void registerEvent(){
        super.registerEvent();
    }
    
    //getter and setter of participantNo
    public int getParticipantNo(){
        return this.participantNo;
    }
    public void setParticipantNo(int participantNo){
        this.participantNo=participantNo;
    }
}

class TeamEvent extends Event{
    //Implement your code here
    private int noOfParticipants;
    private int teamNo;
    
    public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo){
        super(eventName,participantName);
        this.noOfParticipants=noOfParticipants;
        this.teamNo=teamNo;
    }
    
    public void registerEvent(){
        String event=super.getEventName();
        if(event.equals("Singing")){
            super.setRegistrationFee(4);
        }
        else if(event.equals("Dancing")){
            super.setRegistrationFee(6);
        }
        else if(event.equals("DigitalArt")){
            super.setRegistrationFee(8);
        }
        else if(event.equals("Acting")){
            super.setRegistrationFee(10);
        }
        else {
            super.setRegistrationFee(0);
        }
    }
    
    //getter and setter of noOfParticipants
    public int getNoOfParticipants(){
        return this.noOfParticipants;
    }
    public void setNoOfParticipants(int noOfParticipants){
        this.noOfParticipants=noOfParticipants;
    }
    
    //getter and setter of teamNo
    public int getTeamNo(){
        return this.teamNo;
    }
    public void setTeamNo(int teamNo){
        this.teamNo=teamNo;
    }
}

public class CollegeEvents {
	public static void main(String[] args) {
        
        SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
		soloEvent.registerEvent();
		if (soloEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + soloEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
			System.out.println("Your participant number is " + soloEvent.getParticipantNo());

		} else {
			System.out.println("Please enter a valid event");
		}

		System.out.println();
		TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
		teamEvent.registerEvent();
		if (teamEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + teamEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
			System.out.println("Your team number is " + teamEvent.getTeamNo());
		} else {
			System.out.println("Please enter a valid event");
		}
		
		System.out.println();
		teamEvent = new TeamEvent("Singing", "Tom", 5, 100);
		teamEvent.registerEvent();
		if (teamEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + teamEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
			System.out.println("Your team number is " + teamEvent.getTeamNo());
		} else {
			System.out.println("Please enter a valid event");
		}
	}
}
