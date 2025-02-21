package csc223.mb;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BinaryTreeTest {
    
    

    
    @Test
    public void testInsertAndLevelOrder() {
        BinaryTree tree = new BinaryTree();
        tree.insert('A');
        tree.insert('C');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');
        assertTrue(tree.search('A'));
        assertTrue(tree.search('C'));
        assertTrue(tree.search('E'));
    }

    @Test
    public void testPreorder() {
        Tree tree = new BinaryTree();
        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');
        assertEquals("ABDEC", tree.preorder());
    }

    @Test
    public void testInorder() {
        Tree tree = new BinaryTree();
        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');
        assertEquals("DBEAC", tree.inorder());
    }

    @Test
    public void testPostorder() {
        Tree tree = new BinaryTree();
        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');
        assertEquals("DEBCA", tree.postorder());
    }

    @Test
    public void testSearch() {
        Tree tree = new BinaryTree();
        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        assertTrue(tree.search('A'));
        assertTrue(tree.search('B'));
        assertFalse(tree.search('D'));
    }

    @Test
    public void testSize() {
        Tree tree = new BinaryTree();
        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');
        assertEquals(5, tree.size());
    }

    @Test
    public void testIsEmpty() {
        Tree tree = new BinaryTree();
        assertTrue(tree.isEmpty());
        tree.insert('A');
        assertFalse(tree.isEmpty());
    }

    @Test
    public void testHeight() {
        Tree tree = new BinaryTree();
        tree.insert('A');
        tree.insert('B');
        tree.insert('C');
        tree.insert('D');
        tree.insert('E');
        assertEquals(3, tree.height()); // This will depend on tree structure
    }
}

