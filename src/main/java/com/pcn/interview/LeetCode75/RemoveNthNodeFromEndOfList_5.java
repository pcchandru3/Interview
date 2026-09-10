package com.pcn.interview.LeetCode75;




public class RemoveNthNodeFromEndOfList_5 {
// Given the head of a linked list, remove the nth node from the end
// of the list and return its head.

// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

// Remove Last / Middle node
// Remove First node



    public class ListNode {
        int val;
        ListNode next;

        ListNode() {};
        ListNode (int val) {this.val = val; }
        ListNode (int val, ListNode next) { this.val = val; this.next = next; }
    
    }


    // Time : O(N)
    // Space: O(1)
    public ListNode removeNthNodeFromEndList(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;

        for (int i=1;i<=n;i++)
            p1 = p1.next;

        if(p1 == null)
            return p2.next;
        
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p2.next = p2.next.next;

        return head;

    }


    public ListNode removeNthNodeFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(0, head);
        ListNode fast = preHead;
        ListNode slow = preHead;

        for (int i=1;i<=n+1;i++)
            fast = fast.next;

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return preHead.next;

    }





}
