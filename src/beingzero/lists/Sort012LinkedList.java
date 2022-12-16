package beingzero.lists;

public class Sort012LinkedList {
    public static void main(String[] args) {
        int[] keys = {1, 1, 0, 0, 2, 2};
        //int[] keys = {1, 2, 0, 0, 1, 2, 1, 2, 1};

        ListNode head = null;
        ListNode current = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            if (head == null) {
                head = new ListNode(keys[i]);
                current = head;
            } else {
                ListNode newNode = new ListNode(keys[i]);
                current.next = newNode;
                current = current.next;
            }
        }
        printList(head);
        head = sortList(head);
        printList(head);
    }

    //Function to sort a linked list of 0s, 1s and 2s.
    static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode zeroHead = new ListNode(0);
        ListNode firstHead = new ListNode(0);
        ListNode secondHead = new ListNode(0);
        ListNode zeroTail = zeroHead;
        ListNode firstTail = firstHead;
        ListNode secondTail = secondHead;
        while (current != null) {
            if (current.value == 0) {
                zeroTail.next = current;
                zeroTail = zeroTail.next;
            }
            if (current.value == 1) {
                firstTail.next = current;
                firstTail = firstTail.next;
            }
            if (current.value == 2) {
                secondTail.next = current;
                secondTail = secondTail.next;
            }
            current = current.next;
        }
        zeroTail.next = firstHead.next != null ? firstHead.next : secondHead.next;
        firstTail.next = secondHead.next;
        secondTail.next = null;
        head = zeroHead.next;
        return head;
    }
    public static void printList(ListNode head) {
        ListNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.value + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
}


//https://www.techiedelight.com/sort-linked-list-containing-0s-1s-2s/
//https://www.youtube.com/watch?v=JKYflBRNZnQ