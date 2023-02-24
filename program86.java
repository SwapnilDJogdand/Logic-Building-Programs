/*
write a program which return Smallest element from singly liner linked list.
function should return position at which element is found.

Input linked list : |110|->|230|->|20|->|240|->|640|

Output : 20
*/
//////////////////////////////////////////////////////////////////////////////

import java.lang.*;

class Node
{
    public int data;
    public Node head;
    public Node next;

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

        Node NCurrent = head;
        while(NCurrent.next != null)
        {
            NCurrent = NCurrent.next;
        }
        NCurrent.next = NnewNode;
    }   
    
    public void DisplayList()
    {
        Node NCurrNode = head;

        if(NCurrNode == null)
        {
            System.out.println("Linked list is empty");
            return;
        }

        System.out.println("Data from linked list is : ");
        while(NCurrNode != null)
        {
            System.out.print("|"+NCurrNode.data+"|->");
            NCurrNode = NCurrNode.next;
        }
        System.out.print("|NULL|\n");
    }

    public int Minimum()
    {
        int iMin = head.data;
        Node NCurrNode = head;

        if(NCurrNode == null)
        {
            return 0;
        }

        while(NCurrNode != null)
        {
            if(iMin > NCurrNode.data)
            {
                iMin = NCurrNode.data;
            }
            NCurrNode = NCurrNode.next;
        }
        return iMin;
    }
}

public class program86 {
    public static void main(String[] args) {
        int iRet = 0;
        Node Nobj = new Node(1);
        
        Nobj.InsertLast(110);
        Nobj.InsertLast(230);
        Nobj.InsertLast(20);
        Nobj.InsertLast(240);
        Nobj.InsertLast(640);

        Nobj.DisplayList();

        iRet = Nobj.Minimum();
        System.out.println("Minimum data is : "+iRet);
    }    
}
