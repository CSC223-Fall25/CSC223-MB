package csc223.mb;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {
    @Test
    public void testInsert() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert('A');
        assertEquals(1, list.size());
        assertEquals('A', list.getFirst());
        assertEquals('A', list.getLast());
        list.insert('A');
        list.insert('B');
        assertEquals(3, list.size());
        assertEquals('A', list.getFirst());
        assertEquals('B', list.getLast());
    }

    @Test
    public void testRemove() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert('A');
        list.remove('A');
        assertEquals(0, list.size());
        assertEquals(' ', list.getFirst());
        assertEquals(' ', list.getLast());
        list.clear();
        list.insert('A');
        list.insert('B');
        list.insert('C');
        list.remove('B');
        assertEquals(2, list.size());
        assertEquals('A', list.getFirst());
        assertEquals('C', list.getLast());
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
    public void testReverse() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert('A');
        list.insert('B');
        list.insert('C');
        list.reverse();
        assertEquals('C', list.getFirst());
        assertEquals('A', list.getLast());
    }

    @Test
    public void testToString() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert('A');
        list.insert('B');
        list.insert('C');
        assertEquals("ABC", list.toString());
    }
    
}
