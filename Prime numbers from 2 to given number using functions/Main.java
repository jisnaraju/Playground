#include<stdio.h>
#include<math.h>
int prime(int);
int main() 
{ 
  int t,n,i;
  scanf("%d",&n);
  for(i=2;i<=n;i++)
  {
  if(prime(i))
  {
      printf("%d\n",i);
  }
  }
  return 0;
}
int prime(int two)
{ 
  int r=0,count;
    for(count=2;count<=sqrt(two);count++)
    {
      if(two%count==0)
      {r++;
      break;
      }
    }
    if(r==0)
     return 1;
    else
    return 0;
}