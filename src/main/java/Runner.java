import db.DBAuthor;
import db.DBBook;
import db.DBHelper;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        // AUTHOR TESTS

        Author author1 = new Author("Andrew", "Lowrie", 24);
        DBHelper.save(author1);

        Author author2 = new Author("Steven", "King", 70);
        DBHelper.save(author2);

        List<Author> authors = DBHelper.getAll(Author.class);

        Author result = DBHelper.find(Author.class, author1.getId());

        // BOOK TESTS

        Book book1 = new Book ("Lord of the Kings", "14/05/2018", author1);
        DBHelper.save(book1);

        Book book2 = new Book ("IT", "15/09/1985", author1);
        DBHelper.save(book2);

        Book book3 = new Book ("fake", "fake", author2);
        DBHelper.save(book3);

        book3.setTitle("even_faker");
        DBHelper.save(book3);
        List<Book> books = DBHelper.getAll(Book.class);

        DBBook.delete(book3);
        List<Book> books2 = DBHelper.getAll(Book.class);

    }

}
