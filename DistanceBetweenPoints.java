//Program to calculate distance between two points

import java.util.*;
class DistanceBetweenPoints
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double x1,x2,y1,y2,d;
System.out.println("Enter value of X1 and Y1");
x1=sc.nextDouble();
y1=sc.nextDouble();
System.out.println("Enter value of X2 and Y2");
x2=sc.nextDouble();
y2=sc.nextDouble();
d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
System.out.println("Distance between two points= "+d);
}
}