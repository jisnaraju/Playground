#include<stdio.h>
int main()
{
int n;
  scanf("%d",&n);
  int ar[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&ar[i]);
  }
  for(int i=0;i<n-1;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      for(int k=j+1;k<n;k++)
      {
        printf("(%d, %d, %d) ",ar[i],ar[j],ar[k]);
      }
    }
    printf("\n");
  }
  
  return 0;
}