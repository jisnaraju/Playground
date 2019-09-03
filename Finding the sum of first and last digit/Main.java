#include <stdio.h>
int main()
{
  int n,r,sum=0;
  scanf("%d",&n);
  r=n%10;
  while(n>10)
  {
    n=n/10;
     //Type your code
  }
  sum=n+r;
   printf("%d",sum);
  return 0;
}
  
  