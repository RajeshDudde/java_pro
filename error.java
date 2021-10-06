import java.util.*;

public class Nexthigher
{
	public static void main(String args[])
	{
       Scanner sc=new Scanner(System.in);
       int s=sc.nextInt();
        String n=Integer.toString(s);
 //          System.out.println(n.charAt(1));
 char a[]=new char [n.length()];
 a=n.toCharArray();
 //      System.out.println(a[1]);
     int l=n.length();
     int pre=0;
      int f=0;
     for(int i=(l-1);i>=0;i--)
     {
     	if(i==(l-1))
     	{

          pre=a[i];
     	}
      else if(pre>a[i])
     	{
     		//System.out.println(a[i]);
     		int p=a[i]; //2
     		int h=i;  //2 i=
        //int f=0;
     		for(int j=i+1;j<=(l-1);j++)
     		{
     	         if(j==(i+1))
               {
                h=j;
               }
               if(a[j]<p)
               {
                  // swap(i,j,l,a);
               	    h=j;
                    f=1;
                   break;
               }
               // else
               // {
               // 	swap()
               // }
             //  p=a[j];
              

     		}
     		//System.out.println(i+" "+(h-1));
       // System.out.println(a[h]);
     		//pre=a[i];
        h=(f==1)?h:(l);
        // System.out.println(a[h]);
            swap(i,h-1,l,a);
            break;
     	}
     	pre=a[i];
     	
     }
     if(f==0)
     {
      System.out.println("none");
     }

	}
	public static void swap(int i,int j,int l,char a[])
	{
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		//int q=i+1;
         for(int n=i+1;n<(l-1);n++)
         {
         	//System.out.println(n+" "+(l-1));
               for(int k=i+1;k<l-1;k++)
               {
               		//System.out.println(k);
              // 	System.out.println(k +" "+(l-1));
               	if(a[k]>a[k+1])
               	{
               		//swap(a[k],a[k+1]);
               		char temp1=a[k];
               		a[k]=a[k+1];
               		a[k+1]=temp1;
               			//System.out.println(a[k]+" "+a[k+1]);
               	}
               }
         }
         for(int m=0;m<l;m++)
         {
         	System.out.print(a[m]+" ");
         }
         System.out.print("\n");
	}

}