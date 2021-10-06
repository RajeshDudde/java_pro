import java.io.*;
import java.util.*;
import java.lang.*;
class Alpha
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
ArrayList<String> l=new ArrayList<>
(Arrays.asList(s.split(" ")));
Iterator<String> str=l.iterator();
int ma=0;
while(str.hasNext())
{
  ma=Math.max(ma,str.next().length());
}
System.out.println(ma);
}
}