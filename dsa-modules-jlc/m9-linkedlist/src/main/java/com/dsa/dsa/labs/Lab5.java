package com.dsa.dsa.labs;

public class Lab5 {
    static Node inserLast(Node headNode, int data){
        Node temp = new Node(data);
        if(headNode ==null){
            return temp;
        }
        Node currentNode =headNode;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next =temp;
        return headNode;
    }
    static void displayList(Node currentNode){
        if(currentNode == null){
            return;
        }
        System.out.println(currentNode.data);
        displayList(currentNode.next);
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        inserLast(head,34);
        inserLast(head,67);

        displayList(head);
    }
}
