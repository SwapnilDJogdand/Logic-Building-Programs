/* write a program which display Largest digits of all element from of singly linked list.

Input linked list : |11|->|250|->|532|->|419|

Output :  1	 5	5	9	

*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;

class Node {
    public int data;
    public Node head;
    public Node next;

    Node(int iData) {
        this.data = iData;
        this.head = null;
        this.next = null;
    }

    public void InsertFirst(int data) {
        Node NnewNode = new Node(data);

        if (head == null) {
            head = NnewNode;
            return;
        }
        NnewNode.next = head;
        head = NnewNode;
    }

    public void DisplayList() {
        Node NCurrNode = head;

        if (NCurrNode == null) {
            System.out.println("Linked list is empty");
            return;
        }

        System.out.println("Data of linked list is : ");
        while (NCurrNode != null) {
            System.out.print("|" + NCurrNode.data + "|->");
            NCurrNode = NCurrNode.next;
        }
        System.out.print("|NULL|\n");
    }

    public void LargestDigit() {
        while (head != null) {
            int iNum = 0, iMax = 0;

            iNum = head.data;

            while (iNum > 0) {
                if ((iMax < iNum % 10) || (iNum == head.data)) {
                    iMax = iNum % 10;
                }
                iNum /= 10;
            }
            System.out.print(iMax + "\t");
            head = head.next;
        }
    }
}

public class program96 {
    public static void main(String[] args) {
        Node Nobj = new Node(1);

        Nobj.InsertFirst(419);
        Nobj.InsertFirst(532);
        Nobj.InsertFirst(250);
        Nobj.InsertFirst(11);

        Nobj.DisplayList();

        Nobj.LargestDigit();
    }
}
