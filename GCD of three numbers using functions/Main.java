import java.util.Scanner;
public class Main{
  public static int gcd(int n1,int n2)
  {
    int min,g=0;
    if(n1<n2)
      min=n1;
    else
      min=n2;
    while(min>=1)
    {
      if(n1%min==0 && n2%min==0)
      {
        g=min;
        break;
      }
      min--;
    }
    return g;
  }
	public static void main (String[] args)
	{
	 Scanner scn=new Scanner(System.in);
     int n1=scn.nextInt();
     int n2=scn.nextInt();
     int n3=scn.nextInt();
     int c=gcd(n1,n2);
     int d=gcd(c,n3);
      System.out.println(d);
     
	}
}