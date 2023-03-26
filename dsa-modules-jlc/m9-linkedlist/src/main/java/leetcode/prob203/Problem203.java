package leetcode.prob203;

import lombok.ToString;
// Remove all the occurence of the given element
@ToString
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution{
    public  ListNode removeElements(ListNode headNode , int myval){
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = headNode;
        return null;
    }
}
public class Problem203 {
    public static void main(String[] args) {
       ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode headNode =  solution.removeElements(head, 2);
    }
}
