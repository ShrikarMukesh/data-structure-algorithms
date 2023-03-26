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

    public static Node reverse(Node head) {

        //Set prev node with null and current with head
        Node prev = null;
        Node current = head;
        while( current != null ) {

            //set temp node to current.next
            Node temp = current.next;
            //Point current.next to prev
            current.next = prev;
            //move prev and current by one
            prev = current;
            current = temp;
        }
        //set head node with prev
        head = prev;
        return prev;
    }
    public static void main(String[] args) {
        
        Node head = null;
        head = inserLast(head,34);
        head = inserLast(head,67);
        head = inserLast(head,676);
        head = inserLast(head,1);
        head = inserLast(head,4);
        displayList(head);

        head = reverse(head);
        System.out.println("----After Reverse----------");
        displayList(head);
        head = deleteFirst(head);
        System.out.println("----After Delete----------");System.out.println("\n");
        displayList(head);
    }
}
//Time - O(1)
//Aux - O(1)