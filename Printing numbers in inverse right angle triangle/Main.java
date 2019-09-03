#include <stdio.h>
int main()
{
  int n,i,j,sum=1,m;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=(n-i)+1;j>=1;j--)
    {
      printf("%d",j);
    }
    printf("\n");
  }
    // Type your code here
	return 0;
}