/* 
write a program which returns addition of all even element from singly linear linked list.
Input linked list : |11|->|20|->|32|->|41|
Output : 52
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

    public int AdditionEven()
    {
        int iAdd = 0;
        Node NCurrent = head;

        while(NCurrent != null)
        {
            if((NCurrent.data % 2) == 0)
            {
                iAdd += NCurrent.data; 
            }
            NCurrent = NCurrent.next;
        }
        return iAdd;
    }
}
public class program89 {
    public static void main(String[] args) {
        int iRet = 0;
        Node Nobj = new Node(1);

        Nobj.InsertFirst(41);
        Nobj.InsertFirst(32);
        Nobj.InsertFirst(20);
        Nobj.InsertFirst(11);

        Nobj.DisplayList();

        iRet = Nobj.AdditionEven();
        System.out.println("In Singly liner linked list all even data addition is : " + iRet);
    }
}
