package com.example.project;

public class AAAA {
    public static void main(String[] args) {
        
        IdGenerate.reset();
        
        // // test code for the IdGenerate class
        // for (int i = 0; i < 5; i++) {
        //     IdGenerate.generateID();
        //     System.out.println(IdGenerate.getCurrentId());
        // }


        // // test code for Book class
        // Book book = new Book("Frogs of a Pond", "Jimmy's Johns", 2013, "B.827", 1);
        // System.out.println(book.bookInfo());
        // book.setTitle("Man");
        // book.setAuthor("Jack");
        // book.setYearPublished(1888);
        // book.setIsbn("Q.178");
        // book.setQuantity(1002);
        // System.out.println(book.bookInfo());


        // // test code for User class
        // User user = new User("Lorelai", "S.918");
        // Book book1 = new Book("Frogs of a Pond", "Jimmy's Johns", 2013, "B.827", 1);
        // Book book2 = new Book("Rats of a House", "Mickey Bees", 1986, "Z.028", 3);
        // System.out.println(user.userInfo());
        // user.setBooks(new Book[] {book1, book2, null, null, null});
        // System.out.println(user.userInfo());

        BookStore store = new BookStore(); //create a new bookstore with 6 empty books
        Book b1 = new Book("The Great Gatsby","Scott Fitzgerald", 1925, "979-8351145013",3);
        Book b2 = new Book("The Outliers", "Malcolm Gladwell",2008,"978-0316017930",1);
        Book b3 = new Book("1984", "George Orwell", 1949, "978-0451524935", 5);
        Book b4 = new Book("Brave New World", "Aldous Huxley", 1932, "978-0060850524", 3);
        Book b5 = new Book("Test","Author",1900, "1234", 1);
        IdGenerate.generateID();
        User u1 = new User("John",IdGenerate.getCurrentId());
        IdGenerate.generateID();
        User u2 = new User("Jane",IdGenerate.getCurrentId());
        IdGenerate.generateID();
        User u3 = new User("Mary",IdGenerate.getCurrentId());
        IdGenerate.generateID();
        User u4 = new User("Alex",IdGenerate.getCurrentId());
        store.addUser(u1);store.addUser(u2);store.addUser(u3);store.addUser(u4);

        // store.addBook(b1);store.addBook(b4);
        // store.insertBook(b2, 1);
        // store.insertBook(b3,2);
        // store.insertBook(b5,4);

        // store.addBook(b1);store.addBook(b2);store.addBook(b3);store.addBook(b4);store.addBook(b5);
        // store.removeBook(b1);store.removeBook(b1);
        // System.out.println(store.bookStoreBookInfo());


        store.removeUser(u2);
        store.removeUser(u1);

        for (int i = 0; i < store.getUsers().length; i++) {
            if (store.getUsers()[i] == null) {
                System.out.print("NULL");
            } else {
                System.out.print(store.getUsers()[i].getName());
            }
            System.out.println(". Position in list: " + i);
        }
        
    }
}