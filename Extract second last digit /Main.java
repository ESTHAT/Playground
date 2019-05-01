import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner scn=new Scanner(System.in);
      	int n=scn.nextInt();
      	int dig=n%100;
      	int d=dig/10;
      	System.out.println(d);
	}
}