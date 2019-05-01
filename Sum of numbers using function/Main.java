import java.util.Scanner;
class Main{
  public static int sum_num(int n)
  {
    int x,sum=0;
    for(x=1;x<=n;x++)
    {
      sum=sum+x;
    }
    return sum;
  }
	public static void main (String[] args){
	 Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int sum=sum_num(n);
      System.out.println(sum);
	}
}