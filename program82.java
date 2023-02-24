/* 
write a program which search first occurance of particular element from singly liner linked list.
function should return position at which element is found.

Input linked list : |10|->|20|->|30|->|40|->|50|->|30|->|70|
Input Element : 30
Output : 3

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.Scanner;

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
        Node nCurrNode = head;
        if(nCurrNode == null){
            System.out.println("Linked list is empty");
            return;
        }
        System.out.println("Data from Singly Linked List is : ");

        while(nCurrNode != null)
        {
            System.out.print("|"+nCurrNode.data+"|->");
            nCurrNode = nCurrNode.next;
        }
        System.out.println("NULL");
    }

    public int SearchFirstOccurance(int iNo)
    {
        int iCnt = 0, iSearch = 0;
        Node nCurrNode = head;

        if(nCurrNode == null){
           return 0;
        }
        else{
            iCnt = 1;

            while(nCurrNode != null)
            {
                if(nCurrNode.data == iNo){
                    return iCnt;
                }
                iCnt++;
                nCurrNode = nCurrNode.next;
            }
        }
        return iCnt;
    }
}


public class program82 {
    public static void main(String[] args) {
        int iNum = 0, iRet = 0;
        Scanner Sobj = new Scanner(System.in);

        Node Nobj = new Node(1);
        
        Nobj.InsertFirst(70);
        Nobj.InsertFirst(30);
        Nobj.InsertFirst(50);
        Nobj.InsertFirst(40);
        Nobj.InsertFirst(30);
        Nobj.InsertFirst(20);
        Nobj.InsertFirst(10);

        Nobj.DisplayList();

        System.out.println("Enter number that you want to search : ");
        iNum = Sobj.nextInt();

        iRet = Nobj.SearchFirstOccurance(iNum);
        System.out.println("Element found at 1 position is : "+iRet);
    }    
}
