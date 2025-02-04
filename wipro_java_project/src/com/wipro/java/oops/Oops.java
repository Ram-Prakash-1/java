package com.wipro.java.oops;

abstract class Book {
    private String Title;
    private String Author;
    private int Price;
    
    // Constructor to initialize the book
    public Book(String Title, String Author,int Price) {
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
    }

    // Abstract method to be implemented by subclasses
    abstract void displayDetails(); // Abstract method

    // Getter methods
    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }
    
    public int getPrice() {
    	return Price;
    }
}
	class Fiction extends Book{

		public Fiction(String Title, String Author,int Price) {
			super(Title, Author,Price);
			// TODO Auto-generated constructor stub
		}

		@Override
		void displayDetails() {
			// TODO Auto-generated method stub
			System.out.println("Fiction: "+getTitle()+" By: "+getAuthor()+"price: "+getPrice());
		}
		
	}
	class NonFiction extends Book{

		public NonFiction(String bookTitle, String bookAuthor,int bookPrice) {
			super(bookTitle, bookAuthor,bookPrice);
			// TODO Auto-generated constructor stub
		}

		@Override
		void displayDetails() {
			// TODO Auto-generated method stub
			System.out.println("Non-Fiction: "+getTitle()+" By: "+getAuthor()+"price: "+getPrice());
		}
		
	}
public class Oops {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// Creating objects of subclasses Polymorphism
		// TODO Auto-generated method stub
		Book book1=new Fiction("The Great Gatsby", "F. Scott Fitzgerald",200);
		Book book2=new NonFiction("Sapiens: A Brief History of Humankind", "Yuval Noah Harari",500);
		book1.displayDetails();
		book2.displayDetails();
	}

}
