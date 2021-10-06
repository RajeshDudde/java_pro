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
	public static Reverselinkedlist insert(Reverselinkedlist list,int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		if(list.head==null)
			list.head=newnode;

		else
		{
			Node last=list.head;
			while(last.next!=null)
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
		Reverselinkedlist ll=new Reverselinkedlist();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements in list");
		int x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.println("enter"+" "+(i+1)+" "+"element");
			int y=sc.nextInt();
		   ll=insert(ll,y);
		}
		
		reverse(ll.head);	
	}
	public static void printl(Node l)
	{
		Node curnode=l;
		while(curnode!=null)
		{
			System.out.print(curnode.data+" ");
			curnode=curnode.next;
		}
		System.out.println("\n");
	}
	public static void reverse(Node ll)
	{
      // Node cur=ll.head;
     
     Node prev=null;
     
      while(ll!=null)
      {
      	  Node ne=ll.next;
      	  ll.next=prev;
      	  prev=ll;
      	  ll=ne;
      }
      printl(prev);
	}
}