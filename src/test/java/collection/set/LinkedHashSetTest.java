package collection.set;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedHashSetTest {
    /**
     * A LinkedHashSet is a collection of items where every item is unique.
     **/
    @Test
    public void crudLinkedHashSet() {
        // Create LinkedHashSet object
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        // Add objects to the hashSet
        linkedHashSet.add("Wed");
        linkedHashSet.add("Mon");
        linkedHashSet.add("Tue");


        // Check if an item exist
        assertEquals(true, linkedHashSet.contains("Mon"));
        assertEquals(false, linkedHashSet.contains("Fri"));

        // Order by ascending
        System.out.println(linkedHashSet);
        assertArrayEquals(linkedHashSet.toArray(), new String[]{"Wed", "Mon", "Tue"});

        // Get ArrayList size
        assertEquals(3, linkedHashSet.size());

        // remove object
        linkedHashSet.remove("Mon");
        assertArrayEquals(new String[]{"Wed", "Tue"}, linkedHashSet.toArray());
    }
}
