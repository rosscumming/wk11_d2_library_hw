import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

        private Book book1;

        @Before
        public void before(){
            book1 = new Book("Harry potter", "J.K Rowling", "Fantasy");
        }

        @Test
        public void canGetBookTitle(){
            assertEquals("Harry potter", book1.getTitle());
        }

        @Test
        public void canGetBookAuthor(){
            assertEquals("J.K Rowling", book1.getAuthor());
        }

        @Test
        public void canGetBookGenre(){
            assertEquals("Fantasy", book1.getGenre());
        }


}
