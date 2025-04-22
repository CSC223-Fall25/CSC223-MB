package csc223.mb;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BinarySearchTreeTest {
    @Test
    public void testInsert(){
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes
        bst.insert(6);
        bst.insert(2);
        bst.insert(8);
        bst.insert(0);
        bst.insert(4);
        bst.insert(7);
        bst.insert(9);
        System.out.println(bst.inOrder());


    }

    @Test
    public void testSearch(){
        BinarySearchTree bst = new BinarySearchTree(); 
        bst.insert(6);
        bst.insert(2);
        bst.insert(8);
        bst.insert(0);
        bst.insert(4);
        bst.insert(7);
        bst.insert(9);
        assertTrue(bst.search(0));
        assertTrue(bst.search(2));
        assertFalse(bst.search(12));
    }

    @Test
    public void testDelete(){
        BinarySearchTree bst = new BinarySearchTree(); 
        bst.insert(6);
        bst.insert(2);
        bst.insert(8);
        bst.insert(0);
        bst.insert(4);
        bst.insert(7);
        bst.insert(9);
        assertTrue(bst.search(0));
        assertTrue(bst.search(2));
        bst.delete(0);
        bst.delete(2);
        assertFalse(bst.search(2));
        assertFalse(bst.search(0));
    }

    @Test 
    public void testleastCommonAncestor(){
        BinarySearchTree bst = new BinarySearchTree(); 
        bst.insert(6);
        bst.insert(2);
        bst.insert(8);
        bst.insert(0);
        bst.insert(4);
        bst.insert(7);
        bst.insert(9);
        System.out.println(bst.lowestCommonAncestor(2, 8));  // Output: 6
        System.out.println(bst.lowestCommonAncestor(2, 4)); 
    }

    @Test
    public void testsortedArrayToBST(){
        BinarySearchTree bst = new BinarySearchTree(); 
        bst.insert(6);
        bst.insert(2);
        bst.insert(8);
        bst.insert(0);
        bst.insert(4);
        bst.insert(7);
        bst.insert(9);
        int[] sortedArray = {-10, -3, 0, 5, 9};
        bst.sortedArrayToBST(sortedArray);
        System.out.println(bst.inOrder());
    }





    
}
