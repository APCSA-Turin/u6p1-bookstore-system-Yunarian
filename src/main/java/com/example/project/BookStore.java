package com.example.project;

public class BookStore {

    // requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    // static variables
    private static Book[] books = new Book[6];
    private static User[] users = new User[10];

    // constructor
    public BookStore() {
        users = new User[10];
        books = new Book[6];
    }

    // getters and setters
    public User[] getUsers() {return users;}

    public void setUsers(User[] newUsers) {users = newUsers;}

    public Book[] getBooks() {return books;}

    // adds a user to the first empty element of the users array with the new user
    public void addUser(User user) {
        // goes through every element of users
        for (int i = 0; i < users.length; i++) {
            // if that element is null, that element is set equal to the paramter
            // and the loop ends
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    } 

    // removes the first user which matches the parameter. 
    public void removeUser(User user) {
        // goes through every element of users
        for (int i = 0; i < users.length; i++) {
            // if that element isn't null and matches with user
            // that user is removed, and all users after it are moved foward by 1
            if (users[i] != null && users[i].equals(user)) {
                users[i] = null;
                // sends nulls to the end of the array
                consolidateUsers();
            }
        }
    }

    // modifies the users array such that all empty elements (nulls) are at the back of the array
    public void consolidateUsers() {
        User[] temp = new User[users.length];
        int currentUserIdx = 0;

        // goes through every element of users
        for (int i = 0; i < users.length; i++) {
            // if the User object at that element isn't null
            // it is added to the temporary array
            // at the first null in the temporary array
            if (users[i] != null) {
                temp[currentUserIdx] = users[i];
                currentUserIdx++;
            }
        }
        // modifying teh suers array with what ahs been done
        users = temp;
    }

    // adds a book to the first empty element in the books array
    public void addBook(Book book){
        // goes through every element in the books array
        for (int i = 0; i < books.length; i++) {
            // if that element is null, that element is set equal to  book
            // and the loop ends
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
        Book[] newBooks = new Book[books.length + 1];
        int currentBook = 0;
        // goes through every element in the newBooks array
        for (int i = 0; i < newBooks.length; i++) {
            // if not at the specified index, the current book is added to the array
            // and the current book is incremented by 1
            if (i != index) {
                newBooks[i] = books[currentBook];
                currentBook++;
            } else {
                // if it is at the specified index, that element is set equal to book
                newBooks[i] = book;
            }
        }
        // modifying the books array with what has been done
        books = newBooks;
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

            // after a book is possibly removed, checks to see if the quantity of that book is less than or equal to 0
            // if it is, that book gets removed from the books array
            if (books[i].getQuantity() <= 0) {
                // book is removed, and a new array is made 
                // with a length 1 less than the length of the array before
                books[i] = null;
                Book[] newBooks = new Book[books.length - 1];

                int numDifBooks = 0;
                // goes through every book in books
                for (int j = 0; j < books.length; j++) {
                    // if that element isn't null, it's added to a temporary array
                    if (books[j] != null) {
                        newBooks[numDifBooks] = books[j];
                        numDifBooks++;
                    }  
                }
                // modifying the books array with what has been done
                books = newBooks;
                break;  
            }
        }    
    }
}