#include <stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int arr[a],index;
  for(index=0;index<a;index++)
  {
    scanf("%d",&arr[index]);
   }
  int x=-1,y=-1;
  int e1,e2;
  scanf("%d %d",&e1,&e2);
  for(index=0;index<a;index++)
  {
    if(e1==arr[index])
      x=index;
      
    if(e2==arr[index])
      y=index;
      
   } 
  printf("%d\n",x);
  printf("%d",y);
  return 0;
  }
  
