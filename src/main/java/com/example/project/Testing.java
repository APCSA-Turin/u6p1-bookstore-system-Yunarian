package com.example.project;

public class Testing {
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


        // test code for User class
        User user = new User("Lorelai", "S.918");
        Book book1 = new Book("Frogs of a Pond", "Jimmy's Johns", 2013, "B.827", 1);
        Book book2 = new Book("Rats of a House", "Mickey Bees", 1986, "Z.028", 3);
        System.out.println(user.userInfo());
        user.setBooks(new Book[] {book1, book2, null, null, null});
        System.out.println(user.userInfo());
    }
}