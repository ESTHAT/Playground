import java.util.Scanner;
class Main{
  public static int great(int n1,int n2)
  {
    if(n1>n2)
      return n1;
    else
      return n2;
  }
	public static void main (String[] args){
	 Scanner scn=new Scanner(System.in);
      int n1=scn.nextInt();
      int n2= scn.nextInt();
      int n3=scn.nextInt();
      int c=great(n1,n2);
      int d=great(c,n3);
        System.out.println(d);
	}
}