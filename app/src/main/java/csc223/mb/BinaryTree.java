package csc223.mb;

public class BinaryTree implements Tree {
    TreeNode root;
    public BinaryTree(){
        this.root = null;
    }


    @Override
    public String levelorder(){
        if (this.root == null){
            return "";
        }
        TreeQueue q = new TreeQueue();
        q.enqueue(this.root);
        StringBuilder result = new StringBuilder();
        while(!q.isEmpty()){
            TreeNode curr = q.dequeue();
            result.append(curr.data);
            if(curr.left != null){
                q.enqueue(curr.left);
            }
            if(curr.right != null){
                q.enqueue(curr.right);
            }

 
        } 
        return result.toString();
    }
    @Override
    public String preorder(){
        if(isEmpty()){
            return " ";
        }
        return preorder(this.root);


    }
    private String preorder(TreeNode currNode ){
        if(currNode == null){
            return "";

        }
        String leftStr = preorder(currNode.left);
        String rightStr = preorder(currNode.right);
        return currNode.data + leftStr + rightStr;
    }

    @Override
    public String inorder(){
        if(isEmpty()){
            return " ";
        }
        return inorder(this.root);


    }
    private String inorder(TreeNode currNode ){
        if(currNode == null){
            return "";

        }
        String leftStr = inorder(currNode.left);
        String rightStr = inorder(currNode.right);
        return leftStr + currNode.data + rightStr;
    }

    @Override
    public String postorder(){
        if(isEmpty()){
            return " ";
        }
        return postorder(this.root);


    }
    private String postorder(TreeNode currNode ){
        if(currNode == null){
            return "";

        }
        String leftStr = postorder(currNode.left);
        String rightStr = postorder(currNode.right);
        return leftStr + rightStr + currNode.data;
    }

    @Override
    public void insert( char item){
        if(this.root == null){
            this.root = new TreeNode(item);
            return;
        }
        TreeQueue q = new TreeQueue();
        q.enqueue(this.root);
        while(!q.isEmpty()){
           TreeNode curr =  q.dequeue();
           if(curr.left == null){
            curr.left = new TreeNode(item);
            return;
           }
           else{
            q.enqueue(curr.left);
           }
           if(curr.right == null){
            curr.right = new TreeNode(item);
            return;
           }
           else{
            q.enqueue(curr.right);
           }
        }
    
    }

    @Override
    public boolean search(char item){
        if (this.root == null) return false;

        TreeQueue q = new TreeQueue();
        q.enqueue(this.root);

        while (!q.isEmpty()) {
            TreeNode curr = q.dequeue();
            if (curr.data == item){
                return true;

            } 
            

            if (curr.left != null) q.enqueue(curr.left);
            if (curr.right != null) q.enqueue(curr.right);
        }

        return false;
    }

    @Override
    public int size(){
        return size(this.root);
    }

    private int size (TreeNode curr){
        if (curr == null){
            return 0;
        }

        return 1 + size(curr.left) + size(curr.right);
    }

    @Override
    public boolean isEmpty(){
        return this.root == null;
    }

    @Override
    public int height(){
        return height(this.root);
    }

    private int height(TreeNode curr){
        if (curr == null){
            return 0;
        }
        int lh = height(curr.left);
        int rh = height(curr.right);
        return Math.max(lh,rh)+1;
    }



    
}

