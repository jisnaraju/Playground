#include<stdio.h>
int main()
{
 int n;
 scanf("%d",&n);
 int a[n],i,count=0;
 for(int i=0;i<n;i++)
 {
     scanf("%d",&a[i]);
 }
 
  for(i=0;i<n;i++)
  {
   if(1==a[i])
   {
     count++;
   }
   else
     break;;
  }
   
  printf("%d",count);
  
  return 0;
}