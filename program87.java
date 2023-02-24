/* write a program which display all elements which are perfect from singly linear linked list.

Input linked list : |11|->|28|->|17|->|41|->|6|->|89|

Output : 6   28

*/
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;

class Node
{
    public int data;
    public Node next;
    public Node head;

    Node(int i)
    {
        this.data = i;
        this.head = null;
        this.next = null;
    }

    public void InsertLast(int data)
    {
        Node NnewNode = new Node(data);

        if(head == null)
        {
            head = NnewNode;
            return;
        }

        Node NCurrNode = head;
        while(NCurrNode.next != null)
        {
            NCurrNode = NCurrNode.next; 
        }
        NCurrNode.next = NnewNode;
    }

    public void DisplayList()
    {   
        Node nCurrNode = head;

        if(nCurrNode == null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        System.out.println("Data from linked list is : ");
        while(nCurrNode != null)
        {
            System.out.print("|"+nCurrNode.data+"|->");
            nCurrNode = nCurrNode.next;
        }
        System.out.print("|NULL|\n");
    }

    public void DisplayPerfect()
    {
        Node NCurrNode = head;

        while(NCurrNode != null)
        {
            if(NCurrNode.data % 2 == 0)
            {
                System.out.print("\nPerfect element is : "+NCurrNode.data);
            }
            NCurrNode = NCurrNode.next;
        }
    }
}

public class program87 {
    public static void main(String[] args) {
        Node Nobj = new Node(1);

        Nobj.InsertLast(11);
        Nobj.InsertLast(28);
        Nobj.InsertLast(17);
        Nobj.InsertLast(41);
        Nobj.InsertLast(6);
        Nobj.InsertLast(89);

        Nobj.DisplayList();
        
        Nobj.DisplayPerfect();
    }    
}
