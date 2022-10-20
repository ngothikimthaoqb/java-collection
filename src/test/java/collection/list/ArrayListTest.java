package collection.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayListTest {

    /**
     * a dynamic array to store the duplicate element of different data types
     * the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one)
     **/
    @Test
    public void crudArrayList() {
        // Create ArrayList object
        List arrayList = new ArrayList();

        // Add objects to the List
        arrayList.add("Mon");
        arrayList.add("Tue");
        arrayList.add("Wed");

        // Get ArrayList size
        System.out.println("Size:" + arrayList.size());

        // Update object at a specific position
        arrayList.add(2, "Tuesday");
        String [] weekDaysUpdated = new String[]{"Mon", "Tue", "Tuesday", "Wed"};
        assertArrayEquals(arrayList.toArray(), weekDaysUpdated);

        // Remove and element from a specific position
        arrayList.remove(2);
        String [] weekDaysRemoved = new String[]{"Mon", "Tue", "Wed"};
        assertArrayEquals(arrayList.toArray(), weekDaysRemoved);

        // Print the arrayList elements using iterator
        Iterator iterator =  arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Remove all elements
        arrayList.clear();
        assertArrayEquals(arrayList.toArray(), new String[]{});

    }
}
