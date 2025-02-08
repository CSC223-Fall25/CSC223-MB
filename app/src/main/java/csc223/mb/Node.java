package csc223.mb;

public class Node {
    char data;
    Node previous;
    Node next;

    public Node(Node previous, Node next, char data){
        this.previous = previous;
        this.next = next;
        this.data = data;
        
    }
    public Node(Node previous, Node next){
        this.previous = previous;
        this.next = next;
        this.data = ' ';
        
    }

    public Node(){
        this.previous = null;
        this.next = null;
        this.data = ' ';
     }
}
