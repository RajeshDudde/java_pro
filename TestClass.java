import java.io.*;
import java.util.*;

class TestClass{
       static int n,m;
     static  char a[][]=new char[1001][1001];
     static  char b[][]=new char[1001][1001];
    public static void main(String args[]) throws Exception 
    {
       
       Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
      //  System.out.println(t);
       while(t-->0)
       {
          
          // TestClass test=new TestClass();
           //int p,q;
         n=sc.nextInt();
        m=sc.nextInt();
        // n=p;
        // m=q;
         for(int i=0;i<n;i++)
         {
              String s=sc.next();
             for(int j=0;j<m;j++)
             {
                 a[i][j]=s.charAt(j);
             }
         }
       
         //top
         for(int i=0;i<n;i++)
         {
              for(int j=0;j<m;j++)
             {
                 b[i][j]=a[i][j];
             }
         }
         int res=ll();
         //bottom
         for(int i=n-1;i>=0;i--)
         {
              for(int j=0;j<m;j++)
             {
                 b[n-i-1][j]=a[i][j];
             }
         }
         res=Math.max(ll(),res);
         //left
         for(int i=0;i<m;i++)
         {
              for(int j=0;j<n;j++)
             {
                 b[i][j]=a[j][i];
             }
         }
         res=Math.max(ll(),res);
         //right
          for(int i=m-1;i>=0;i--)
         {
              for(int j=0;j<n;j++)
             {
                 b[m-i-1][j]=a[i][j];
             }
         }
       
          res=Math.max(ll(),res);
            System.out.println(res);
       }
    }

       public static int ll()
       {
           int res=Integer.MIN_VALUE;
           for(int i=0;i<n;i++)
           {
               int cnt=0;
               for(int j=0;j<m;j++)
               {
                 if(b[i][j]=='#') 
                 {
                     b[i][j]='$';
                     if(b[i+1][j]=='#')
                     {
                          b[i+1][j]='$';
                     }
                     cnt++;
                 }  
                 else if(b[i][j]=='$')
                 {
                    if(b[i+1][j]=='#')
                    {
                        b[i+1][j]='$';
                    }
                    res=Math.max(res,cnt);
                    cnt=0;
                 }
                 else if(b[i][j]=='.')
                 {
                      res=Math.max(res,cnt);
                       cnt=0;
                 }
               
               }
                 res=Math.max(res,cnt);
           }
           return res;

       }
}

    

