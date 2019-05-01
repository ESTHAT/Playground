import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  	Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int list[]=new int[n];
    int i,max_index;
    for(i=0;i<n;i++)
    {
      list[i]=scn.nextInt();
    }
    if(list[0]>list[1])
      max_index=0;
    else
      max_index=1;
    for(i=2;i<n;i++)
    {
      if(list[max_index]<list[i])
             max_index=i;
    }
    System.out.println(max_index);
  }
}