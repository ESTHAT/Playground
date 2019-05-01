import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=scn.nextInt();
      }
      boolean is_pal=true;
      int left=0,right=n-1;
      for(int i=0;i<n;i++)
      {
        if(arr[left]!=arr[right])
          is_pal=false;
       else
       {
         left++;
         right--;
       }
      }
      if(is_pal==true)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}