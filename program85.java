/*
write a program which return Largest element from singly liner linked list.
function should return position at which element is found.

Input linked list : |110|->|230|->|320|->|240|

Output : 320
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
        Node NCurrent = head;

        if(NCurrent == null){
            System.out.println("Linked list is empty");
            return;
        }
        
        System.out.println("Data of linked list is : ");
        while(NCurrent != null)
        {
            System.out.print("|"+NCurrent.data+"|->");
            NCurrent = NCurrent.next;
        }
        System.out.print("|NULL|\n");
    }

    public int Maximum()
    {
        int iMax = 0;
        Node NCurrent = head;

        if(NCurrent == null){
            return 0;
        }

        while(NCurrent != null){
            if(NCurrent.data > iMax){
                iMax = NCurrent.data;
            }
            NCurrent = NCurrent.next;
        }
        return iMax;
    }
}

public class program85 {
    public static void main(String[] args) {
        int iRet = 0;
        
        Node Nobj = new Node(1);

        Nobj.InsertFirst(240);
        Nobj.InsertFirst(320);
        Nobj.InsertFirst(230);
        Nobj.InsertFirst(110);
    
        Nobj.DisplayList();

        iRet = Nobj.Maximum();
        System.out.println("Maximum data is : "+ iRet);
    }
}
