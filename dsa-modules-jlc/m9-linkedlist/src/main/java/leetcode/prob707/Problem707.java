package leetcode.prob707;

// 707. Design Linked List

class Node {
	int val;
	Node next;

	Node() {
	}

	Node(int val) {
		this.val = val;
	}
}

class MyLinkedList {

	int size;
	Node headNode;

	public MyLinkedList() {
		this.size = 0;
		this.headNode = new Node(0); // Sentinel Node
	}

	public int size() {
		return size;
	}
	
	public void addAtIndex(int index, int val) { // (0,10)

		if (index < 0 || index > size) {
			return;
		}

		Node temp = new Node(val);
		
		Node currNode = this.headNode;
		for(int i=0;i<index ;i++) {
			currNode = currNode.next;
		}
		
		temp.next = currNode.next;
		currNode.next = temp;
		size++;
		
	}

	public void addAtHead(int val) {
		addAtIndex(0,val);
	}

	public void addAtTail(int val) {
		addAtIndex(size,val);
	}

	public int get(int index) {
		if (index < 0 || index >= size) {
			return -1;
		}

		Node currNode = this.headNode;
		for(int i=0;i<index+1 ;i++) {
			currNode = currNode.next;
		}
		
		return currNode.val;
	}

	public void deleteAtIndex(int index) {
		
		if (index < 0 || index >= size) {
			return;
		}
		
		Node currNode = this.headNode;
		for(int i=0;i<index ;i++) {
			currNode = currNode.next;
		}
		
		Node temp = currNode.next;
		currNode.next = currNode.next.next;
		temp.next=null;
		
		size--;
		
	}
	
	public String toString() {
		if (this.headNode.next == null) {
			return "[]";
		}

		String str = "[";
		Node currentNode = this.headNode.next;
		while (currentNode != null) {
			str = str + "" + currentNode.val + " , ";
			currentNode = currentNode.next;
		}
		str = str.substring(0, str.length() - 2);
		str = str + "]";

		return str;
	}
	
}

public class Problem707 {
	public static void main(String[] args) {

		MyLinkedList mylist = new MyLinkedList();
		
		System.out.println(mylist);
		System.out.println(mylist.size());
		
		mylist.addAtHead(10);
		mylist.addAtHead(20);
		mylist.addAtHead(30);
		
		mylist.addAtTail(88);
		mylist.addAtTail(99);
				
		System.out.println(mylist);
		System.out.println(mylist.size());
		
		mylist.addAtIndex(3, 555);
		mylist.addAtIndex(4, 666);
		
		System.out.println(mylist);
		System.out.println(mylist.size());
		
		mylist.deleteAtIndex(3);
		mylist.deleteAtIndex(3);
		
		System.out.println(mylist);
		System.out.println(mylist.size());
		System.out.println("-----------");
		
		System.out.println(mylist.get(-1));
		System.out.println(mylist.get(0));
		System.out.println(mylist.get(1));
		System.out.println(mylist.get(5));
		System.out.println(mylist.get(9));
		
	}
}
