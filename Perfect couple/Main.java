#include<stdio.h>
int main()
{
int n,flag=0;
  scanf("%d",&n);
  int ar[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&ar[i]);
  }
  int val=0,i,j;
  scanf("%d",&val);
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
     if(val==ar[i]+ar[j])
     {
       printf("Perfect couple: %d %d ",ar[i],ar[j]);
       flag=1;
     }
    }
   
  }
   if(flag==0)
  {
  printf("No perfect couple found!");
  }
  return 0;
}