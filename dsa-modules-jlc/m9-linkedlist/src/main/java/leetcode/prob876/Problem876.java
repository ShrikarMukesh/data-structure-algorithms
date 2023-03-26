package leetcode.prob876;

import lombok.ToString;

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
    public  ListNode middleNode(ListNode listNode){
       ListNode slow = listNode;
       ListNode fast = listNode;
       while (fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow;
    }
}
public class Problem876 {
    public static void main(String[] args) {
       ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution solution = new Solution();
        ListNode middileElement =  solution.middleNode(head);
        System.out.println(middileElement);

    }
}
