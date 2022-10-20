package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayTest {
    @Test
    public void declareArray() {
        // solution 1
        String [] weekdays1 = new String[]{"Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Sun"};

        // solution 2
        String [] weekdays2= new String[7];
        weekdays2[0] = "Mon";
        weekdays2[1] = "Tue";
        weekdays2[2] = "Wed";
        weekdays2[3] = "Thurs";
        weekdays2[4] = "Fri";
        weekdays2[5] = "Sat";
        weekdays2[6] = "Sun";

        assertArrayEquals(weekdays1, weekdays2);
    }
}
