import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int c=findfact(n);
    System.out.print(c);
  }
  public static int findfact(int n)
  {
    if(n==0)
      return 1;
    else 
      return(n*findfact(n-1));
    
  }
}