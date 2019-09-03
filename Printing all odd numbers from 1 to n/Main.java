#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  for(int count=1;count<=n;count++)
    if(count%2==1)
    {
      printf("%d \n",count);
      count=count+1;
    }
 
	//Type your code
	return 0;
}