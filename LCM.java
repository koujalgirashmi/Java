//Program to find the LCM of a number

import java.util.*;
class LCM
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i, n1,n2,gcd=1,lcm;
System.out.println("Enter two numbers:");
n1=sc.nextInt();
n2=sc.nextInt();

for(i=1;i<=n1 && i<=n2;i++)
{
if(n1%i==0 && n2%i==0)
{
gcd=i;
}
}
lcm=(n1*n2)/gcd;
System.out.println("LCM of given numbers is: "+lcm);
}
} 