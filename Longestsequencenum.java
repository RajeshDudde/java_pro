import java.io.*;
import java.lang.*;
import java.util.*;

public class Longestsequencenum
{
  
   public static void main(String args[])
   {
   	Scanner sc=new Scanner(System.in);
   	System.out.println("enter array length");
   	int l=sc.nextInt();
   	int[] a=new int[l];
   	for(int i=0;i<l;i++)
   	{
   		a[i]=sc.nextInt();
   	}
   int ans;
   Longestsequence ls=new  Longestsequence();
   ans=ls.longest(a);
   	System.out.println(ans);
   }
}
class Longestsequence
{
	public int longest(int[] a)
	{
		int max_longest=0;
		int cur_num,cur_seq_len;
		for(int i=0;i<a.length;i++)
		{
			cur_num=a[i];
			cur_seq_len=1;
			while(nextexist(a,cur_num+1))
			{
				cur_num+=1;
				cur_seq_len+=1;
			}
			max_longest=Math.max(max_longest,cur_seq_len);
		}
		return max_longest;
	}
	boolean nextexist(int[] arr,int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				return true;
			}
		}
		return false;
	}
}