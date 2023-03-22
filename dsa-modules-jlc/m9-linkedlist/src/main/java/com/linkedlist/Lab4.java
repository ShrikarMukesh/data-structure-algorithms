package com.linkedlist;

//Insert Node at the beginning
public class Lab4 {

    static Node insertFirst(Node headNode ,int data){

        Node temp = new Node(data);
        temp.next = headNode;
        return temp;
    }
    static void displayList(Node currentNode){
        if(currentNode == null){
            return;
        }
        System.out.print(currentNode.data + "\t");
        displayList(currentNode.next);
    }

    public static void main(String[] args) {
        Node head = new Node(21);
        head.next = new Node(1111);
        head = insertFirst(head,33);
        head = insertFirst(head,11);
        displayList(head);
    }
}
//Time - O(1)
//Aux space - O(1)