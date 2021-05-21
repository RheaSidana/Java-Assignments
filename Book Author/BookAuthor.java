/*
Implement the Book and Author classes based on the class diagram and description given below.

class Author: 
Instance Variable :	name :String 
 					email : String 
 					gender : char
Method :	Author(String name,String email,char gender)
			getter and setter of instance variable 
			

class Book : 
Instance Variable :	name : String 
					author : Author 
					price : double 
					quantity : int 
Method : 	Book(String name,Author author,double price,int quantity)
			getter and setter of instance variabes
			displayAuthorDetails() : void  

Author
Implement the getter and setter methods appropriately.

Book
Method Description
displayAuthorDetails()
Display the details of the author for the book.

Implement the getter and setter methods appropriately.

Test your code using the Tester class.

Sample Input and Output
Input
For Author object author1
Author("Joshu Bloch","joshua@email.com",'M');

For Book object book1
Book("Effective Java",author,45.0,15);

Output
Displaying author details
Author name: Joshu Bloch
Author email: joshua@email.com
Author gender: M

*/

//package Assignments;

class Author {
    //Implement your code here 
    private String name;
    private String email;
    private char gender;
    
    public Author(){}
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    
    //getter and setter of name
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    //getter and setter of email
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
    //getter and setter of gender
    public char getGender(){
        return this.gender;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
}


class Book {
    //Implement your code here 
    private String name;
    private Author author;
    private double price;
    private int quantity;
    
    public Book(){}
    public Book(String name,Author author,double price,int quantity){
        this.name=name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
    }
    
    //displayAuthorDetails
    public void displayAuthorDetails(){
        String str= "\nAuthor name: "+this.author.getName()+"\nAuthor email: "+this.author.getEmail()+"\nAuthor gender: "+Character.toString(this.author.getGender())+"\n";
        System.out.println("Displaying author details"+str);
    }
    
    //getter and setter of name 
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    //getter and setter of author
    public Author getAuthor(){
        return this.author;
    }
    public void setAuthor(Author author){
        this.author=author;
    }
    
    //getter and setter of price 
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    
    //getter and setter quantity
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}

public class BookAuthor {
	public static void main(String[] args) {
        //Implement your code here
        
        Author author = new Author("Joshu Bloch","joshua@email.com",'M');
        
        Book book = new Book("Effective Java",author,45.0,15);
        
        book.displayAuthorDetails();
    }
}
