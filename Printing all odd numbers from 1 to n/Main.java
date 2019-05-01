import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int i;
    for(i=1;i<=n;i++)
    {
      if(i%2==1)
        System.out.println(i);
    }
      	
	}
}