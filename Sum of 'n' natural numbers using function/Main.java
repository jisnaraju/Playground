#include<stdio.h>
int sum(int);
int main() 
{
  int n;
  scanf("%d",&n);
  sum(n);
}
int sum(int a)
{
int i,sum=0;
  for(i=1;i<=a;i++)
  sum=sum+i;
  printf("%d",sum);
// Type your code here
   return 0;
}