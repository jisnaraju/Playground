#include <stdio.h>
int main()
{
 int n,i,j;
 scanf("%d",&n);
 int a[n],b[n];
 for( i=0;i<n;i++)
 {
   scanf("%d",&a[i]);
 }
 for(i=0;i<n;i++)
 {
  b[i]=i+1;
 }
 for(i=0;i<n;i++)
 {
    int flag=0;
     for(j=0;j<n;j++)
     {
         if(b[i]==a[j])
         {
         flag=1;
         }
         
     }
     if(flag==0)
     printf("%d ",b[i]);
 }
 
  return 0;
}
