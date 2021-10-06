import java.io.*;
import java.util.*;
class Mar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			//String s=sc.next();
			//System.out.println(s);
			int n=sc.nextInt();
			int s=1;
			int t=n;
			System.out.println(n);
			int a[]=new int[n]; //weights
			for(int i=0;i<n;i++)
			{
              a[i]=sc.nextInt();
			}
			int m=sc.nextInt();  //marked state
			int mark[]=new int[m]; // marked states array
			for(int i=0;i<m;i++)
			{
               mark[i]=sc.nextInt();
			}
			int k=sc.nextInt();  // k connections
            int mm[][]=new int[k][k]; // ajacency list
			for(int i=0;i<k;i++)
			{
                for(int j=0;j<k;j++)
                {
                	mm[i][j]=0;
                }
			}
			for(int i=0;i<k;i++)
			{
				int x=sc.nextInt();
				int y=sc.nextInt();
				mm[x-1][y-1]=1;
			}
			algo(mm,s,t,a,);


		}
	}
}