import java.util.Scanner; //This package for reading input
public class Fibonacci { 
    
    public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt(); //Read an integer
        System.out.println(fib(n)); //Generate and print the n-th Fibonacci                
                                     //number
    } 
 static int fib(int n) {
int i;
for(i=1;i<=n;i++)
{
  
int g[]=Fibonacci.fibb(i);
}
  for(i=0;i<n;i++)
  {
    if(i==n)
    {
      return (g[i]);
    }
  }
}

static int fibb(int n)
{
  if(n==0)
  {
    return 0;
  }
  else if(n==1)
  {
    return 1;
  }
  else 
  {
    return (fibb(n-1)+fibb(n-2));
  }
}
  
}