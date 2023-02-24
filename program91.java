/* write a program which display addition of digit of element from singly linear linked list.

Input linked list : |110|->|230|->|20|->|240|->|640|

Output : 2	5	2	6	10

*/
////////////////////////////////////////////////////////////////////////////////////////////////

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

    public void SumDigit() {
        while (head != null) {
            int iNum = head.data;
            int iSum = 0;

            while (iNum > 0) {
                iSum += iNum % 10;
                iNum = iNum / 10;
            }
            System.out.print(iSum + "\t");
            head = head.next;
        }
    }
}

public class program91 {
    public static void main(String[] args) {
        Node Nobj = new Node(1);

        Nobj.InsertFirst(640);
        Nobj.InsertFirst(240);
        Nobj.InsertFirst(20);
        Nobj.InsertFirst(230);
        Nobj.InsertFirst(110);

        Nobj.DisplayList();

        Nobj.SumDigit();
    }
}
