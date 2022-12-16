package beingzero.lists;

public class ListNode {
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
