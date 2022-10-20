package collection.set.sortset;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeSetTest {
    /**
     * Just like HashSet, the Java TreeSet class contains unique elements only.
     * The access and retrieval times of the TreeSet class are very fast.
     * It maintains the ascending order.
     **/
    @Test
    public void crudTreeSet() {
        // Create ArrayList object
        Set<String > treeSet = new TreeSet<>();

        // Add objects to the treeSet
        treeSet.add("Wed");
        treeSet.add("Mon");
        treeSet.add("Tue");

        // Order by ascending
        assertArrayEquals(treeSet.toArray(), new String[]{"Mon", "Tue", "Wed" });

        // Get ArrayList size
        assertEquals(3, treeSet.size());

        // Contains unique elements only
        treeSet.add("Tue");
        assertArrayEquals(treeSet.toArray(), new String[]{"Mon", "Tue", "Wed" });

        // remove object
        treeSet.remove("Mon");
        assertArrayEquals(new String[]{"Tue", "Wed" }, treeSet.toArray());

    }
}
