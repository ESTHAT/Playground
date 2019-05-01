import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    int i;
    for(i=0;i<n;i++)
    {
      arr[i]=scn.nextInt();
    }
     perfect(arr,n);
  }
 
  public static void perfect(int arr[],int n)
  {
    boolean per=true;
    int j,current_batch=0;
    int batch_sum=arr[0]+arr[1]+arr[2];
    for(j=3;j<n;j=j+3)
    {
      current_batch=arr[j]+arr[j+1]+arr[j+2];
    }
    if(current_batch!=batch_sum)
    {
      per=false;
    }
    if(per==true)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}