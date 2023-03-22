package com.linkedlist;

//Insert Node at end of the LinkedList
public class Lab5 {

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
        displayList(head);
    }
}
