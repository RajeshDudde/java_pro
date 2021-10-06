import java.io.*;
import java.util.*;
class Duplicate 
{  
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter array length");
		int c=sc.nextInt();
		int a[]=new int[c];

		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean x=con(a);
     System.out.println(x);
         
	}
	public static boolean con(int num[])
	{
		//Scanner sc=new Scanner(System.in);
		//List<Integer> l=new ArrayList<>();
	 HashSet<Integer> l=new  HashSet<>();
		for(int i=0;i<num.length;i++)
		{
			 if(l.contains(num[i]))
            {
                  
            	return true;
                
            }
             l.add(num[i]);
		}
           
            	
           return false;
		}

     
		
	}
		
