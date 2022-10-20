package collection.queue;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayDequeTest {
    /**
     * ArrayDeque extends AbstractCollection and implements Deque.
     * ArrayDeque are not thread safe. It not allows the null elements.
     * Note: ArrayDeque are faster than Stack and LinkedList.
     **/

    @Test
    public void crudArrayQueue() {
        // Create ArrayDequeue object
        ArrayDeque arrayDeque = new ArrayDeque();

        // Add objects to the Queue
        arrayDeque.add("Mon");
        arrayDeque.add("Tue");
        arrayDeque.add("Wed");

        // offer() insert the specified element into this queue
        arrayDeque.offer("Thurs");
        String [] weekDaysOffer = new String[]{"Mon","Tue" , "Wed", "Thurs"};
        assertArrayEquals(arrayDeque.toArray(), weekDaysOffer);

        // element() retrieves, but does not remove, the head of this queue.
        assertEquals(arrayDeque.element(), "Mon");

        // poll() retrieve and eliminate the head of this queue, or return null if this queue is empty.
        assertEquals(arrayDeque.poll(), "Mon");

        // peek() retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        assertEquals(arrayDeque.peek(), "Tue");

        // getFirst() return first element of the deque
        assertEquals(arrayDeque.getFirst(), "Tue");

        // getLast() return last element of the deque
        assertEquals(arrayDeque.getLast(), "Thurs");

        // remove() retrieves and removes the head of this queue.
        arrayDeque.remove("Wed");
        String [] weekDaysRemoved = new String[]{"Tue", "Thurs"};
        assertArrayEquals(arrayDeque.toArray(), weekDaysRemoved);

    }
}
