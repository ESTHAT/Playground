import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int a[]=new int[n];
      int arr[]=new int[n];
      int i,in=0;
      for(i=0;i<n;i++)
      {
        a[i]=scn.nextInt();
      }
      for(i=0;i<n;i++)
      {
        if(a[i]==0)
        {
          arr[in]=a[i];
          in++;
        }
      }
      for(i=0;i<n;i++)
      {
        if(a[i]!=0)
          System.out.print(a[i]+" " );
      }
      for(i=0;i<in;i++)
      {
        System.out.print(arr[i]+ " " );
      }
      
    }
}