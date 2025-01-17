package com.example.project;

public class BookStore {

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    // static variables
    private static Book[] books = new Book[5];
    private static User[] users = new User[10];

    // empty constructor
    public BookStore() {}

    // getters and setters
    public User[] getUsers() {return users;}

    public void setUsers(User[] newUsers) {users = newUsers;}

    public Book[] getBooks() {return books;}

    // adds a user to the first empty element of the users array with the new user
    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    } 

    // removes the first user which matches the parameter. 
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].equals(user)) {
                users[i] = null;
                consolidateUsers();
                break;
            }
        }
    }

    // modifies the users array such that all empty elements (nulls) are at the back of the array
    public void consolidateUsers() {
        User[] temp = new User[users.length];
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                temp[index] = users[i];
                index++;
            }
        }
        users = temp;
    }

    // adds a book to the first empty element in the books array
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    // inserts the book at the specified index with the new book
    public void insertBook(Book book, int index) {
        // creates a new array with a length 1 greater than books
        // then inserts book at index, adding 1 to all books' index after book. 
        // leaves a null at the last element of the array.
        Book[] newBooks = new Book[books.length + 1];
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (i == index) {
                newBooks[i] = book;

            } else {
                newBooks[i] = books[count];
                count++;
            }
        }

        // removes the null at the end of newbooks 
        Book[] newerBooks = new Book[newBooks.length - 1];
        for (int i = 0; i < newerBooks.length; i++) {
            newerBooks[i] = newBooks[i];
        }
        books = newerBooks;
    }

    // removes a quantity of the first book which matches with the parameter.
    // if said quantity is reduced to 0 or less, that book object is removed from the array,
    // and the length of the book array is reduced by 1.
    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            // removes 1 quantity from the first book which matches with the parameter
            if (books[i] != null && books[i].equals(book)) {
                books[i].setQuantity(books[i].getQuantity() - 1);
            }

            if (books[i].getQuantity() <= 0) {
                books[i] = null;
                Book[] newBooks = new Book[books.length - 1];
                int count = 0;
                for (int j = 0; j < books.length; j++) {
                    if (books[j] != null) {
                        newBooks[count] = books[j];
                        count++;
                    }  
                }
                books = newBooks;
                break;  
            }
        }    
    }

    // you are not tested on this method but use it for debugging purposes
    public String bookStoreUserInfo() {
        String returnedString = "";
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
              returnedString += users[i].userInfo() + "\n";  
            } else {
                returnedString += "NULL\n";
            }
            
            }
        return returnedString;
    }

    public String bookStoreBookInfo() {
        String returnedString = "";
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                returnedString += books[i].bookInfo() + "\n";  
            } else {
                returnedString += "NULL\n";
            }
            
            }
        return returnedString;
    }
 

}