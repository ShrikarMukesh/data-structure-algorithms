package leetcode.prob2;

// 2. Add Two Numbers

class ListNode {

	int val;
	ListNode next;

	public ListNode() {
	}
	ListNode(int val) {
		this.val = val;
	}
	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {

	public ListNode addTwoNumbers(ListNode list1, ListNode list2) {

		// To Hold the Result
		ListNode headNode = new ListNode(0);
		ListNode currNode = headNode;
		int carry = 0;

		while (list1 != null || list2 != null || carry !=0) {

			int a = (list1 != null) ? list1.val : 0;
			int b = (list2 != null) ? list2.val : 0;

			int sum = carry + a + b;
			carry = sum / 10;
			currNode.next = new ListNode(sum % 10);
			currNode = currNode.next;

			if (list1 != null) {
				list1 = list1.next;
			}

			if (list2 != null) {
				list2 = list2.next;
			}
		}

		return headNode.next;
	}

}

public class Problem2 {
	static void displayList(ListNode headNode) {
		ListNode currentNode = headNode;
		while (currentNode != null) {
			System.out.print(currentNode.val + "\t");
			currentNode = currentNode.next;
		}

		System.out.println("\n");
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(9);
		list1.next.next = new ListNode(3);

		displayList(list1);

		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(1);
		list2.next.next = new ListNode(3);
		list2.next.next.next = new ListNode(4);
		list2.next.next.next.next = new ListNode(5);

		displayList(list2);
		Solution mysolution = new Solution();
		ListNode mylist = mysolution.addTwoNumbers(list1, list2);

		displayList(mylist);
	}
}
