package lists;

class ListNode {
    int value;
    ListNode next;
    ListNode() {
    }
    ListNode(int data) {
        value = data;
    }
    ListNode addBegin(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
        return head;
    }
    void addEnd(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        ListNode ptr = head;
        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
        ptr.next = newNode;

        System.out.println("after inserting new node at end");
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}

public class LinkedListRun {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ListNode listnode1 = new ListNode(4);
        ListNode listnode2 = new ListNode(3);
        ListNode listnode3 = new ListNode(10);
        listnode1.next = listnode2;
        listnode2.next = listnode3;
        listnode3.next = null;

        ListNode ptr = listnode1;

        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
        System.out.println("After inserting new node in beginning");
        ListNode begin = new ListNode();
        ListNode result = begin.addBegin(listnode1, 25);

        ListNode l1 = new ListNode();
        l1.addEnd(result, 26);
    }
}
