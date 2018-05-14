import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        // AUTHOR TESTS

        Author author1 = new Author("Andrew", "Lowrie", 24);
        DBAuthor.save(author1);

        Author author2 = new Author("Steven", "King", 70);
        DBAuthor.save(author2);

        List<Author> authors = DBAuthor.getAuthors();

        Author result = DBAuthor.find(author1.getId());

        // BOOK TESTS

        Book book1 = new Book ("Lord of the Kings", "14/05/2018");
        DBBook.save(book1);

        Book book2 = new Book ("IT", "15/09/1985");
        DBBook.save(book2);

        Book book3 = new Book ("fake", "fake");
        DBBook.save(book3);

        book3.setTitle("even_faker");
        DBBook.update(book3);
        List<Book> books = DBBook.getBooks();

        DBBook.delete(book3);
        List<Book> books2 = DBBook.getBooks();

    }

}
