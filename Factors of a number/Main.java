import java.util.Scanner;
class Main{
	public static void main (String[] args){
	Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int i;
    for(i=1;i<=n;i++)
    {
      if(n%i==0)
    System.out.println(i);
    }
   
	}
}