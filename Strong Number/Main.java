#include <stdio.h>
int main() {
  int n,num,sum=0;
  scanf("%d",&n);
  num=n;
  while(n!=0)    
  {
   int fact=1;
    int r=n%10;
    for(int i=r;i>0;i--)
    {
      fact=fact*i;
    } 
     sum=sum+fact;
      n=n/10;
    }

    if(sum==num)
      printf("Yes");
 else
   printf("No");
  
	return 0;
}