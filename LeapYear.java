//Program to check it is a leap year or not

import java.util.*;
class LeapYear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int y;
System.out.println("Enter year:");
y=sc.nextInt();
if(y%4==0)
{
System.out.println("This is a leap year");
}
else{
System.out.println("This is not a leap year");
}
}
}