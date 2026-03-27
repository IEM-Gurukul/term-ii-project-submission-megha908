// Service class for managing library operations
package service;

import model.Book;
import java.util.ArrayList;

public class LibraryService {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.getId() == id && !b.isIssued()) {
                b.issueBook();
                return;
            }
        }
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id && b.isIssued()) {
                b.returnBook();
                return;
            }
        }
    }
}