//Program to calculate average marks of a student

import java.util.*;
class AverageMarks
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double m1,m2,m3,avg;
System.out.println("Enter marks of Subject1:");
m1=sc.nextDouble();
System.out.println("Enter marks of Subject2:");
m2=sc.nextDouble();
System.out.println("Enter marks of Subject3:");
m3=sc.nextDouble();
avg=(m1+m2+m3)/3;
System.out.println("Average marks= "+avg);
}
}