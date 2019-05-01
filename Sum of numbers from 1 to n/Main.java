import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int i=1;
    int sum=0;
    for(;i<=n;i++)
    {
      sum=sum+i;
	}
      System.out.println(sum);
    }
}