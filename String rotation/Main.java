#include <stdio.h>
#include <string.h>
int main()
{
  char a[100],b[100];
  int flag=0;
  gets(a);
  gets(b);
  //scanf("%[^\n]s",a);
  //scanf("%[^\n]s",b);
  //int r;
  int temp;
  int l=strlen(a);
  for(int j=0;j<l;j++)
  {
  temp=a[0];
  for(int i=1;i<l;i++)
  {
    a[i-1]=a[i];
  }
  a[l-1]=temp;
  if(strcmp(a,b)==0)
  {
     flag=1;
     break;
  }
  }
 if(flag==0)
  printf("No");
  else
  printf("Yes");
 
  return 0;
}