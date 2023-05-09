//Program to find whether the given number is a perfect number or not

import java.util.*;
class PerfectNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,f,sum=0;
System.out.println("Enter a number");
n=sc.nextInt();
f=1;
while(f<=n/2)
{
if(n%f==0)
{
sum=sum+f;
}
f++;
}

if(sum==n)
{
System.out.println("Given number is perfect number");
}else
{
System.out.println("Given number is not perfect number");
}
}
}