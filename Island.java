import java.io.*;
import java.util.*;
class Island
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of rows and column");
     int r=sc.nextInt();
     int c=sc.nextInt();
     int [][]a=new int[r][c];
     System.out.println("enter "+r*c +"values");
       for(int i=0;i<r;i++)
       {
       	for(int j=0;j<c;j++)
       	{
       		a[i][j]=sc.nextInt();
       	}
       }
     Noisland(a);
	}
	public static int Noisland(int a[][])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==1)
				{
					count+=1;
					dfs(a,i,j);
				}
				
			}
		}
		 System.out.println(count);
		 return 0;
	}
	public  static void dfs(int a[][],int m,int n)
	{
		if(m<0|| n<0 || m>=a.length || n>=a[m].length|| a[m][n]==0)
			return ;
		a[m][n]=0;
		dfs(a,m+1,n);
		dfs(a,m-1,n);
		dfs(a,m,n-1);
		dfs(a,m,n+1);
	}
}