import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int dig;
    while(n>100)
    {
      n=n/10;
    }
    dig=n%10;
    System.out.println(dig);
    
    
    
    
  }
  
}