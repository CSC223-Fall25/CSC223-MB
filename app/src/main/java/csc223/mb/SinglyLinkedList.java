package csc223.mb;

public class SinglyLinkedList implements LinkedList {
    Node head;
    int size;

    public SinglyLinkedList(){
        
        this.head = null;
        this.size = 0;
    }

    @Override
    public  void insert(char item){
        Node newNode = new Node(item);
        if (this.head == null){
            this.head = newNode;
            this.size++;
            return;
        }
        Node curr = this.head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        this.size++;


    }
    
    @Override
    public void remove(char item){
        if(this.head == null){
            return;
        }
        if(this.head.data == item){
            this.head = this.head.next;
            this.size--;
            return;
        }
        Node curr = this.head;
        while(curr.next != null && curr.next.data != item){
            curr = curr.next;
        }
        if(curr.next != null){
            curr.next = curr.next.next;
            this.size--;
        }
        
    }

    @Override
    public char getFirst(){
        if(this.head == null){
            return ' ';
        }
        return this.head.data;
    }

    @Override
    public char getLast(){
        if(isEmpty()){
            return ' ';
        }
        Node curr = this.head;
        
        while(curr.next != null)
        {
            curr = curr.next;
        }
        
        return curr.data;
    }

    @Override
    public char get(int index){
        if (isEmpty()){
            return ' ';
        }
        if( index < 0 || index > this.size){
            return ' ';
        }
        Node curr = this.head;
        for(int i= 0; i<index; i++){
            curr = curr.next;


        }
        return curr.data;

    }

    @Override
    public int size(){
        return this.size;
    }

    @Override
    public boolean isEmpty(){
        return this.size == 0;
    } 

    @Override
    public void clear(){
        this.head = null;
        this.size = 0;
    }

    @Override
    public boolean contains(char item){
        if(isEmpty()){
            return false;
        }
        Node curr = this.head;
        if(curr.data == item){
            return true;
        }
        while( curr.next != null){
            if(curr.data == item){
                return true;
            }
            curr = curr.next;

       }
       if (curr.data == item){
        return true;
       }
       return false;
    }

    @Override
    public int indexOf(char item){
        if(isEmpty()){
            return -1;
        }
        Node curr = this.head;

        for(int i = 0; i<= this.size; i++)
        {
            while(curr.next != null){
                if(curr.data == item){
                    return i;
                }
                curr = curr.next;
            }
            if(curr.data == item){
                return i;
            }
            
        }
        return -1;

    }

    @Override
    public int lastIndexOf(char item){
        if(isEmpty()){
            return -1;
        }
        Node curr = this.head;
        for(int i = this.size; i>= 0; i--)
        {
            if(curr.data == item){
                    return i -1;
                }
            if(curr.next != null){
                curr = curr.next;
            }
        }
                
            
          
            
        return -1;
    }

    @Override
    public void reverse()
    {
        Node curr = this.head;
        Node prev = null;
        while (curr != null){
            Node holder = curr.next;
            curr.next = prev;
            prev = curr;
            curr = holder;

        }
        this.head = prev;
            
        
    }
    
    @Override
    public String toString(){
        String listString = "";
        Node curr = this.head;
        while(curr != null){
            listString += curr.data;
            curr = curr.next;

        }
        return (String) listString;

    }

}
