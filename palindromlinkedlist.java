import java.util.*;
class Palindromlinkedlist
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
	public static Palindromlinkedlist insert(Palindromlinkedlist list,int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		if(list.head==null)
		{
			list.head=newnode;
		}
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
	public static void printlist(Node l)
	{
       while(l!=null)
       {
       	System.out.print(l.data+" ");
         l=l.next;
       }
       System.out.println("\n");
	}
	public static boolean ispalindrom(Node head)
	{
      Node fast=head;
      Node slow=head;
      while(fast!=null && fast.next!=null)
      {
      	fast=fast.next.next;
      	slow=slow.next;
      }
      slow=reverse(slow);
      fast=head;
      while(slow!=null)
      {
      	if(slow.data!=fast.data)
      	{
      		return false;
      	}
      	slow=slow.next;
      	fast=fast.next;

      }
      return true;
	}
	public static Node reverse(Node head)
	{
		Node prev=null;
		while(head!=null)
		{
			Node ne=head.next;
			head.next=prev;
			prev=head;
			head=ne;

		}
		return prev;
	}
	public static void main(String args[])
	{
		Palindromlinkedlist ll=new Palindromlinkedlist();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements in list");
		int x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			System.out.println("enter"+" "+(i+1)+" "+"element");
			int y=sc.nextInt();
		   ll=insert(ll,y);
		}
          boolean a=ispalindrom(ll.head);
          System.out.println(a);
		//printlist(ll.head);
	}
}