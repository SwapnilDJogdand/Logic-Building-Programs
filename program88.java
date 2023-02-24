/*
write a program which display all elements which are prime from singly linear linked list.

Input linked list : |11|->|20|->|17|->|41|->|22|->|89|

Output : 11   17	41	89
*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;

class Node
{
    public int data;
    public Node head;
    public Node next;

    Node(int iData)
    {
        this.data = iData;
        this.head = null;
        this.next = null;
    }

    public void InsertFirst(int data)
    {
        Node NnewNode = new Node(data);
        
        if(head == null){
            head = NnewNode;
            return;
        }
        NnewNode.next = head;
        head = NnewNode;
    }

    public void DisplayList()
    {
        Node NCurrNode = head;

        if(NCurrNode == null)
        {
            System.out.println("Linked list is empty");
            return;
        }

        System.out.println("Data of linked list is : ");
        while(NCurrNode != null)
        {
            System.out.print("|"+NCurrNode.data+"|->");
            NCurrNode = NCurrNode.next;
        }
        System.out.print("|NULL|\n");
    }

    public void DisplayPrime()
    {
        Node NCurrent = head;

        while(NCurrent != null)
        {
            if((NCurrent.data % 2) != 0)
            {
                System.out.println("Prime data of singly liner linked list is : "+NCurrent.data);
            }
            NCurrent = NCurrent.next;
        }
    }
}
public class program88 {
    public static void main(String[] args) {
        Node Nobj = new Node(1);

        Nobj.InsertFirst(89);
        Nobj.InsertFirst(22);
        Nobj.InsertFirst(41);
        Nobj.InsertFirst(17);
        Nobj.InsertFirst(20);
        Nobj.InsertFirst(11);

        Nobj.DisplayList();

        Nobj.DisplayPrime();
    }
}
