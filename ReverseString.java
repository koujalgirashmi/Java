//Program to reverse a string in java

import java.util.*;
 
class ReverseString 
{
    public static void main (String args []) 
    {
      Scanner sc=new Scanner(System.in);
       String str="", nstr="";
        char ch;
       System.out.print("Enter string: ");
       str=sc.nextLine();
      System.out.println(str); 
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
