import java.util.Scanner;
class Main{
  public static void main(String args[]){
  	Scanner scn=new Scanner(System.in);
    int r=scn.nextInt();
    int c=scn.nextInt();
    int matrix1[][]=new int[r][c];
    int matrix2[][]=new int[c][r];
    int i,j;
    for(i=0;i<r;i++)
    {
     for(j=0;j<c;j++)
     {
       matrix1[i][j]=scn.nextInt();
     }
    }
    for(i=0;i<r;i++)
    {
     for(j=0;j<c;j++)
     {
       matrix2[j][i]=matrix1[i][j];
     }
    }
    for(i=0;i<c;i++)
    {
     for(j=0;j<r;j++)
     {
       System.out.print(matrix2[i][j] + " ");
     }
      System.out.print("\n");
    }
    
    
  }
}