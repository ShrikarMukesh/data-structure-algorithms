package com.graphs.impllinkedlist;

import lombok.ToString;

@ToString
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next =null;
    }
}

@ToString
public class MyQueue {

    int size; // size of array
    int capacity;

    Node frontNode;
    Node rearNode;
    public MyQueue(int capacity){
        this.capacity = capacity;
        this.size=0;
        this.frontNode = null;
        this.rearNode = null;

    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        //return (size==0);
        return (frontNode == null && rearNode ==null);
    }
    public boolean isFull(){
        return (size == capacity);
    }

    public void offer(int element){
        Node temp = new Node(element);
        //1.Empty List
        if(isEmpty()){
           frontNode = temp;
           rearNode = temp;
           size++;
        }
        //2.Non-Empty List
        rearNode.next = temp;
        rearNode = temp;
        size++;
    }

    public Integer poll(){
        if(isEmpty()){
            return null;
        }
        int element = frontNode.data;
        Node temp = frontNode;
        frontNode = frontNode.next;
        temp.next =null;
        size--;
        if(frontNode == null){
            rearNode = null;
        }
        return element;
    }

    public Integer peek(){
        if(isEmpty()){
            return null;
        }
        return frontNode.data;
    }

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(5);
        System.out.println(myQueue.toString());
        System.out.println(myQueue.size());
        System.out.println(myQueue.isEmpty());

        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);
        myQueue.offer(40);
        myQueue.offer(50);

        System.out.println(myQueue);
    }
}
