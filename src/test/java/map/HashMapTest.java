package map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapTest {
    /**
     * A HashSet is a collection of items where every item is unique.
     **/
    @Test
    public void crudHashMap() {
        // Create ArrayList object
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        // Add objects to the hashMap
        hashMap.put(1, "Mon");
        hashMap.put(2, "Tue");
        hashMap.put(3, "Wed");

        // Get element
        assertEquals("Mon", hashMap.get(1));
    }
}
