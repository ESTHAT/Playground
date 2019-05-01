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
          if(row%2==1)
          {
            if(col==n)
          		System.out.print(row+1);
            else
              System.out.print(row);
          }
          else
          {
            if(col==1)
              System.out.print(row+1);
            else
              System.out.print(row);
          }
        }
        System.out.print("\n");
      }
	}
}