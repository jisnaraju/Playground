#include <stdio.h>
int main() 
{
  int n,i,j,m;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(m=n-i;m>=1;m--)
    {
      printf(" ");
    }
    for(j=1;j<=(2*i)-1;j++)
    {
      printf("*");
    }
    printf("\n");
  }
	// Type your code here
	return 0;
}