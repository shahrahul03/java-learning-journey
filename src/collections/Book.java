package collections;

import java.util.HashMap;
import java.util.Map;

public class Book {

    private int bookID;
    private String bookName;
    private double price;

    // getters
    public int getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    // setters
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString
    @Override
    public String toString() {
        return "Book [bookID=" + bookID + ", bookName=" + bookName + ", price=" + price + "]";
    }

    // main method to test Map
    public static void main(String[] args) {

        // create map: book title -> author
        Map<String, String> map = new HashMap<>();

        // add data
        map.put("Java Basics", "James ");
        map.put("Clean Code", " Martin");
        map.put("Effective Java", "Joshua ");
        map.put("Head First Java", "Kathy");

        // a. print all books and authors
        System.out.println("List of books and authors:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Book: " + entry.getKey() +
                               ", Author: " + entry.getValue());
        }

        // b. find author of a specific book
        String searchBook = "Clean Code";

        if (map.containsKey(searchBook)) {
            System.out.println("\nSearch result:");
            System.out.println("Book: " + searchBook +
                               ", Author: " + map.get(searchBook));
        } else {
            System.out.println("\nBook not found");
        }

        // c. total number of books
        int totalBooks = map.size();
        System.out.println("\nTotal number of books: " + totalBooks);
    }
}