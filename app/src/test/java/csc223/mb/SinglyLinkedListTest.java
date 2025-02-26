package csc223.mb;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
public class SinglyLinkedListTest {
    // Insert an item at the end of the list for unsorted lists

    private SinglyLinkedList list;

    @BeforeEach
    public void setup(){
        this.list = new SinglyLinkedList();
    }
    @Test
    public void testinsert()
    {
        this.list.insert('A');
        this.list.insert('B');
        this.list.insert('C');
        this.list.insert('D');
        this.list.insert('E');
        assertTrue(this.list.contains('A'));
        assertTrue(this.list.contains('D'));
        assertTrue(this.list.contains('E'));
        
       
    }

    @Test
    public void testRemove(){
        this.list.insert('A');
        this.list.insert('B');
        this.list.insert('C');
        this.list.insert('D');
        this.list.insert('E');
        this.list.remove('A');
        assertFalse(this.list.contains('A'));
        this.list.remove('E');
        assertFalse(this.list.contains('E'));
        this.list.remove('C');
        assertFalse(this.list.contains('C'));

    }

    @Test
    public void testGetFirst() {
        this.list.insert('A');
        this.list.insert('B');
        this.list.insert('C');
        this.list.insert('D');
        this.list.insert('E');
        assertEquals('A', this.list.getFirst());
        this.list.remove('A');
        assertEquals('B',this.list.getFirst());
        

    }
    @Test
    public void testGetLast(){
        this.list.insert('A');
        this.list.insert('B');
        this.list.insert('C');
        this.list.insert('D');
        this.list.insert('E');
        assertEquals('E', this.list.getLast());
        this.list.remove('E');
        assertEquals('D',this.list.getLast());
    }

    @Test
    public void testGet() {
        this.list.insert('A');
        this.list.insert('B');
        assertEquals('B', list.get(1));
        assertEquals(' ', list.get(5));  // out of bounds
    }

    @Test
    public void testSize() {
        assertEquals(0, this.list.size());
        this.list.insert('A');
        assertEquals(1, this.list.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(this.list.isEmpty());
        this.list.insert('A');
        assertFalse(this.list.isEmpty());
    }

    @Test
    public void testClear() {
        for(int i = 0; i < 20; i++){
            this.list.insert('A'); 
        }
        this.list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testContains() {
        this.list.insert('A');
        assertTrue(this.list.contains('A'));
        assertFalse(this.list.contains('B'));
    }

    @Test
    public void testIndexOf() {
        this.list.clear();
        this.list.insert('A');
        this.list.insert('B');
        assertEquals(0, this.list.indexOf('A'));
        assertEquals(-1, this.list.indexOf('C'));
    }

    @Test
    public void testLastIndexOf() {
        this.list.insert('A');
        this.list.insert('B');
        this.list.insert('A');
        assertEquals(2, this.list.lastIndexOf('A'));
        assertEquals(-1, this.list.lastIndexOf('C'));
    }

    @Test
    public void testReverse() {
        this.list.insert('A');
        this.list.insert('B');
        this.list.reverse();
        assertEquals("BA", this.list.toString());
    }

    @Test
    public void testToString() {
        this.list.insert('A');
        this.list.insert('B');
        this.list.insert('C');
        assertEquals("ABC", this.list.toString());
    }
}






