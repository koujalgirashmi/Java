//Program to find the power of numbers in java

import java.util.*;
class Power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double b,p;
System.out.println("Enter value of base:");
b=sc.nextDouble();
System.out.println("Enter value of exponent:");
p=sc.nextDouble();
System.out.println(Math.pow(b,p));
}
}