package collection.set;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HasSetTest {
    /**
     * A HashSet is a collection of items where every item is unique.
     **/
    @Test
    public void crudHashSet() {
        // Create ArrayList object
        HashSet<String> hashSet = new HashSet<String>();

        // Add objects to the hashSet
        hashSet.add("Wed");
        hashSet.add("Mon");
        hashSet.add("Tue");
        hashSet.add("Tue");

        // Check if an item exist
        assertEquals(true, hashSet.contains("Mon"));
        assertEquals(false, hashSet.contains("Fri"));

        // Order by ascending
        System.out.println(hashSet);
        assertArrayEquals(hashSet.toArray(), new String[]{"Tue", "Wed", "Mon"});

        // Get ArrayList size
        assertEquals(3, hashSet.size());

        // remove object
        hashSet.remove("Mon");
        assertArrayEquals(new String[]{"Tue", "Wed"}, hashSet.toArray());
    }
}
