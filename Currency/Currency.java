/*
You have x number of $5 notes and 
y number of $1 notes. 
You want to purchase an item for amount z. 


The shopkeeper wants you to provide exact change. 
You want to pay using a minimum number of notes. 
How many $5 notes and $1 notes will you use?

Implement a program to find out how many $5 notes 
and $1 notes will be used. 

If an exact change is not possible, 
then display -1.

Sample Input and Output
Input  :  $1=2,  $5=4,  PurchaseAmount=21	
Output :  $1=1,  $5=4

Input  :  $1=3,  $5=3,  PurchaseAmount=19	
Output :  -1
*/

//package Assignments;

class Note{
	public int countOfNote1;
	public int countOfNote5;
	public int purchaseAmount;
	
	public void displayMinimumNotesRequiredForPurchase(){
		int notes1,notes5,rem;
		int purchase=this.purchaseAmount;
		System.out.println("Numer of $1 Notes : "+this.countOfNote1);
		System.out.println("Numer of $5 Notes : "+this.countOfNote5);
		System.out.println("Purchase : "+this.purchaseAmount);
		
		notes5=purchase/5;
		if(notes5>this.countOfNote5){
			rem=notes5-this.countOfNote5;
			notes5=this.countOfNote5;
			purchase = purchase%5 + rem*5;
		}
		else
		purchase = purchase%5;
		
		notes1=purchase;
		if(notes1>this.countOfNote1){
			rem=notes1-this.countOfNote1;
			notes1=this.countOfNote1;
			purchase = rem;
		}
		else purchase=0;
		if(purchase==0){
			System.out.println("\nRequired number of notes to pay : ");
			System.out.println("Numer of $1 Notes : "+notes1);
			System.out.println("Numer of $5 Notes : "+notes5);
		}
		else if(purchase!=0){
			System.out.println("-1");
		}
	}
}

public class Currency {
	public static void main(String[] args){
		Note currencyNotes = new Note();
		
		currencyNotes.countOfNote1=2;
		currencyNotes.countOfNote5=5;
		currencyNotes.purchaseAmount=21;
		currencyNotes.displayMinimumNotesRequiredForPurchase();
		
		System.out.println("\n");
		
		//case 2
		currencyNotes.countOfNote1=2;
		currencyNotes.countOfNote5=5;
		//need more currency notes to pay the amount 
		currencyNotes.purchaseAmount=29;
		currencyNotes.displayMinimumNotesRequiredForPurchase();
		
		System.out.println("\n");
		
		//case 3
		currencyNotes.countOfNote1=5;
		currencyNotes.countOfNote5=3;
		currencyNotes.purchaseAmount=20;
		currencyNotes.displayMinimumNotesRequiredForPurchase();
	}
}
