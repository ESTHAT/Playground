import java.util.Scanner;
class Main{
 
 public static void main(String[] args) 
  { 
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        String str3 = scn.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder sb3 = new StringBuilder(str3);
        StringBuilder temp = new StringBuilder("");
        int len1 = sb1.length();
        int len2 = sb2.length();
        int len3 = sb3.length();
   		int i, j;
        for(i = 0; i <= (len1 - 1) - (len2 - 1); i++)
        {
            boolean matching = true;
            for(j = 0; j < len2; j++)
            {
                if(sb1.charAt(i + j) != sb2.charAt(j))
                {
                    matching = false;
                }
            }
            if(matching == true)
            {
              String strng = sb3.substring(0, len3);
              temp.append(strng);
              i = i + (len2 - 1);
            }
            else
            {
                char ch = sb1.charAt(i);
                temp.append(ch);
            }
        }
        for(j = i ; j <= (len1 - 1); j++)
        {
                char ch = sb1.charAt(j);
                temp.append(ch);
        }
        System.out.print(temp);
    }
} 