//How to compare two Strings in java without using built in functions?
import java.io.*;
import java.util.*;
public class Stringcompare
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int a=s1.compareTo(s2);
		if (a==0)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println(" NOT same");
		}
		boolean s=false;
		if(s1.length()==s2.length())
	{
	  for(int i=0;i<s1.length();i++)
	  {
	   if(s1.charAt(i)!=s2.charAt(i))
	   {
            System.out.println(" NOT same");
            s=true;
            break;
           
	   }
	  }
	  if(s!=true)
	  {
	  	System.out.println("same");
	  }
	}
	else
	{
		 System.out.println(" NOT same");
	}

	}
}