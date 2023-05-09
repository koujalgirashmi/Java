//Program to find the addition of two matrices

import java.util.*;
class MatrixAddition
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int row,col;
System.out.println("Enter number of rows:");
row=sc.nextInt();
System.out.println("Enter number of columns:");
col=sc.nextInt();

int a[][]=new int[row][col];
int b[][]=new int[row][col];
int c[][]=new int[row][col];
int i,j;
System.out.println("Enter elements for 1st matrix");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.println("Enter elements for 2nd matrix");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
b[i][j]=sc.nextInt();
}
}

System.out.println("1st matrix:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}

System.out.println("2nd matrix:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println();
}

System.out.println("Addition:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}
}