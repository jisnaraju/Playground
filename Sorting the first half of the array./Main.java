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
  for(i=0;i<n;i++)
  printf("%d ",a[i]);
  return 0;
}