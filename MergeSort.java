import java.util.Scanner;
public class MergeSort
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
  public static void merge(int[] a, int l, int mid, int u)
  {
    int n1 = mid-l+1;
    int n2 = u-mid;
    int[] x = new int[n1];
    int[] y = new int[n2];
    int i;
    int p = l;
    for(i=0;i<n1;i++)
    {
      x[i] = a[p];
      p++;
    }
    for(i=0;i<n2;i++)
    {
      y[i] = a[p];
      p++;
    }
    int p1 = 0;
    int p2 = 0;
    p = l;
    while((p1<n1)&&(p2<n2))
    {
      if(x[p1] < y[p2])
      {
        a[p++] = x[p1++];
      }
      else
      {
        a[p++] = y[p2++];
      }
    }
    while(p1 < n1)
    {
      a[p++] = x[p1++];
    }
    while(p2 < n2)
    {
      a[p++] = y[p2++];
    }
  }
  public static void merge_sort(int[] a, int l, int u)
  {
    if(l < u)
    {
      int mid = (l+u)/2;
      merge_sort(a,l,mid);
      merge_sort(a,mid+1,u);
      merge(a,l,mid,u);
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
    merge_sort(a,0,n-1);
    display(a);
  }
}
