#include <stdio.h>
#include <math.h>
int main() {
  int n,r,sum=0,count,p=1;
    scanf("%d",&n);
  int num=n;
  for(count=0;n>0;count++)
  {
    n=n/10;
  }
  //printf("%d\n",count);
  n=num;
  for(int i=1;i<=count;i++)
  {
    r=n%10;
    p=1;
   for(int j=1; j<=count; j++)
   { 
    	 p=p*r;
   }
    //printf("%d ",p);
  	sum=sum+p;
 	n=n/10;
	}
	if(sum==num)
	{	
  		printf("Armstrong Number");
	}
  	else
 	{
  		printf("Not an Armstrong Number");
	}
  //Type your code
	return 0;
}