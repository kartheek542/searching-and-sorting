import java.util.Scanner;
public class FibonacciSearch
{
  public static int Fibonacci_Search(int[] a, int l, int u, int key)
  {
    if(l > u)
      return -1;
    int[] fib = {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765};
    int i = 0;
    int n = u-l;
    while(fib[i] <= n)
    {
      i++;
    }
    int fpoint = l+fib[i-1];
    if(a[fpoint] == key)
    {
      return fpoint;
    }
    else if(a[fpoint] < key)
    {
      return Fibonacci_Search(a,fpoint+1,u,key);
    }
    else
    {
      return Fibonacci_Search(a,l,fpoint-1,key);
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int i;
    for(i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }
    System.out.print("enter the key value : ");
    int key = sc.nextInt();
    int pos = Fibonacci_Search(a,0,n-1,key);
    if(pos == -1)
    {
      System.out.println("Key not found");
    }
    else
    {
      System.out.println("Key found at "+ pos);
    }
  }
}
