import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
      	int n=scn.nextInt();
      	double area;
      	switch(n)
        {
          case 1:
            {
              int s=scn.nextInt();
              area=s*s;
              System.out.println(area);
            	break;
         	 }
            case 2:
            {
              int l=scn.nextInt();
              int b=scn.nextInt();
              area=l*b;
              System.out.println(area);
            	break;
         	 }
            case 3:
            {
              int b=scn.nextInt();
              int h=scn.nextInt();
              area=0.5*b*h;
              System.out.println(area);
            	break;
         	 }
            case 4:
            {
              int r=scn.nextInt();
              area=3.14*r*r;
              System.out.println(area);
            	break;
         	 }
          default:
            break;
        }
    }
}