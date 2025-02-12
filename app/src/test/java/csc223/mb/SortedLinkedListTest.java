package csc223.mb;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SortedLinkedListTest {

    @Test
    public void testInsertSorted() {
        SortedLinkedList list = new SortedLinkedList();
        list.insert('C');
        list.insert('A');
        list.insert('B');
        assertEquals(3, list.size());
        assertEquals('A', list.getFirst());
        assertEquals('C', list.getLast());
        list.clear();
        list.insert('A');
        list.insert('A');
        list.insert('B');
        list.insert('C');
        list.insert('A');
        assertEquals(5, list.size());
        assertEquals('A', list.getFirst());
        assertEquals('C', list.getLast());
    }
    @Test
    public void testRemove() {
        SortedLinkedList list = new SortedLinkedList();
        list.insert('A');
        list.insert('B');
        list.remove('B');
        assertEquals(1, list.size());
        assertEquals('A', list.getFirst());
        assertEquals('A', list.getLast());
        list.clear();
        list.insert('A');
        list.insert('B');
        list.remove('A');
        assertEquals(1, list.size());
        assertEquals('B', list.getFirst());
        assertEquals('B', list.getLast());
        list.clear();
        list.insert('A');
        list.insert('B');
        list.remove('B');
        assertEquals(1, list.size());
        assertEquals('A', list.getFirst());
        assertEquals('A', list.getLast());
    }
    @Test
    public void testToString() {
        SortedLinkedList list = new SortedLinkedList();
        list.insert('C');
        list.insert('A');
        list.insert('B');
        list.insert('D');
        assertEquals("ABCD", list.toString());
    }

}
