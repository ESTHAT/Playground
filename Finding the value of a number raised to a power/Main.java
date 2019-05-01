import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner scn=new Scanner(System.in);
      int b=scn.nextInt();
      int e= scn.nextInt();
      int num=1;
      while(e>=1)
      {
        num=b*num;
        e--;
      }
      System.out.println(num);
    }
}