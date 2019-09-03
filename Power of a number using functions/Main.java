#include<stdio.h>
int power(int,int);
int main() 
{ 
  int b,e;
  scanf("%d %d",&b,&e);
  power(b,e);
}
int power(int base,int ex)
{ 
  int i,mul=1;
  for(i=1;i<=ex;i++)
  {
    mul=mul*base;
   // printf("%d",value);
  }
   printf("%d",mul);
  
  // Type your code here
  	//return 0;
}