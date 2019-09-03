#include<stdio.h>
#include<string.h>
int main()
{
 char a[100];
  gets(a);
  int n=strlen(a);
  int i=0,j=n-1,flag=0;
  while(i<j)
  {
    if(a[i]!=a[j])
    {
     
      flag=1;
      break;
    }
     i++;
      j--;
  }
  if(flag==0)
    printf("%s is a palindrome",a);
    else
      printf("%s is not a palindrome",a);
  return 0;
}