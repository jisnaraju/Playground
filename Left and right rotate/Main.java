#include<stdio.h>
int main()
{
  int n,i,oi,ei,temp1,temp2,r;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&r);
  oi=(n%2==0)? n-2:n-1;
  ei=(n%2==0)? n-1:n-2;
  int r1,j,k;
  for(r1=1;r1<=r;r1++)
  {
    temp1=arr[oi];
  for(j=oi;j>=0;j=j-2)
  {
   arr[j]=arr[j-2];
  }
    arr[0]=temp1;
    temp2=arr[1];
  for(k=1;k<=ei;k=k+2)
  {
    arr[k]=arr[k+2];
  }
    arr[ei]=temp2;
  }
  for(i=0;i<n;i++)
  {
    printf("%d ",arr[i]);
  }
  //Type your code here
  return 0;
}