/*
write a program which return addition of all element from singly liner linked list.
function should return position at which element is found.

Input linked list : |10|->|20|->|30|->|40|

Output : 100
*/
//////////////////////////////////////////////////////////////////////////////////////

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
        Node NCurrentNode = head;

        if(NCurrentNode == null){
            System.out.println("Linked list is empty");
            return;
        }
        System.out.println("Data from singly linked list is : ");

        while(NCurrentNode != null){
            System.out.print("|"+NCurrentNode.data+"|->");
            NCurrentNode = NCurrentNode.next;
        }
        System.out.print("NULL\n");
    }

    public int Addition()
    {
        int iAdd = 0;
        Node NCurrent = head;

        if(NCurrent == null){
            return 0;
        }
        
        while(NCurrent != null)
        {
            iAdd += NCurrent.data;
            NCurrent = NCurrent.next;
        }
        return iAdd;
    }
}

public class program84 {
    public static void main(String[] args) {
        int iRet = 0;
        Node Nobj = new Node(1);

        Nobj.InsertFirst(40);
        Nobj.InsertFirst(30);
        Nobj.InsertFirst(20);
        Nobj.InsertFirst(10);

        Nobj.DisplayList();

        iRet = Nobj.Addition();
        System.out.println("Addition of all element is : "+ iRet);
    }
}
