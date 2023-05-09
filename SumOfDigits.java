//Program to find the sum of digits in number

import java.util.*;
class SumOfDigits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,d,s=0;
System.out.println("Enter a number:");
num=sc.nextInt();
 
while(num>0)
{
d=num%10;
s=s+d;
num=num/10;
}
System.out.println("The reverse number is: "+s);
}
}