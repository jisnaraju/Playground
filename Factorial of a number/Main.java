#include <stdio.h>
int main()
{
  int n ;
  scanf("%d",&n);
  int mul=1;
  for(int count=1;count<=n;++count)
   {
     mul=mul*count;
   }
     printf("%d",mul);
	//Type your code
	return 0;
}