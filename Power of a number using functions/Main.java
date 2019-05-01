import java.util.Scanner;
import java.lang.Math;
public class Main{
  public static double calc_pow(double b,double e)
  {
   double p=Math.pow(b,e);
    return p;
  }
  public static void main(String[]args)
  {
    Scanner scn=new Scanner(System.in);
    double base = scn.nextInt();
    double exponent= scn.nextInt();
    double c=calc_pow(base,exponent);
    System.out.println(c);
  }
  
  
  
}