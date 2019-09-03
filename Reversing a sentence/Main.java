#include<stdio.h>
int main()
{
 char a[100];
  gets(a);
  int l =strlen(a);
  for(int i=l-1;i>=0;i--)
  {
    if(a[i]==' ')
    {
      printf("%s ",&a[i+1]);
      a[i]='\0';
     }
  }
  printf("%s",a);
  return 0;
}