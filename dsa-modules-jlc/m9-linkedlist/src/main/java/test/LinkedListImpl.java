package test;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next =null;
    }
}
class LinkedList{
    public static void display(Node node){
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
public class LinkedListImpl {
    public static void main(String[] args) {
        Node head  = new Node(10);
        head.next = new Node(30);
        LinkedList.display(head);

    }
}
