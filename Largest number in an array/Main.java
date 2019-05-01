import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    int i,max;
    for(i=0;i<n;i++)
    {
      arr[i]=scn.nextInt();
    }
    if(arr[0]>arr[1])
      max=arr[0];
      else
        max=arr[1];
      for(i=2;i<n;i++)
      {
        if(arr[i]>max)
          max=arr[i];
      }
      System.out.println(max);
    
}
}