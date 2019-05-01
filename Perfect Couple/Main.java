import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int i,in;
      int arr[]=new int[n];
      for(i=0;i<n;i++)
      {
        arr[i]=scn.nextInt();
      }
      int val=scn.nextInt();
      for(i=0;i<n;i++)
      {
        for(in=i+1;in<n;in++)
        {
          if(arr[i]+arr[in]==val)
          {
            System.out.println(arr[i]+", "+arr[in]);
          }
 
        }
        
      }
    
    }
}