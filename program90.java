/* write a program which return addition second maximum element from singly linear linked list.

Input linked list : |110|->|230|->|320|->|240|

Output : 240

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

    public int SecondMax()
    {
       int iSecMax = 0, iMax = 0;

       iSecMax = head.data;
       iMax = head.data;

       while(head != null)
       {
            if(head.data > iMax)
            {
                iSecMax = iMax;
                iMax = head.data;
            }
            else if(head.data > iSecMax)
            {
                iSecMax = head.data;
            }
            head = head.next;
       }
       return iSecMax;
    }
}
public class program90 {
    public static void main(String[] args) {
        int iRet = 0;
        Node Nobj = new Node(1);

        Nobj.InsertFirst(240);
        Nobj.InsertFirst(320);
        Nobj.InsertFirst(230);
        Nobj.InsertFirst(110);

        Nobj.DisplayList();

        iRet = Nobj.SecondMax();
        System.out.println("In Singly liner linked list Second Maximum data is : " + iRet);
    }
}
