/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include<stdio.h>
int main()
{
 int n;
 scanf("%d",&n);
 int m,i,j,temp,a[n];
 for(int i=0;i<n;i++)
 {
     scanf("%d",&a[i]);
 }
 m=n/2;
 for(i=0;i<m;i++)
  {
      for(j=0;j<m-i-1;j++)
      {
          if(a[j]>a[j+1])
          {
              temp=a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
          }
      }
  }
  for(i=0;i<m;i++)
  {
      for(j=m;j<n-i-1;j++)
      {
         if(a[j+1]>a[j])
          {
              temp=a[j+1];
              a[j+1]=a[j];
              a[j]=temp;
          }
      }
  }
  for(i=0;i<n;i++)
  printf("%d ",a[i]);
  return 0;
}