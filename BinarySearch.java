import java.util.Scanner;
public class BinarySearch
{
  public static int Binary_Search(int[] a, int l, int u, int key)
  {
    if(l > u)
      return -1;
    int mid = (l+u)/2;
    if(a[mid] == key)
    {
      return mid;
    }
    else if(a[mid] < key)
    {
      return Binary_Search(a,mid+1,u,key);
    }
    else
    {
      return Binary_Search(a,l,mid-1,key);
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
    int pos = Binary_Search(a,0,n-1,key);
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
