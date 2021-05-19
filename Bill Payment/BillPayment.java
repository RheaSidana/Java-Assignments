/*
Implement the class Bill based on the class diagram and description given below.

class Bill
Class Variable : counter : int //static
Instance Variable : 	billId : String 
 						paymentMode : String 
Methods :	Bill(paymentMode:String)
			getBillId() : String 
			setBilllId(billId:String ): void 
			getPaymentMode() : String 
			setPaymentMode(paymentMode:String ): void
			getCounter() : int //static 
			

Method Description
Bill(String paymentMode)
Initialize the paymentMode instance variable with the value passed to the parameter. 
Generate the billId using counter. 
The value of billId should start from 'B9001' and 
the numerical part should be incremented by 1 for the subsequent values. 
Initialize the counter in static block.

Implement the appropriate getter and setter methods.

Test the functionalities using the provided Tester class. Create two or more Bill objects and validate that the billId is being generated properly.

Sample Input and Output
For constructor
Input : Object1   :   paymentMode : Debit Card
		Object2   :   paymentMode : PayPal
Output:
Bill Details
Bill Id: B9001
Payment method: DebitCard

Bill Details
Bill Id: B9002
Payment method: PayPal

*/

//package Assignments;

class Bill{
    //Implement your code here
    private static int counter;
    private String billId;
    private String paymentMode;
    static{
        //init counter
        counter=9000;
    }
    
    public Bill(){}
    public Bill(String paymentMode){
        this.paymentMode=paymentMode;
        counter++;
        this.billId="B"+String.valueOf(counter);
    }
    
    //getter and setter of billId
    public String getBillId(){
        return this.billId;
    }
    public void setBillId(String billId){
        this.billId=billId;
    }
    
    //getter and setter of paymentMode
    public String getPaymentMode(){
        return this.paymentMode;
    }
    public void setPaymentMode(String paymentMode){
        this.paymentMode=paymentMode;
    }
    
    public static int getCounter(){
        return counter;
    }
}

public class BillPayment {
	public static void main(String[] args) {

        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");
        
        //Create more objects and add them to the bills array for testing your code
              
        Bill[] bills = { bill1, bill2 };
              
        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
       }
    }
}
