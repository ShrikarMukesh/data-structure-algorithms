package com.linkedlist;

//delete at the beginning of LinkedList
public class Lab7 {

    static Node deleteFirst(Node headNode){
        if(headNode == null){
            return null;
        }
       return headNode.next;
    }
    static Node inserLast(Node headNode, int data){
        Node currentNode = new Node(data);
        if(headNode == null){
            return currentNode;
        }
        Node temp = headNode;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = currentNode;
        return headNode;
    }
    static void displayList(Node currentNode){
        if(currentNode == null){
            return;
        }
        System.out.print(currentNode.data + "\t");
        displayList(currentNode.next);

    }
    public static void main(String[] args) {
        
        Node head = null;
        head = inserLast(head,34);
        head = inserLast(head,67);
        head = inserLast(head,676);
        head = inserLast(head,1);
        head = inserLast(head,4);
        displayList(head);
        head = deleteFirst(head);
        System.out.println("----After Delete----------");System.out.println("\n");
        displayList(head);
    }
}
//Time - O(1)
//Aux - O(1)