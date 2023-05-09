//program to calculate discount of product

import java.util.*;
class Discount
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double lp,sp,dis,disp;
System.out.println("Enter list price");
lp=sc.nextDouble();
System.out.println("Enter selling price");
sp=sc.nextDouble();
dis=lp-sp;
System.out.println("Discount="+dis);
disp=dis/lp*100;
System.out.println("Discount %="+disp);
}
}