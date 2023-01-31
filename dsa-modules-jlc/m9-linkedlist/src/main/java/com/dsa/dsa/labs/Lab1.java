package com.dsa.dsa.labs;
//Traverse the LinkedList using Recursive Style
public class Lab1 {
    static void displayList(Node headNode){
        Node currentNode = headNode;
        while (currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
    public static void main(String[] args) {
       Node head = new Node(10);
       head.next = new Node(20);
       head.next.next = new Node(56) ;

       displayList(head);
    }
}
