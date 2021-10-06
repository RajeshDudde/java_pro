import java.io.*;
import java.util.*;

public class EvenString
{
public static void main(String args[])
{
String s;
Scanner sc=new Scanner(System.in);
System.out.println("enter string to find even words in string ");
s=sc.nextLine();
List<String> l=Arrays.asList(s.split(" "));
for(String str:l)
{
if(str.length()%2==0)
{
System.out.println(str);
}
}
}
}