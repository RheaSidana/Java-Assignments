/*
The Metro Bank provides various types of loans such as 
car loans, business loans and house loans to its account holders, i.e., customers.

Implement a program to determine the eligible loan amount and 
the EMI that the bank can provide to its customers based on 
their salary and the loan type they expect to avail.

The values required for determining the eligible loan amount and the EMI are:
account number of the customer
account balance of the customer
salary of the customer
loan type 
expected loan amount
expected no. of EMIs

The following validations should be performed:
The account number should be of 4 digits and its first digit should be 1
The customer should have a minimum balance of $1000 in the account
Display appropriate error messages if the validations fail.
If the validations pass, determine whether the bank would provide the loan or not. 

The bank would provide the loan, 
only if the loan amount and 
the number of EMIs expected by the customer is 
less than or equal to the loan amount and 
the number of EMIs decided by the bank respectively. 

The bank decides the eligible loan amount and 
the number of EMIs based on the below table.

SALARY  || LOAN TYPE  || ELIGIBLE LOAN AMOUNT || NO. OF EMI'S
>25000		CAR				500000					36
>50000		HOUSE			6000000					60
>70000		BUSINESS		7500000					84

Display the account number, eligible and requested loan amount 
and the number of EMIs if the bank provides the loan.

Display an appropriate message if the bank does not provide the loan.

Sample Input and Output
AccountNo=1001
salary=40000
AccountBalance=250000
LoanType=Car
LoanAmountExpected=300000
emisExpected=30

Output:
eligibleLoanAmount==500000
eligibleEMIs=36

 
*/

//package Assignments;

class Bank{
	//account number of the customer
	private int accountNo[];
	//account balance of the customer
	private double accountBalance;
	
	//getter and setter of account number 
	public int[] getAccountNo(){
		return this.accountNo;
	}
	public void setAccountNo(int[] accountNo){
		this.accountNo=accountNo;
	}
	
	//getter and setter of account balance
	public double getAccountBalance(){
		return this.accountBalance;
	}
	public void setAccountBalance(double accountBalance){
		this.accountBalance=accountBalance;
	}
	
}

enum LoanType{
	CAR ,HOUSE , BUSINESS 
}

class Loan{
	//loan type
	private LoanType loanType;
	//loan amount
	private double loanAmount;
	//no. of EMIs
	private int loanEmi;
	
	//getter and setter of loan type
	public LoanType getLoanType(){
		return this.loanType;
	}
	public void setLoanType(LoanType loanType){
		this.loanType=loanType;
	}
	
	//getter and setter of loan amount
	public double getLoanAmount(){
		return this.loanAmount;
	}
	public void setLoanAmount(double loanAmount){
		this.loanAmount=loanAmount;
	}
	
	//getter and setter of loan emi
	public int getLoanEmi(){
		return this.loanEmi;
	}
	public void setLoanEmi(int loanEmi){
		this.loanEmi=loanEmi;
	}
	
}

public class BankLoan {
	//person's account no and account balance 
	private Bank bankDetails;
	//salary of the customer
	private double salary;
	//eligible loan amount, type and emi
	private Loan eligibleLoan;
	//loan status 
	private String loanStatus;
	
	//getter and setter for Bank Details 
	public Bank getBankDetails(){
		return this.bankDetails;
	}
	public void setBankDetails(Bank bankDetails){
		this.bankDetails=bankDetails;
	}
	
