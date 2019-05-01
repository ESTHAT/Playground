import java.util.Scanner;
class Main{
	public static void main (String[] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int row,col,sp,x=1;
    for(row=1;row<=n;row++)
    {
      for(sp=1;sp<=n-row;sp++)
      {
        System.out.print(" ");
      }
      for(col=1;col<=row;col++)
      {
        System.out.print(x );
        System.out.print(" ");
        x++;
      }
      System.out.print("\n");
    }
      
    }    
}