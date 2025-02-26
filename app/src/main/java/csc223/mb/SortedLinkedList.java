package csc223.mb;

public class SortedLinkedList extends DoublyLinkedList  {
    public SortedLinkedList(){
        super();
    }
    
    @Override
    public void insert(char item){
        Node newNode = new Node(item);
        if(super.isEmpty() || this.head.data > item){
            newNode.next = this.head;
            if(this.head != null){
                this.head.previous = newNode;
            }
            this.head = newNode;
        }
        else{
            Node curr = this.head;
            while(curr.next != null && curr.next.data < item){
                curr = curr.next;
            }
            newNode.next = curr.next;
            if(curr.next != null){
                curr.next.previous = newNode;
            }
            curr.next = newNode;
            newNode.previous = curr;
        }
        this.size++;
    }
    @Override
    public void remove(char item){
        super.remove(item);
    }

    // Get the first item, return '☠' if the list is empty
    @Override
    public char getFirst(){
        return super.getFirst();
    }

    // Get the last item, return '☠' if the list is empty
    @Override
    public char getLast(){
        return super.getLast();
    }

    // Get an item at a specific index, return '☠' if index is out of bounds
    @Override
    public char get(int index){
       return  super.get(index);
    }

    // Get the size of the list
    @Override
    public int size(){
        return super.size();
    }

    // Check if the list is empty
    @Override
    public boolean isEmpty(){
        return super.isEmpty();
    }

    // Clear the list
    @Override
    public void clear(){
        super.clear();
    }

    // Check if the list contains an item
    @Override
    public boolean contains(char item){
        return super.contains(item);
    }

    // Get the index of an item, if it exists else return -1
    @Override
    public int indexOf(char item){
        return super.indexOf(item);
    }

    // Get the last index of an item, if it exists else return -1
    @Override
    public int lastIndexOf(char item){
        return super.lastIndexOf(item);
    }

    // Reverse the list
    @Override
    public void reverse(){
        super.reverse();
    }

    // Creates and returns a String representation of the list
    // e.g. `A -> B -> C -> D` should return "ABCD"
    @Override
    public String toString(){
        return super.toString();
    }
}
 
    

