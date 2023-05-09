//calculate electricity bill

import java.util.*;
class ElectricityBill
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double n,bill;
System.out.println("Enter number of units");
n=sc.nextDouble();

if(n<100){
bill=n*1.20;
System.out.println("Electricity Bill="+bill);
}else if(n<300){
bill=100*1.20+(n-100)*2;
System.out.println("Electricity Bill="+bill);
}else if(n>300){
bill=100*1.20+200*2+(n-300)*3;
System.out.println("Electricity Bill="+bill);
}else
System.out.println("Please enter appropriate value of units");
}
}