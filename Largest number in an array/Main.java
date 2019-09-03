#include <stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int arr[a],i;
  for(i=0;i<a;i++)
  {
    scanf("%d",&arr[i]);
   }
  int result=0;
  for(i=0;i<a;i++)
  {
    if(arr[i]>result)
      result=arr[i];   
    else
    result=result;
  }
  printf("%d",result);
  return 0;
  }
  
