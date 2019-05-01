import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    int temp=num;
    double temp1=num;
    int count=0,dig,dig1;
    double sum=0.0;
    for(;num>0;num=num/10)
    {
      dig=num%10;
      count++;
	}
    for(;temp>0;temp=temp/10)
    {
      dig1=temp%10;
      sum=sum+Math.pow(dig1,count);
    }
    if(sum==temp1)
      System.out.println("Armstrong Number");
     else
       System.out.println("Not a Armstrong Number");
    }
      
}