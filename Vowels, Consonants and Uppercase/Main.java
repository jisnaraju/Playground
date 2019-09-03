#include<stdio.h>
int main()
{
  char a[100],b[100],c[100];
  scanf("%s",a);
  scanf("%s",b);
  scanf("%s",c);
  for(int i=0;a[i]!='\0';i++)
  {
    if(a[i]=='a'|| a[i]=='e'|| a[i]=='i'|| a[i]=='o'|| a[i]=='u')
      a[i]='$';
  }
  for(int i=0;b[i]!='\0';i++)
  {
    if(!(b[i]=='a'|| b[i]=='e'|| b[i]=='i'|| b[i]=='o'|| b[i]=='u'))
      b[i]='#';
  }
  for(int i=0;c[i]!='\0';i++)
  {
    if(c[i]>='a' && c[i]<='z')
     c[i] =c[i]-32;
  }
  int idx=0;
  
  for(int i=0;a[i]!='\0';i++)
  {
    a[idx++]=a[i];
    }
  for(int i=0;b[i]!='\0';i++)
  {
    a[idx++]=b[i];
    }
  for(int i=0;c[i]!='\0';i++)
  {
    a[idx++]=c[i];
    }
  a[idx]='\0';
  printf("%s",a);
  return 0;
  
    
}