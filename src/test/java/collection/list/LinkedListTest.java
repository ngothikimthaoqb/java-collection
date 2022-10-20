package collection.list;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    /**
     * a linked list data structure to store elements
     * can add items, change items, remove items and clear the list
     * use an ArrayList for storing and accessing data, and LinkedList to manipulate data
     * some extra methods: addfirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast()
     **/
    @Test
    public void crudLinkedList() {
        // Create LinkedList object
        LinkedList linkedList = new LinkedList();

        // Add objects to the List
        linkedList.add("Mon");
        linkedList.add("Tue");
        linkedList.add("Wed");

        // Get ArrayList size
        assertEquals(linkedList.size(), 3);

        // Update object at a specific position
        linkedList.add(2, "Tuesday");
        String [] weekDaysUpdated = new String[]{"Mon", "Tue", "Tuesday", "Wed"};
        assertArrayEquals(linkedList.toArray(), weekDaysUpdated);

        // Remove and element from a specific position
        linkedList.remove(2);
        String [] weekDaysRemoved = new String[]{"Mon", "Tue", "Wed"};
        assertArrayEquals(linkedList.toArray(), weekDaysRemoved);

        // Print the arrayList elements using iterator
        Iterator iterator =  linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Adds an item to the beginning of the list
        linkedList.addFirst("Sun");
        String [] weekDaysAddFirst = new String[]{"Sun", "Mon", "Tue", "Wed"};
        assertArrayEquals(linkedList.toArray(), weekDaysAddFirst);

        // Add an item to the end of the list

        linkedList.addFirst("Sat");
        String [] weekDaysAddLast = new String[]{"Sat", "Sun", "Mon", "Tue", "Wed"};
        assertArrayEquals(linkedList.toArray(), weekDaysAddLast);

        // Remove an item from the beginning of the list.
        linkedList.removeFirst();
        String [] weekDaysRemoveFirst = new String[]{"Sun", "Mon", "Tue", "Wed",};
        assertArrayEquals(linkedList.toArray(), weekDaysRemoveFirst);

        // Get the item at the beginning of the list
        assertEquals(linkedList.getFirst(), "Sun");

        // Get the item at the end of the list
        assertEquals(linkedList.getLast(), "Wed");

        // Remove all elements
        linkedList.clear();
        assertArrayEquals(linkedList.toArray(), new String[]{});

    }
}
