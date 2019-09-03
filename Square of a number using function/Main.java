#include<stdio.h>
int square(int);
int main() 
{
  int n;
  scanf("%d",&n);
  square(n);
}
int square(int a)
{
int result=0;
  result=a*a;
  printf("%d",result);
// Type your code here
   return 0;
}