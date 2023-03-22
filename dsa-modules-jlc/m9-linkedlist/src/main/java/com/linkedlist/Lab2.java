package com.linkedlist;

//Traverse the LinkedList using Recursive Style
public class Lab2 {
    static void displayList(Node currentNode){
        if(currentNode == null){
            return;
        }
        System.out.print(currentNode.data + "\t");
        displayList(currentNode.next);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(56) ;

        displayList(head);
    }
}
