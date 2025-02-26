package csc223.mb;

public class ArrayQueue implements Queue{

    int[] data;
    int front;
    int back;
    int capacity;
    int size;

    public  ArrayQueue(){
      this.data = new int[this.capacity];
      this.front = 0;
      this.back = 0;
      this.size = 0;
       

      
    }
    @Override
    public void enqueue(int item){
        if(this.size < this.data.length ){
            this.data[this.back] = item;
            this.back = (this.back + 1) % this.data.length;
            this.size++;
            
            }
        else{
            int newCapacity = this.data.length * 2;
            int[] newData = new int[newCapacity];
            for(int i =0; i < this.size; i++){
                newData[i] = this.data[(this.front + i) % this.data.length];
            }
            this.data = newData;
            this.front = 0;
            this.back = this.size;
        }
    }
    
    @Override
    public int dequeue(){
        if (isEmpty()){
            return Integer.MAX_VALUE;
        }
        int item = this.data[this.front];
        this.front = (this.front+1) % this.data.length;
        this.size--;
        return item;
    }
    
    @Override
    public int peek(){
        if (isEmpty() == true){
            return -1;
        }
        return this.data[this.front];

    }
    
    @Override
    public boolean isEmpty(){
        return size() == 0;
    }
    
    @Override
    public int size(){
       return this.size; 
    }
}
