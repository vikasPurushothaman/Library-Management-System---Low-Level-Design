package library.service;

import library.model.Book;
import library.model.Patron;

public class LendingService {

    public void checkOutBook(Book book, Patron patron ){
        if (!book.isAvailable()){
            throw  new RuntimeException("Book not available");
        }
        book.markBorrowed();
        patron.borrowedBooks(book);
    }

    public void returnBooks(Book book, Patron patron){
        book.markReturned();
        patron.returnBooks(book);
    }

}
