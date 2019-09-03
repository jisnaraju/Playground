#include<stdio.h>
int main()
{
  int r,c,i,j;
  scanf("%d%d",&r,&c);
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }    
for(i=0;i<r;i++)
  {
      int k=0;
    for(j=i;j<c;j++)
    {
      printf("%d ",a[k][j]);
      k++;
    }
   
  } 
 return 0;
}
