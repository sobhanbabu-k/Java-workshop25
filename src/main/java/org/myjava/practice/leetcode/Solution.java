package org.myjava.practice.leetcode;



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersRecursive(l1, l2, 0);
    }

    private ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;
        int sum = val1 + val2 + carry;

        ListNode node = new ListNode(sum % 10);
        int newCarry = sum / 10;

        ListNode next1 = (l1 != null) ? l1.next : null;
        ListNode next2 = (l2 != null) ? l2.next : null;

        node.next = addTwoNumbersRecursive(next1, next2, newCarry);
        return node;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3,new ListNode(6,new ListNode(9)));
        ListNode lt = new ListNode(3,new ListNode(6,new ListNode(6)));
        Solution solution = new Solution();

        ListNode list = solution.addTwoNumbers(listNode,lt);
        while(list != null){
            System.out.print(list.val);
                list = list.next;

        }


    }
    private ListNode addTwoNumbersRecursives(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;
        int sum = val1 + val2 + carry;

        ListNode node = new ListNode(sum % 10);
        int newCarry = sum / 10;

        ListNode next1 = (l1 != null) ? l1.next : null;
        ListNode next2 = (l2 != null) ? l2.next : null;

        node.next = addTwoNumbersRecursive(next1, next2, newCarry);
        return node;
    }


    private ListNode addTwoNumberssRecursives(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;
        int sum = val1 + val2 + carry;

        ListNode node = new ListNode(sum % 10);
        int newCarry = sum / 10;

        ListNode next1 = (l1 != null) ? l1.next : null;
        ListNode next2 = (l2 != null) ? l2.next : null;

        node.next = addTwoNumbersRecursive(next1, next2, newCarry);
        return node;
    }

    private ListNode addTwoNumbersRecursivesss(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;
        int sum = val1 + val2 + carry;

        ListNode node = new ListNode(sum % 10);
        int newCarry = sum / 10;

        ListNode next1 = (l1 != null) ? l1.next : null;
        ListNode next2 = (l2 != null) ? l2.next : null;

        node.next = addTwoNumbersRecursive(next1, next2, newCarry);
        return node;
    }

    private ListNode addTwoNumbersRecursivessssss(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;
        int sum = val1 + val2 + carry;

        ListNode node = new ListNode(sum % 10);
        int newCarry = sum / 10;

        ListNode next1 = (l1 != null) ? l1.next : null;
        ListNode next2 = (l2 != null) ? l2.next : null;

        node.next = addTwoNumbersRecursive(next1, next2, newCarry);
        return node;
    }


}



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}