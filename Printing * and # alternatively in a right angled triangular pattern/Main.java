import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner scn = new Scanner(System.in);
  		int n=scn.nextInt();
      	int row,col,num=1;
      for(row=1;row<=n;row++)
      {
        for(col=1;col<=row;col++)
        {
          if(num%2==1)
          {
         System.out.print("*");
          }
          else
          {
            System.out.print("#");
          }
          num++;
      }
        System.out.print("\n");
    }
}
}