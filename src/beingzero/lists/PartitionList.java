package beingzero.lists;

public class PartitionList {
    public static void main(String[] args) {
        int[] keys = {401, 143, 654, 910, 559, 582, 332, 26, 914, 611, 13, 160, 883, 212, 100, 341, 999, 436, 95, 969, 210, 181, 318, 330, 753, 422, 180, 271, 127, 299, 10};
        // int[] keys = { 26 , 914 , 611 , 13 };
        ListNode head = null, current = null;
        for (int i = 0; i < keys.length; i++) {
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
        head = partition(head, 88);
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.value + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode greaterHead = null;
        ListNode greaterTail = null;
        ListNode lowerHead = null;
        ListNode lowerTail = null;
        ListNode current = head;
        while (current != null) {
            if (current.value < x) {
                if (lowerHead == null) {
                    lowerHead = current;
                    lowerTail = current;
                } else {
                    lowerTail.next = current;
                    lowerTail = lowerTail.next;
                }
            } else {
                if (greaterHead == null) {
                    greaterHead = current;
                    greaterTail = current;
                } else {
                    greaterTail.next = current;
                    greaterTail = greaterTail.next;
                }
            }
            current = current.next;
        }

        if (lowerHead == null)
            return greaterHead;
        else {
            if (greaterHead == null) {
                return lowerHead;
            } else {
                greaterTail.next = null;
                lowerTail.next = greaterHead;
                return lowerHead;
            }
        }
    }
}
