#include<stdio.h>
int gcd(int,int);
int main()
{
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
 int result=gcd(a,b);
  int final=gcd(result,c);
  printf("%d",final);
}
int gcd(int d,int e)
{
  int minval1,h;
  if(d<e)
    minval1=d;
  else
    minval1=e;
  while(minval1>0)
  {
  if((d%minval1==0) && (e%minval1==0))
     h=minval1;
    break;
  //else
   minval1--;
  }
  return h;
  
}