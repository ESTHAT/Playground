import java.util.Scanner;
class Main
{
  public static int sq(int n)
  {
    int squ=n*n;
    return squ;
  }
	public static void main (String[] args)
    {
	 Scanner scn=new Scanner(System.in);
      int n= scn.nextInt();
      int square=sq(n);
      System.out.println(square);
	} 
}