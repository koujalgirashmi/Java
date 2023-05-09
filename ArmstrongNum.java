//Program to find whether the given number is an armstrong number or not

import java.util.*;
class ArmstrongNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,d,cube,sum=0;
System.out.println("Enter a number:");
n=sc.nextInt();
int t=n;
while(n>0)
{
d=n%10;
cube=d*d*d;
sum=sum+cube;
n=n/10;
}
if(sum==t)
{
System.out.println("Given number is Armstrong");
}
else{
System.out.println("Given number is not Armstrong ");
}
}
}