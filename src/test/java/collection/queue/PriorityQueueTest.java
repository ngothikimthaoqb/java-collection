package collection.queue;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriorityQueueTest {
    /**
     * To order the element, the Java Queue interface uses FIFO(First In First Out) method, i.e.,
     * the first element is removed first and the last element is removed at last.
     * The elements of the queue are needed to be processed according to the priority,
     * that's where a PriorityQueue comes into action.
     **/

    @Test
    public void crudPriorityQueue() {
        // Create ArrayList object
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

        // Add objects to the Queue
        priorityQueue.add("Mon");
        priorityQueue.add("Tue");
        priorityQueue.add("Wed");

        // offer() insert the specified element into this queue
        priorityQueue.offer("Thurs");
        String [] weekDaysOffer = new String[]{"Mon", "Thurs", "Wed", "Tue"};
        assertArrayEquals(priorityQueue.toArray(), weekDaysOffer);

        // element() retrieves, but does not remove, the head of this queue.
        assertEquals(priorityQueue.element(), "Mon");

        // poll() retrieve and eliminate the head of this queue, or return null if this queue is empty.
        assertEquals(priorityQueue.poll(), "Mon");

        // peek() retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        assertEquals(priorityQueue.peek(), "Thurs");

        // remove() retrieves and removes the head of this queue.
        priorityQueue.remove("Wed");
        String [] weekDaysRemoved = new String[]{"Thurs", "Tue"};
        assertArrayEquals(priorityQueue.toArray(), weekDaysRemoved);

    }
}
