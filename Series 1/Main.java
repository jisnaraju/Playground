#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%2==1)
  {
    //int a=1;
    //int r=2;
    int term_series=n/2;
    int res=pow(2,term_series);
    printf("%d",res);
  }
  else
  {
 // int a=1;
   // int r=3;
    int term_series=n/2;
    int res=pow(3,term_series-1);
    printf("%d",res);
  }
  return 0;
}