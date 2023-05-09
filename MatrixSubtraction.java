//Program to find the subtraction of two matrices

import java.util.*;
class MatrixSubtraction
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int r,c;
System.out.println("Enter number of rows:");
r=sc.nextInt();
System.out.println("Enter number of columns:");
c=sc.nextInt();

int m1[][]=new int[r][c];
int m2[][]=new int[r][c];
int s[][]=new int[r][c];

int i,j;
System.out.println("Enter numbers in 1st matrix: ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
m1[i][j]=sc.nextInt();
}
}

System.out.println("Enter numbers in 2nd matrix: ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
m2[i][j]=sc.nextInt();
}
}

System.out.println("1st Matrix is: ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(m1[i][j]+"\t");
}
System.out.println();
}

System.out.println("2nd Matrix is: ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(m2[i][j]+"\t");
}
System.out.println();
}

System.out.println("Subtraction of two matrices is: ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
s[i][j]=m1[i][j]-m2[i][j];
System.out.print(s[i][j]+"\t");
}
System.out.println();
}
}
}