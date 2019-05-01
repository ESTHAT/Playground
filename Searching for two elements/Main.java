import java.util.Scanner;
class Main{
    public static void main(String args[]){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int arr[]=new int[n];
    int i;
    for(i=0;i<n;i++)
    {
      arr[i]=scn.nextInt();
    }
      int elem1=scn.nextInt();
      int elem2=scn.nextInt();
      int id1=-1;
      int id2=-1;
      for(i=0;i<n;i++)
      {
        if(arr[i]==elem1)
        {
          id1=i;
        }
        if(arr[i]==elem2)
        {
          id2=i;
        }
      }
      System.out.println(id1);
      System.out.println(id2);
    }
}