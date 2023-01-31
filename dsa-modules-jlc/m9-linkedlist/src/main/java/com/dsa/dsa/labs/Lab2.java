package com.dsa.dsa.labs;

public class Lab2 {
    static void displayList(Node currentNode){
        if(currentNode == null){
            return;
        }
        System.out.println(currentNode.data);
        displayList(currentNode.next);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(56) ;

        displayList(head);
    }
}