	//getter and setter of salary
	public double getSalary(){
		return this.salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	
	void loanStatusAssignment(boolean response){
		if(response==true) this.loanStatus="APPROVED";
		else this.loanStatus="DENIED";
	}
	
	//validate bank details 
	public void validateBankDetails(){
		boolean response=false;
		int[] bankAccountNo=this.bankDetails.getAccountNo();
		double bankAccountBalance=this.bankDetails.getAccountBalance();
		if(bankAccountNo.length==4 && bankAccountNo[0]==1 && bankAccountBalance>=1000){
			response=true;
		}
		loanStatusAssignment(response);
	}
	
	//assign values to eligible Loan 
	void eligibleLoanAssignment(LoanType loanType){
		if(loanType==LoanType.CAR){
			this.eligibleLoan.setLoanType(LoanType.CAR);
			this.eligibleLoan.setLoanAmount(500000);
			this.eligibleLoan.setLoanEmi(36);
		}
		else if(loanType==LoanType.HOUSE){
			this.eligibleLoan.setLoanType(LoanType.HOUSE);
			this.eligibleLoan.setLoanAmount(6000000);
			this.eligibleLoan.setLoanEmi(60);
		}
		else if(loanType==LoanType.BUSINESS){
			this.eligibleLoan.setLoanType(LoanType.BUSINESS);
			this.eligibleLoan.setLoanAmount(7500000);
			this.eligibleLoan.setLoanEmi(84);
		}
	}
	
	//compare whether the person is eligible for the desired loan 
	public void compareExpectedLoan(Loan expectedLoan){
		boolean response=false;
		//if correct account number then checks for loan assignment 
		if(loanStatus.equals("APPROVED")){
			this.eligibleLoan=new Loan();
			if(expectedLoan.getLoanType()==LoanType.CAR && this.salary>25000 && this.salary<=50000){
					eligibleLoanAssignment(expectedLoan.getLoanType());
					if(expectedLoan.getLoanAmount()<=this.eligibleLoan.getLoanAmount() && expectedLoan.getLoanEmi()<=this.eligibleLoan.getLoanEmi()){
						response=true;
					}
			}
			else if(expectedLoan.getLoanType()==LoanType.HOUSE && this.salary>50000 && this.salary<=70000){
					eligibleLoanAssignment(expectedLoan.getLoanType());
					if(expectedLoan.getLoanAmount()<=this.eligibleLoan.getLoanAmount() && expectedLoan.getLoanEmi()<=this.eligibleLoan.getLoanEmi()){
						response=true;
					}
			} 
			else if(expectedLoan.getLoanType()==LoanType.BUSINESS && this.salary>70000){
					eligibleLoanAssignment(expectedLoan.getLoanType());
					if(expectedLoan.getLoanAmount()<=this.eligibleLoan.getLoanAmount() && expectedLoan.getLoanEmi()<=this.eligibleLoan.getLoanEmi()){
						response=true;
					}
			}
		}
		loanStatusAssignment(response);
	}
	
	public void displayBankLoanDetails(Loan expectedLoan){
		int[] bankAccountNo=this.bankDetails.getAccountNo();
		System.out.println("The following are the details :");
		System.out.print("Account Number : ");
		for(int i=0;i<bankAccountNo.length;i++){
			System.out.print(bankAccountNo[i]);
		}
		System.out.println("\nAccount Balance : "+this.bankDetails.getAccountBalance());
		System.out.println("Salary : "+this.salary);
		System.out.println("Loan Type (expected): "+expectedLoan.getLoanType());
		System.out.println("Loan Amount (expected): "+expectedLoan.getLoanAmount());
		System.out.println("Loan EMI (expected): "+expectedLoan.getLoanEmi());
		if(loanStatus.equals("APPROVED")){
			System.out.println("\nLoan Amount (eligible): "+this.eligibleLoan.getLoanAmount());
			System.out.println("Loan EMI (eligible): "+this.eligibleLoan.getLoanEmi());
			System.out.println("\n   ... LOAN APPROVED ...");
		}
		else{
			System.out.println("\n   ... LOAN DENIED ...");
			System.out.println("Reason can be : ");
			System.out.println("1.Incorrect Bank Account Number : should be 4 digit number starting with 1");
			System.out.println("2.Insufficient Bank Balance : should be greater or equal to 1000");
			System.out.println("3.Incorrect Bank Loan Amount Expected ");
			System.out.println("4.Incorrect Bank Loan EMI Expected");
			System.out.println("5.Insufficient Salary");
			System.out.println("6.Incorrect Bank Loan Type Expected");
		}
	}
	
	public static void main(String[] args){
		BankLoan bankLoan = new BankLoan();
		Bank bankAccount = new Bank();
		Loan expectedLoan = new Loan();
		int[] bankAccountNumber={1,0,0,1};
		
		bankAccount.setAccountNo(bankAccountNumber);
		bankAccount.setAccountBalance(250000);
		
		bankLoan.setBankDetails(bankAccount);
		bankLoan.setSalary(40000);
		
		expectedLoan.setLoanType(LoanType.CAR);
		expectedLoan.setLoanAmount(300000);
		expectedLoan.setLoanEmi(30);
		
		bankLoan.validateBankDetails();
		bankLoan.compareExpectedLoan(expectedLoan);
		bankLoan.displayBankLoanDetails(expectedLoan);
		
		
		//case 2
		System.out.println("\n");
		
		bankAccount.setAccountNo(bankAccountNumber);
		//insufficient bank account balance 
		bankAccount.setAccountBalance(500);
		
		bankLoan.setBankDetails(bankAccount);
		bankLoan.setSalary(40000);
		
		expectedLoan.setLoanType(LoanType.CAR);
		expectedLoan.setLoanAmount(300000);
		expectedLoan.setLoanEmi(30);
		
		bankLoan.validateBankDetails();
		bankLoan.compareExpectedLoan(expectedLoan);
		bankLoan.displayBankLoanDetails(expectedLoan);
		
		//case 3
		System.out.println("\n");
		int[] bankAccountNumber1 ={2,0,2,1};
		
		//incorrect bank account
		bankAccount.setAccountNo(bankAccountNumber1);
		bankAccount.setAccountBalance(250000);
		
		bankLoan.setBankDetails(bankAccount);
		bankLoan.setSalary(40000);
		
		expectedLoan.setLoanType(LoanType.CAR);
		expectedLoan.setLoanAmount(300000);
		expectedLoan.setLoanEmi(30);
		
		bankLoan.validateBankDetails();
		bankLoan.compareExpectedLoan(expectedLoan);
		bankLoan.displayBankLoanDetails(expectedLoan);
		
		//case 4
		System.out.println("\n");
		bankAccount.setAccountNo(bankAccountNumber);
		bankAccount.setAccountBalance(250000);
		
		bankLoan.setBankDetails(bankAccount);
		//insufficient salary 
		bankLoan.setSalary(24000);
		
		expectedLoan.setLoanType(LoanType.CAR);
		expectedLoan.setLoanAmount(300000);
		expectedLoan.setLoanEmi(30);
		
		bankLoan.validateBankDetails();
		bankLoan.compareExpectedLoan(expectedLoan);
		bankLoan.displayBankLoanDetails(expectedLoan);
		
		//case 5
		System.out.println("\n");
		bankAccount.setAccountNo(bankAccountNumber);
		bankAccount.setAccountBalance(250000);
		
		bankLoan.setBankDetails(bankAccount);
		bankLoan.setSalary(40000);
		
		expectedLoan.setLoanType(LoanType.CAR);
		//loan amount expected is greater 
		expectedLoan.setLoanAmount(600000);
		expectedLoan.setLoanEmi(30);
		
		bankLoan.validateBankDetails();
		bankLoan.compareExpectedLoan(expectedLoan);
		bankLoan.displayBankLoanDetails(expectedLoan);
		
		//case 6
		System.out.println("\n");
		bankAccount.setAccountNo(bankAccountNumber);
		bankAccount.setAccountBalance(250000);
		
		bankLoan.setBankDetails(bankAccount);
		bankLoan.setSalary(40000);
		
		expectedLoan.setLoanType(LoanType.CAR);
		expectedLoan.setLoanAmount(300000);
		//Loan emi expected is greater
		expectedLoan.setLoanEmi(38);
		
		bankLoan.validateBankDetails();
		bankLoan.compareExpectedLoan(expectedLoan);
		bankLoan.displayBankLoanDetails(expectedLoan);
		
		//case 7 
		System.out.println("\n");
		bankAccount.setAccountNo(bankAccountNumber);
		bankAccount.setAccountBalance(250000);
		
		bankLoan.setBankDetails(bankAccount);
		bankLoan.setSalary(40000);
		
		//expected loan type is incorrect
		expectedLoan.setLoanType(LoanType.HOUSE);
		expectedLoan.setLoanAmount(300000);
		expectedLoan.setLoanEmi(38);
		
		bankLoan.validateBankDetails();
		bankLoan.compareExpectedLoan(expectedLoan);
		bankLoan.displayBankLoanDetails(expectedLoan);
	}
}
