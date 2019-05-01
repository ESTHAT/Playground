import java.util.Scanner;
class Main{
	public static void main (String[] args){
	int row,col;
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    for(row=1;row<=n;row++)
    {
      for(col=0;col<row;col++)
      {
        System.out.print(row);
      }
      System.out.print("\n");
    }
	}
}