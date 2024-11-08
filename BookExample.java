// //Create a Book class with the following private fields:
// title (String)
// author (String)
// price (double)
// Write the following methods:
// Getter and setter methods for all fields.
// In the setter method for price, ensure that the price is always a positive number. If a negative price is passed, set the price to .
// Expected output:

// Create a Book object, set the title, author, and price, and print the details. Also, handle the case where a negative price is provided.
import java.util.Scanner;
class Book{
    private String title,author;
    private double price;
    
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if(price <0){
            this.price=0;
        }
        else{
            this.price=price;
        }
    }
    
    public void BookDetails(){
        System.out.println("\n\t.... Here are the books details ....\n\n");
        System.out.println("Book Title :"+getTitle());
        System.out.println("Book Author :"+getAuthor());
        System.out.println("Book Price :"+getPrice());
        System.out.println("\n\t....Thanks for Visiting....");
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        
        System.out.print("Enter the Book Title :");
        String title =sc.nextLine();
        book.setTitle(title);
        
        System.out.print("Enter the Book Author Name :");
        String author =sc.nextLine();
        book.setAuthor(author);
        
        System.out.print("Enter the Book Price:");
        double price =sc.nextDouble();
        book.setPrice(price);
        
        book.BookDetails();
        sc.close();
    }
    
}
