import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    Scanner scn=new Scanner(System.in);
      String str=scn.nextLine();
      int str_len=str.length();
      int end=str_len-1;
      int front=0;
      boolean is_pal=true;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
          is_pal=false;
          break;
        }
        front++;
        end--;
      }
      if(is_pal==true)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
  
}