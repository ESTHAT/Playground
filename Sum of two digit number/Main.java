import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner scn=new Scanner(System.in);
      	int n1=scn.nextInt();
      	int dig=n1%10;
      	int d=n1/10;
      	int sum = dig+d;
      	System.out.println(sum);
	}
}