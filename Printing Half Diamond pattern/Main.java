import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner scn=new Scanner(System.in);
      	int n=scn.nextInt();
      	int row,col,sp;
      	for(row=1;row<=n;row++)
        {
          for(sp=1;sp<=n-row;sp++)
          {
            System.out.print(" ");
          }
          for(col=1;col<=2*row-1;col++)
          {
            System.out.print("*");
          }
          System.out.print("\n");
        }
       
	}
}