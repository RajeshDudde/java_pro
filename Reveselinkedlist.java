import java.util.*;

public class Reverselinkedlist
{
	Node head;
	public static class Node
	{
     int data;
     Node next;
      Node(int d)
      {
          data=d;
          next=null;
      }
	}
	public static Reverselinkedlist insert(ReverseLinkedList list,int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		if(list.head==null)
			list.head=newnode;

		else
		{
			Node last=list.head;
			while(list.next!=NULL)
			{
				last=last.next;
			}
			last.next=newnode;
		}
		return list;
	}
	public static  void printlist(Reverselinkedlist list)
	{
		Node curnode=list.head;
		while(curnode!=null)
		{
			System.out.println(curnode.data+" ");
			curnode=curnode.next;
		}
	}
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements in list");
		int x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.println("enter"+i+"element");
			int y=sc.nextInt();
		   ll=insert(ll,y);
		}
		//reverse(ll);	
	}
	// public static reverse(Reverselinkedlist ll)
	// {
       
	// }
}