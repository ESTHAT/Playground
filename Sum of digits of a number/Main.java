import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner scn=new Scanner(System.in);
      	int n=scn.nextInt();
      int sum=0,dig;
      	while(n>0)
        {
          dig=n%10;
          sum=sum+dig;
          n=n/10;
        }
      System.out.println(sum);
	}
}