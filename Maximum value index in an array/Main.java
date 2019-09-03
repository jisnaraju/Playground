#include <stdio.h>
int main()
{
  int a, result=0, i,count=0;
  scanf("%d",&a);
  int arr[a];
  for(i=0;i<a;i++)
  {
    scanf("%d",&arr[i]);
  }
 result=0;
 for(i=1;i<a;i++)
 {
   if(arr[i]>result)
     result=arr[i];
     count=i;
    // count++;
  // else
    //result=result;
    //count=i-1;
 }
    printf("%d",count);
return 0;
}