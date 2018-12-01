package leetcode.src;

import leetcode.src.ListNode;

public class addTwoNumbers {
    /** 主方法 */
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(2);
        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(9);
        ListNode ans = addTwoNumbers(l1, l2);
        System.out.println(ans.next.next.val);
    }

    /** 返回两个数的下标 **/
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }
}
