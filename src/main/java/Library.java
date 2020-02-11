import java.util.ArrayList;
import java.util.Collection;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public void addBook(Book book){
        this.collection.add(book);
    }

    public int collectionCount(){
        return this.collection.size();
    }

    public Collection checkIfCapacityReachedBeforeAddingBook(Book book){
        if(collectionCount() < this.capacity) {
            this.addBook(book);
        }
        return null;
    }



}
