import java.io.*;
import java.util.*;

class ReverseString
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter string");
	   String s=sc.nextLine();
	   /*StringBuffer st=new StringBuffer(s);
	   st=st.reverse();
	   s=st.toString();
	   System.out.println(s);*/
      
	 List<String> l=Arrays.asList(s.split(" "));
	   /*Collections.reverse(l);
	   for(String str:l)
	   {
	   	System.out.print(str+" ");
	   }
	   	System.out.print("\n");*/
       

       ListIterator<String> itr=l.listIterator(l.size());
       while(itr.hasPrevious())
       {
       	System.out.print(itr.previous()+" ");
       }
       System.out.print("\n");

	}
}