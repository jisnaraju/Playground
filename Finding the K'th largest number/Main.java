#include <stdio.h>
int main()
{
 int n,i,j,temp;
 scanf("%d",&n);
 int a[n];
 for(i=0;i<n;i++)
 {
   scanf("%d",&a[i]);
 }
  int r;
  scanf("%d",&r);
 for(i=0;i<n;i++)
 {
  for(j=0;j<n-i-1;j++)
    {
     if(a[j]>a[j+1])
        {
         temp=a[j];
         a[j]=a[j+1];
         a[j+1]=temp;
        }
    }
 
 }
 printf("%d ",a[n-r]);
 return 0;
}
