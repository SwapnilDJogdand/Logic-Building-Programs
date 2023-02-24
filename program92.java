/* write a program which reverse each element of singly linked list.

Input linked list : |11|->|28|->|17|->|41|->|6|->|89|

Output :  |11|->|82|->|71|->|14|->|6|->|98|

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

    public void Reverse()
    {
        int iRev = 0, iNum = 0;

        while(head != null)
        {
            iNum = head.data;

            while(iNum > 0)
            {
                iRev = (iRev * 10) + iNum % 10;
                iNum = iNum / 10;
            }
            System.out.print(iRev+"\t");
            iRev = 0;
            head = head.next;
        }
    }
}

public class program92 {
    public static void main(String[] args) {
        Node Nobj = new Node(1);

        Nobj.InsertFirst(89);
        Nobj.InsertFirst(6);
        Nobj.InsertFirst(41);
        Nobj.InsertFirst(17);
        Nobj.InsertFirst(28);
        Nobj.InsertFirst(11);

        Nobj.DisplayList();

        Nobj.Reverse();
    }
}
