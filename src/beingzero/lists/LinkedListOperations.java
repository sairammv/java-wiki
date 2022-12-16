package beingzero.lists;

public class LinkedListOperations {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        printList(head);
        head = addNodeAtBegin(head, 0);
        System.out.println();
        printList(head);
        head = addNodeAtEnd(head, 50);
        System.out.println();
        printList(head);
    }

    static ListNode addNodeAtBegin(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        return newNode;
    }

    static ListNode addNodeAtEnd(ListNode head, int data) {
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        ListNode newNode = new ListNode(data);
        current.next = newNode;
        return head;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.print("null");
    }
}