import models.Author;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {

    public Author author1;

    @Before
    public void before(){
        author1 = new Author("Andrew", "Lowrie", 24);
    }

    @Test
    public void hasFirstName(){
        assertEquals("Andrew", author1.getFirstName());
    }

    @Test
    public void hasLastName(){
        assertEquals("Lowrie", author1.getLastName());
    }

    @Test
    public void hasAge(){
        assertEquals(24, author1.getAge());
    }

}
