import java.io.*;
import java.util.*;
import java.lang.*;
class Binary
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 String s=sc.next();
 int x=0,ans=0;
 for(int i=s.length()-1;i>=0;i--)
{
//System.out.println((Integer.parseInt(String.valueOf(s.charAt(i)))));
  ans+=Integer.parseInt(String.valueOf(s.charAt(i)))*Math.pow(2,x);
 x++;
} 
System.out.println(ans);







/* long ans=0;
for(int i=0;i<s.length();i++)
{
 ans=10*ans+(s.charAt(i)-'0');
}
System.out.println(ans);*/
}
}
