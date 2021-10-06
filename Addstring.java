import java.io.*;
import java.util.*;
public class Addstring
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter two strings to add only integers:");
String s1=sc.next();
String s2=sc.next();
//System.out.println(s1);
//System.out.println(s2);



/*  StringBuffer sbr1 = new StringBuffer(s1);
  sbr1=sbr1.reverse();
  s1=sbr1.toString();
  StringBuffer sbr2 = new StringBuffer(s2);
  sbr2=sbr2.reverse();
   s2=sbr2.toString();
//System.out.println(sbr);
//char a[]=s1.toCharArray();
//char b[]=s2.toCharArray();
*/





int i,j;
int len1;
len1=s1.length();
int len2;
len2=s2.length();
int extra=0;



int m=0;

if(len2>len1)
{
  String temp=s1+s2;
 // System.out.println(temp);
  s2=temp.substring(0,s2.length()-s1.length());
//System.out.println(s2);
  s1=temp.substring(s2.length());
//System.out.println(s1);
 
}
len1=s1.length();
len2=s2.length();
int[] ar=new int[len1];
//System.out.println(len1+" "+len2);
if(len1>=len2)
{
  j=len2-1;
  for(i=len1-1;i>=0;i--)
  {
  char a=s1.charAt(i);
  String aa=Character.toString(a);
 
  if(j>=0)
  {
   char b=s2.charAt(j);

   String bb=Character.toString(b);
   int sum=Integer.parseInt(aa)+Integer.parseInt(bb);
      if(extra>0)
      {
       sum+=extra;
        extra=0;
      }
   if(sum>9)
   {
  // int sum=Integer.parseInt(aa)+Integer.parseInt(bb);
   extra=sum%10;
   ar[m]=sum/10;
// System.out.println(ar[m]+" "+m);
    m++;
   }
   else
  {
    ar[m]=sum;
 //System.out.println(ar[m]+" "+m);
     m++;
  }
   j--;
  }
 else
 {
        if(extra>0)
        {

          if((Integer.parseInt(aa)+extra)>9)
          {
             extra=0;
           extra=(Integer.parseInt(aa)+extra)%10;
           ar[m]=(Integer.parseInt(aa)+extra)/10;
// System.out.println(ar[m]+" "+m);
           m++;
          
           }
          else
           {
            ar[m]=(Integer.parseInt(aa)+extra);
// System.out.println(ar[m]+" "+m);
            extra=0;
             m++;
            }
         }
        else
        {
           ar[m]=Integer.parseInt(aa);
 //System.out.println(ar[m]+" "+m);
           m++;
        }

}

}
}

for(int k=len1-1;k>=0;k--)
{
System.out.print(ar[k]);

}
System.out.println("\n");

}
}

