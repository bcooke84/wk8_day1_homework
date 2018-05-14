import models.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    public Book book1;

    @Before
    public void before(){
        book1 = new Book("Lord of the Rings", "14/05/2018");
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
