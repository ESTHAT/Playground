import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int row,col,sp;
      for(row=1;row<=n;row++)
      {
        for(col=1;col<=n;col++)
        {
          if(row==1||row==n)
            System.out.print("*");
          else
         break;
        }
        if(row!=1&&row!=n)
        {
        System.out.print("*");
        for(sp=1;sp<=n-2;sp++)
          System.out.print(" ");
        System.out.print("*");
        }
        System.out.print("\n");
        
      }
      
	}
}