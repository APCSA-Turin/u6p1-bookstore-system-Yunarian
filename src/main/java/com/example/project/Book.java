package com.example.project;

public class Book{
    // instance variables
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    // Constructor which initializes a Book object with it's title, author, publish date, ID, and quantity.
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    // getter and setter methods for all 5 instance variables
    public String getTitle() {return title;}

    public void setTitle(String newTitle) {title = newTitle;}

    public String getAuthor() {return author;}

    public void setAuthor(String newAuthor) {author = newAuthor;}

    public int getYearPublished() {return yearPublished;}

    public void setYearPublished(int newYearPublished) {yearPublished = newYearPublished;}

    public String getIsbn() {return isbn;}

    public void setIsbn(String newID) {isbn = newID;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int newQuantity) {quantity = newQuantity;}


    // returns the info of a book in the format: "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
    public String bookInfo(){
        String returnedString = "Title: ";
        returnedString += title + ", Author: ";
        returnedString += author + ", Year: ";
        returnedString += yearPublished + ", ISBN: ";
        returnedString += isbn + ", Quantity: ";
        returnedString += quantity;
        return returnedString;
    } 
       
}