#include <stdio.h>
int fact(int a);
int main()
{
int x,b;
scanf("%d",&x);
b=fact(x);
printf("%d",b);
}
int fact(int a)
{
    int b;
    if(a==1)
    return 1;
    else
    b=a*fact(a-1);
    return b;
}