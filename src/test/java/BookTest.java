import models.Author;
import models.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    public Book book1;
    Author author1;

    @Before
    public void before(){
        author1 = new Author("Andrew", "Lowrie", 24);
        book1 = new Book("Lord of the Rings", "14/05/2018", author1);

    }

    @Test
    public void hasTitle(){
        assertEquals("Lord of the Rings", book1.getTitle());
    }

    @Test
    public void hasPubDate(){
        assertEquals("14/05/2018", book1.getPublicationDate());
    }
}
