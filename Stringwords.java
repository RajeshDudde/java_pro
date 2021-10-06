import java.io.*;
import java.util.*;
public class Stringwords
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		List<String> l =new ArrayList<String>();
		if(!s.isEmpty())
		{
		 l=Arrays.asList(s.split(" "));
	    }
		System.out.println(l.size());
	}
}