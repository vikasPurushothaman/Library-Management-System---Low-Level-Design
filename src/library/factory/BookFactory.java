package library.factory;

import library.model.Book;

public class BookFactory {

    public static Book creatBook(String isbn, String titile, String author, int Year) {
        return new Book(isbn,titile,author,Year);
    }
}
