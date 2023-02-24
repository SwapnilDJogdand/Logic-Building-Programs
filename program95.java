/* write a program which display Product of all digits of all element from of singly linked list.

Input linked list : |11|->|20|->|32|->|41|

Output :  1	 2	6	4	

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

    public void Product()
    {
        while(head != null)
        {
            int iNum = 0;
            int iProduct = 1;
            iNum = head.data;

            while(iNum > 0)
            {
                iProduct = iProduct * ((iNum % 10 == 0) ? 1 : iNum % 10);
                iNum /= 10;
            }
            System.out.print(iProduct+"\t");
            head = head.next;
        }
    }
}

public class program95 {
    public static void main(String[] args) {
        Node Nobj = new Node(1);

        Nobj.InsertFirst(41);
        Nobj.InsertFirst(32);
        Nobj.InsertFirst(20);
        Nobj.InsertFirst(11);

        Nobj.DisplayList(); 
        
        Nobj.Product();
    }
}
