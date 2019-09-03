#include <stdio.h>
int main()
{
  int i,j,n;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      if((i%2==1) && (j!=n))
        printf("%d",i);
      else if((i%2==1) && (j==n))
       printf("%d",i+1);
    
    else if((i%2==0) && (j==1))
        printf("%d",i+1);
      else
       printf("%d",i);
    }
    
      printf("\n");
  }
	// Type your code here
	return 0;
}