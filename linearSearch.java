import java.util.Scanner;
public class linearSearch
{
  public static int Linear_Search(int[] a, int key)
  {
    int i;
    for(i=0;i<a.length;i++)
    {
      if(a[i] == key)
      {
        return i;
      }
    }
    return -1;
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
    System.out.println("enter the key value : ");
    int key = sc.nextInt();
    int pos = Linear_Search(a,key);
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
