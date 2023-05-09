//Program to find the transpose of a matrix

import java.util.*;
class MatrixTranspose
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int r,c;
System.out.println("Enter number of rows:");
r=sc.nextInt();
System.out.println("Enter number of columns:");
c=sc.nextInt();

int a[][]=new int[r][c];
int b[][]=new int[r][c];

int i,j;
System.out.println("Enter elements in matrix");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.println("Elements in matrix are:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}

System.out.println("Transpose of given matrix is:");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[i][j]=a[j][i];
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
}
}