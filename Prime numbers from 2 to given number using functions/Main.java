import java.util.Scanner;
class Main{
  public static boolean is_prime(int num)
  {
    boolean f=true;
    int i;
    for(i=2;i<=num/2;i++)
    {
      if(num%i==0)
      {
        f=false;
        break;
      }
    }
    return f;
  }
	public static void main (String[] args){
	Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    for(int num=2;num<=n;num++)
    {
      if(is_prime(num))
         System.out.println(num);
    }
	}
}