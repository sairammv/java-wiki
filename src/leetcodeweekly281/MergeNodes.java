package leetcodeweekly281;

import java.util.Iterator;
import java.util.Stack;

public class MergeNodes {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(2);
        ListNode listNode7 = new ListNode(0);
        ListNode listNode8 = new ListNode(6);
        ListNode listNode9 = new ListNode(4);
        ListNode listNode10 = new ListNode(0);
        ListNode listNode11 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;
        listNode9.next = listNode10;
        listNode10.next = listNode11;
        System.out.println(mergeNodes(listNode));
    }

    public static ListNode mergeNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode result = null;
        while (head != null) {
            int value = head.val;
            if (value == 0) {
                stack.add(value);
            } else {
                int val = stack.peek();
                stack.pop();
                stack.add(val + value);
            }
            head = head.next;
        }
        Iterator<Integer> value = stack.iterator();

        while (value.hasNext()) {
            Integer s = value.next();
            if (s != 0) {
                result = insert(result, s);
            }
        }
        return result;
    }

    public static ListNode insert(ListNode list, int data) {
        ListNode new_node = new ListNode(data);
        new_node.next = null;
        if (list == null) {
            list = new_node;
        } else {
            ListNode last = list;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
}

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
