// public class Equalsubset {

//     public static int solution( int[] A ) {

//         int[] B = new int[A.length];
//         int[] C = new int[A.length];

//         int sum = 0;
//         for (int i=0; i< A.length; i++) {
//             sum += A[i];
//             B[i] = sum;
//             // System.out.print(B[i]+" ");
//         }   
//         // System.out.println();

//         sum = 0;
//         for (int i=A.length-1; i>=0; i--) {
//             sum += A[i];
//             C[i] = sum;
//             // System.out.print(C[i]+" ");
//         }
//         // System.out.println();

//         for (int i=0; i< A.length-1; i++) {
//             if (B[i] == C[i+1]) {
//                 System.out.println(i+" "+B[i]);
//                 return i;
//             }
//         }

//         return -1;

//     }

//      public static void main(String args[] ) {
//          int[] A = {1,28,41,67,67,68,87,100};
//          int[] B = {10, 20 , 30 , 5 , 40 , 50 , 40 , 15};        
//          solution(A);
//         solution(B);
//      }

// }




/*import java.io.*;
import java.util.*;
class Equalsubset
{
	public static void main(String args[])
	{
	  int arr[]={1,28,41,67,67,68,87,100};
	  int n=arr.length;
	  Arrays.sort(arr);
//System.out.println(n);
	  partition(arr,n);
	}
	public static void partition(int arr[],int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		if(sum%2==0)
		{
			subset(arr,n,sum/2);
		}
		else
		{
			int a=sum%2;
			subset(arr,n,(sum/2)+a);
		}
	}
	public static void subset(int arr[],int n,int sum)
	{

	/*	if(sum==0)
		{
			int l=arr.length;
			for(int i=0;i<l;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.print("\n");
		}
		if(n==0 && sum!=0)
		{
			int l=arr.length;
			for(int i=0;i<l;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.print("\n");
		}

boolean a=false;
int k=arr.length;

		if(arr[k-1]>sum)
		{
			subset(arr,k-1,sum);
			
		}
		if(a)
		{
		subset(arr,k-1,sum);
     	}
	  else
	    {
		subset(arr,k-1,sum-arr[k-1]);

	     }
	    for(int i=0;i<k;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    System.out.print("\n");
	}
}*/