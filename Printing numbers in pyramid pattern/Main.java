#include <stdio.h>
int main() 
{
  int n,i,j,sum=1,m;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(m=n-i;m>=1;m--)
    {
      printf(" ");
    }
    for(j=1;j<i+1;j++)
    {
      printf("%d ",sum);
      sum=sum+1;
    }
    printf("\n");
  }
	// Type your code here
	return 0;
}