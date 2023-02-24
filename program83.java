
/*
write a program which search last occurance of particular element from singly liner linked list.
function should return position at which element is found.

Input linked list : |10|->|20|->|30|->|40|->|50|->|30|->|70|
Input Element : 30
Output : 6

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////
import java.lang.*;
import java.util.*;

class Node {
    public int data;
    public Node head;
    public Node next;

    Node(int i) {
        this.data = i;
        this.head = null;
        this.next = null;
    }

    public void InsertFirst(int iData) {
        Node newNode = new Node(iData);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void DisplayList() {
        Node NCurrentNode = head;

        if (NCurrentNode == null) {
            System.out.println("linked list is empty");
            return;
        }

        System.out.println("Data from singly linked list is : ");

        while (NCurrentNode != null) {
            System.out.print("|" + NCurrentNode.data + "|->");
            NCurrentNode = NCurrentNode.next;
        }
        System.out.print("|NULL|\n");
    }

    public int SearchLastOccurance(int iNo) {
        int iCnt = 0, iLastOcc = 0;
        Node NCurrNode = head;

        if (NCurrNode == null) {
            return 0;
        } else {
            iCnt = 1;

            while (NCurrNode != null) {
                if (NCurrNode.data == iNo) {
                    iLastOcc = iCnt;
                }
                iCnt++;
                NCurrNode = NCurrNode.next;
            }
        }
        return iLastOcc;
    }
}

public class program83 {
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

        iRet = Nobj.SearchLastOccurance(iNum);
        if (iRet == 0) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element found at last position is : " + iRet);
        }
    }
}
