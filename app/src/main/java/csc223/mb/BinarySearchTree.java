package csc223.mb;

public class BinarySearchTree {
    TreeNode root;
    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(int value){
        if (this.root == null){
            this.root = new TreeNode(value);
        }
        insert(this.root, value);

    }

    private TreeNode insert(TreeNode curr, int value){
        if (curr == null){
            return new TreeNode(value);

        }
        else{
            if(curr.data > value){
                curr.left = insert(curr.left, value);
            }
            else{
                curr.right = insert(curr.right, value);
            }
            return curr;
        }
    }

    public void delete(int value){
        
        this.root = delete( this.root, value);

    }

    private TreeNode delete(TreeNode curr, int value){
        if (curr == null){
            return curr;
        }
        if(value < curr.data){
            curr.left = delete(curr.left, value);
        }
        else if (value > curr.data){
            curr.right = delete(curr.right, value);
        }
        else{
            if(curr.left == null){
                return curr.right;
            }
            else if(curr.right == null){
                return curr.left;
            }
            curr.data = minValue(curr.right);
            curr.right = delete(curr.right, curr.data);
        }
        
        return curr;
    }

    private int minValue(TreeNode curr){
        int minValue = curr.data;
        while(curr.left != null){
            minValue = curr.left.data;
            curr = curr.left;
        }
        return minValue;
    }
    
    public boolean search(int value){
        return search (this.root, value);
    }

    private boolean search(TreeNode curr, int value){
        if(curr == null){
            return false;
        }
        if(value == curr.data){
            return true;
        }
        else if(value < curr.data){
            return search(curr.left, value);

        }
        else{
            return search(curr.right, value);
        }
    }

    public void update(int oldValue, int newValue){
        if(search(oldValue)){
            delete(oldValue);
            insert(newValue);
        }
    }

    public String inOrder(){
        StringBuilder result = new StringBuilder();
        inOrder(this.root, result);
        return result.toString().trim();
    }

    private void inOrder(TreeNode curr, StringBuilder result){
        if(curr != null){
            inOrder(curr.left, result);
            result.append(curr.data).append(" ");
            inOrder(curr.right, result);
        }
    }

    public void sortedArrayToBST(int[] values){
        this.root = sortedArrayToBST(values, 0, values.length -1);
    }
    
    private TreeNode sortedArrayToBST( int[] values, int left, int right){
        if(left > right){
            return null;
        }
        int middle = (left + right) / 2;
        TreeNode curr = new TreeNode(values[middle]);
        curr.left = sortedArrayToBST(values, left, middle -1);
        curr.right = sortedArrayToBST(values, middle + 1, right);
        return curr;
    }

    public int lowestCommonAncestor(int p, int q){
        TreeNode lca = lowestCommonAncestor(this.root, p, q);
        if(lca != null){
            return lca.data;
        }
        return -1;
    }
    
    private TreeNode lowestCommonAncestor(TreeNode curr, int p, int q){
        if(curr == null){
            return null;
        }
        if(curr.data > p && curr.data > q){
            return lowestCommonAncestor(curr.left, p, q);
        }
        else if(curr.data < p && curr.data < q){
            return lowestCommonAncestor(curr.right, p, q);
        }
        return curr;
    }

}
