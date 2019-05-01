import java.util.Scanner;
class Main{
	public static void main (String[] args){
    Scanner scn= new Scanner(System.in);
    int num=scn.nextInt();
    int fact=1;
    while(num>0)
    {
      fact=fact*num;
      num=num-1;
    }
      System.out.println(fact);
      
	}
}