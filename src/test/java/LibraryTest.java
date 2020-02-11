import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Library collection;

    @Before
    public void before(){
        book = new Book("Harry potter", "J.K Rowling", "Fantasy");
        collection = new Library(10);
    }

    @Test
    public void addBookToCollection(){
        collection.addBook(book);
        assertEquals(1, collection.collectionCount());
    }


    @Test
    public void canGetCollectionTotal(){
        assertEquals(0, collection.collectionCount());
    }

    @Test
    public void checkStockIsFullBeforeAddingBook(){
        collection.checkIfCapacityReachedBeforeAddingBook(book);
        collection.checkIfCapacityReachedBeforeAddingBook(book);
        collection.checkIfCapacityReachedBeforeAddingBook(book);
        collection.checkIfCapacityReachedBeforeAddingBook(book);
        assertEquals(4, collection.collectionCount());
    }



}
