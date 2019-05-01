import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner scn= new Scanner(System.in);
     int num= scn.nextInt();
      int temp=num;
      int n1=temp/100;
      int n2=num%10;
      int sum=n1+n2;
      System.out.println(sum);
	}
}