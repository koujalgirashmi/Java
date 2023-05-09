//program to calculate commission percentage

import java.util.*;
class CommisionPercent
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double amt,com,comP;
System.out.println("Enter amount");
amt=sc.nextDouble();
System.out.println("Enter commission");
com=sc.nextDouble();
comP=com/amt*100;
System.out.println("Commission Percentage="+comP);
}
}