import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    int rev=0;
    while(num!=0)
    {
      rev=rev*10;
      rev=rev+num%10;
      num=num/10;
  }
    System.out.println(rev);
}
} 