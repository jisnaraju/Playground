#include <stdio.h>
int main()
{
  int n,numcount=1;
  scanf("%d ",&n);
  for(numcount=1;numcount<=n;numcount++)
  {
    printf("%d",numcount);
    if(numcount%3==0) 
    {
      printf(",");
    }
  }
	return 0;
}