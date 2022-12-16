package beingzero;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);

        int totaltestcases = scanner.nextInt();

        for(int start =0; start < totaltestcases; start++){
            LinkedListSol head = null;
            LinkedListSol tail = null;

            int size = scanner.nextInt();

            for(int i = 0; i < size; i++){
                int element = scanner.nextInt();
                LinkedListSol num = new LinkedListSol(element);

                if(head==null)
                {
                    head = num;
                    tail = num;
                }
                else
                {
                    tail.next = num;
                    tail = num;
                }
            }

            printLinkedList(head);
        }

    }

    static void printLinkedList(LinkedListSol head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
class LinkedListSol{
    int data;
    LinkedListSol next;

    public LinkedListSol(int data){
        this.data = data;
    }


}