import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner scn=new Scanner(System.in);
      	int n=scn.nextInt();
      	int last_dig=n%10;
      	while(n>10)
        {
          n=n/10;
        }
      int sum=n+last_dig;
      System.out.println(sum);
	}
}