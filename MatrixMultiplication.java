//Program to find the multiplication of two matrices in java

import java.util.*;
class MatrixMultiplication
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

int k;
System.out.println("Multiplication:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
c[i][j]=0;
for(k=0;k<row;k++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][j];
}

System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}
}