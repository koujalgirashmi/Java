//Program to calculate the batting average

import java.util.*;
class BattingAverage
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long runs,innings,notout,n;
double avg;
System.out.println("Enter the number of matches played:");
n=sc.nextLong();

while(true)
{
System.out.println("Enter the number of innings batted:");
innings=sc.nextLong();
if(innings<=n)
break;
System.out.println("Enter the number of innings batted correctly <=n");
}

while(true)
{
System.out.println("Enter the number of notout:");
notout=sc.nextLong();
if(notout<=innings)
break;
System.out.println("Enter the number of notout correctly <=inningss");
}
System.out.println("Enter number of runs scored:");
runs=sc.nextLong();

if(innings==notout)
avg=runs;
else
avg=runs/(innings-notout);

System.out.println("Batting average="+avg);
   }
}