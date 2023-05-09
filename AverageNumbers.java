//Average of n numbers

import java.util.*;
class AverageNumbers
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
double i,n,sum=0,avg;
i=1;
System.out.println("Enter n:");
n=sc.nextDouble();
for(i=1;i<=n;i++)
{
sum=sum+i;
}avg=sum/n;
System.out.println("Average of n numbers="+avg);
}
}