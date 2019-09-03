#include<stdio.h>
int main()
{
  int n,f,l,s;
  scanf("%d",&n);
  l=n%10;
  f=n/100;
  s=l+f;
  printf("%d",s);
  //Type your code here
  return 0;
}