import java.io.*;
import java.util.*;
class PascalTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows in PascalTriangle");
		int n=sc.nextInt();
		pascal(n);
	}
	public static void pascal(int n)
	 {
	 	List<List<Integer>> triangle=new ArrayList<>();
	 	if(n<=0)
	 		System.out.println("enter valid number");
         List<Integer> firstrow=new ArrayList<>();
         firstrow.add(1);
         triangle.add(firstrow);
         for(int i=1;i<n;i++)
         {
         	List<Integer> prerow=triangle.get(i-1);
         	List<Integer> row=new ArrayList<>();
         	row.add(1);
         	for(int j=1;j<i;j++)
         	{
         		row.add(prerow.get(j-1)+prerow.get(j));
         	}
         	row.add(1);
         	triangle.add(row);
         }
         for(List<Integer> i:triangle )
         {
         	System.out.println(i);
         }
	 }
}