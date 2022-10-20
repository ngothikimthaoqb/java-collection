package map;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumMapTest {
    /**
     * A HashSet is a collection of items where every item is unique.
     **/
    @Test
    public void crudEnumMap() {

        // Enum
         enum WEEKDAY {
            MON,
            TUE,
            WED,
        }
        // Create EnumMap object
        EnumMap<WEEKDAY, String> enumMap = new EnumMap<WEEKDAY, String>(WEEKDAY.class);

        // Putting values inside EnumMap in Java
        enumMap.put(WEEKDAY.MON, "Monday");
        enumMap.put(WEEKDAY.TUE, "Tuesday");
        enumMap.put(WEEKDAY.WED, "Wednessday");

        System.out.println(enumMap);
        System.out.println(enumMap.get(WEEKDAY.MON));
    }
}
