package collection.list;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    /**
     * Vector implements a dynamic array which means it can grow or shrink as required.
     * Like an array, it contains components that can be accessed using an integer index.
     **/
    @Test
    public void crudVector() {
        // Create Vector object
        Vector<String> vector = new Vector<String>();

        // Add objects to the List
        vector.add("Mon");
        vector.add("Tue");
        vector.add("Wed");

        // Get Vector size
        assertEquals(vector.size(), 3);

        // Get element by index
        assertEquals("Wed", vector.get(2));

        // Get first element
        assertEquals("Mon", vector.firstElement());

        // Get last element
        assertEquals("Wed", vector.lastElement());

        // Update object at a specific position
        vector.add(2, "Tuesday");
        String [] weekDaysUpdated = new String[]{"Mon", "Tue", "Tuesday", "Wed"};
        assertArrayEquals(vector.toArray(), weekDaysUpdated);

        // Remove and element from a specific position
        vector.remove(2);
        String [] weekDaysRemoved = new String[]{"Mon", "Tue", "Wed"};
        assertArrayEquals(vector.toArray(), weekDaysRemoved);

        // Print the Vector elements using iterator
        Iterator iterator =  vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Remove all elements
        vector.clear();
        assertArrayEquals(vector.toArray(), new String[]{});
    }
}
