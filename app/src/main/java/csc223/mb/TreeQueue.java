package csc223.mb;

public class TreeQueue {
    TreeNode[] data;
    int front;
    int back;
    int capacity;
    int size;

    public  TreeQueue(){
      this.data = new TreeNode[this.capacity];
      this.front = 0;
      this.back = 0;
      this.size = 0;
       

      
    }
    
    public void enqueue(TreeNode item){
        if(this.size < this.data.length ){
            this.data[this.back] = item;
            this.back = (this.back + 1) % this.data.length;
            this.size++;
            
            }
        else{
            int newCapacity = this.data.length * 2;
            TreeNode[] newData = new TreeNode[newCapacity];
            for(int i =0; i < this.size; i++){
                newData[i] = this.data[(this.front + i) % this.data.length];
            }
            this.data = newData;
            this.front = 0;
            this.back = this.size;
        }
    }
    
    
    public TreeNode dequeue(){
        if (isEmpty()){
            return null;
        }
        TreeNode item = this.data[this.front];
        this.front = (this.front+1) % this.data.length;
        this.size--;
        return item;
    }
    
    
    public TreeNode peek(){
        if (isEmpty() == true){
            return null;
        }
        return this.data[this.front];

    }
    
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    
    public int size(){
       return this.size; 
    }
}
