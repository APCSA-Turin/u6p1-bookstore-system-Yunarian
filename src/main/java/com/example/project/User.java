package com.example.project;

public class User{
    // instance variables
    private String name;
    private String id;
    private Book[] booklist;

    // Constructor which initializes a User object with it's name and id, and an empty booklist of a length 5
    public User(String name, String id) {
        this.name = name;
        this.id = id;

        booklist = new Book[] {null, null, null, null, null};
    }
    
    // getters and setter methods for instance variables
    public String getName() {return name;}

    public void setName(String newName) {name = newName;}

    public String getId() {return id;}

    public void setId(String newID) {id = newID;}

    public Book[] getBooks() {return booklist;}

    public void setBooks(Book[] newBook) {booklist = newBook;}

    //returns a booklist for the user, which each book taking it's own line. If null, that element is replaced with "empty" instead.
    public String bookListInfo() {
        String returnedString = "Books: \n";
        for (int i = 0; i < 5; i++) {
            if (booklist[i] == null) {returnedString += "empty\n";}
            else {returnedString += booklist[i].bookInfo() + "\n";}
        }
        return returnedString;
    } 

    // returns a user's info in the format: "Name: []\nID: []\nBooks:\n[]"
    public String userInfo() {
        String infoReturned = "Name: " + name + "\n";
        infoReturned += "ID: " + id + "\n";
        infoReturned += bookListInfo();
        return infoReturned;
    } 
       
}