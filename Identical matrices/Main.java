#include<stdio.h>
int main()
{
  int r,c,i,j,flag=0;
  scanf("%d%d",&r,&c);
  int a[r][c],b[r][c],sum[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }   
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      scanf("%d",&b[i][j]);
    }
  } 
for(i=0;i<r;i++)
  {
      if(flag==0)
      {
    for(j=0;j<c;j++)
    {
      if(a[i][j]!=b[i][j])
      {
          flag=1;
          break;
      }
    }
  } 
      
  }
  if(flag==0)
  printf("Yes");
  else
  printf("No");
  return 0;
}
