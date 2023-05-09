//Program to find the sum of n numbers

import java.util.*;
class SumOfNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,sum=0;
i=1;
System.out.println("Enter n:");
n=sc.nextInt();

for(i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println("Sum="+sum);
}
}


}