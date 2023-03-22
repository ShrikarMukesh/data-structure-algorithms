package com.linkedlist;

//Traverse the LinkedList using Iterative Style
public class Lab1 {
    static void displayList(Node headNode){
        Node currentNode = headNode;
        while (currentNode != null){
            System.out.print(currentNode.data + "\t");
            currentNode = currentNode.next;
        }
    }
    public static void main(String[] args) {
       Node head = new Node(10);
       head.next = new Node(20);
       head.next.next = new Node(56) ;
       head.next.next.next = new Node(17);

       displayList(head);
    }
}
