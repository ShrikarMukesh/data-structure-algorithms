package com.linkedlist;
//Insert Node at given position of the LinkedList
public class Lab6 {
    static Node inserAtGivenPosition(Node headNode, int position, int data){
        Node temp = new Node(data);
         if(position ==1){
             temp.next = headNode;
             return temp;
         }
         Node currentNode = headNode;
         for (int i=1;i<=position-2 && currentNode !=null ;i++){
             currentNode = currentNode.next;
         }
         temp.next = currentNode.next;
         currentNode.next = temp;
         return headNode;

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
        displayList(head);
        System.out.println("----Before Position----------");
        head = inserAtGivenPosition(head,1, 56);
        head = inserAtGivenPosition(head,2, 67);
        head = inserAtGivenPosition(head,2, 676);
        displayList(head);
    }
}
