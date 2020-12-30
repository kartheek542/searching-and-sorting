import java.util.Scanner;
public class QuickSort
{
  public static void display(int[] a)
  {
    int i;
    for(i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println("");
  }
  public static int partition(int[] a, int l, int u)
  {
    int i;
    int p = l;
    for(i=l+1;i<=u;i++)
    {
      if(a[i] <= a[l])
      {
        p++;
        int temp = a[p];
        a[p] = a[i];
        a[i] = temp;
      }
    }
    int temp = a[p];
    a[p] = a[l];
    a[l] = temp;
    return p;
  }
  public static void quick_sort(int[] a, int l, int u)
  {
    if(l < u)
    {
      int p = partition(a,l,u);
      quick_sort(a,l,p-1);
      quick_sort(a,p+1,u);
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
    quick_sort(a,0,n-1);
    display(a);
  }
}
