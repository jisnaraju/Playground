#include <stdio.h>
int sum(int a);
int main()
{
int x,b;
scanf("%d",&x);
b=sum(x);
printf("%d",b);
}
int sum(int a)
{
    int b;
    if(a==1)
    return 1;
    else
    b=a+sum(a-1);
    return b;
}