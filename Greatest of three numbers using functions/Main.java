#include <stdio.h>
int great(int,int,int);
int main()
{
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  great(a,b,c);
}
int great(int d,int e,int f)
{
  int s=0;
  if(d>e)
    s=d;
  else
    s=e;
  if(s>f)
    printf("%d",s);
  else
    printf("%d",f);
  // Type your code here
  	return 0;
}