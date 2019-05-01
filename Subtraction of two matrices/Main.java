import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
  	Scanner scn=new Scanner(System.in);
    int r=scn.nextInt();
    int c=scn.nextInt();
    int matrix1[][]=new int[r][c];
    int matrix2[][]=new int[r][c];
    int sub[][]=new int[r][c];
    int i,j;
    for(i=0;i<matrix1.length;i++)
    {
      for(j=0;j<matrix1[i].length;j++)
      {
        matrix1[i][j]=scn.nextInt();
      }
    }
    for(i=0;i<matrix2.length;i++)
    {
      for(j=0;j<matrix2[i].length;j++)
      {
        matrix2[i][j]=scn.nextInt();
      }
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        sub[i][j]=matrix1[i][j]-matrix2[i][j];
      }
    }
     for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        System.out.print(sub[i][j] +" ");
      }
       System.out.print("\n");
    }
    
  }
}