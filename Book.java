//Just add some comments)
public class Book{
private String Title;
private String Author;
private int Pages;
private String Status;

public Book(String Title, String Author, int Pages, String Status){
	this.Author = Author;
	this.Pages = Pages;
	this.IsAvailable = true; 
 }	
public void IsAvailable(){
	if(IsAvailable){
		IsAvailable = false;
		System.out.print("Not Available");
	}else{
		System.out.print("Available");
	}
}

public void returnBook(){
	if(!IsAvailable){
		IsAvailable = true;
		System.out.print("Book" + Title + " has been returned.");
	}else{
		System.out.print("Book" + Title + " has been borrowed.");
	}
}

public void displayInfo(){
	System.out.print("Book information:");
	System.out.print("Title: "  + Title);
	System.out.print("Author: " + Author);
	System.out.print("Number of Pages" + Pages);
	System.out.print("Availability: " + IsAvailable);
    }



public static void main(String [] args){
	Book Mybook = new Book("The Great Gatsby", "F.Scott Fitzgerald", "300");
	Mybook.displayInfo();
	Mybook.returnBook();
	Mybook.returnBook();
}
}