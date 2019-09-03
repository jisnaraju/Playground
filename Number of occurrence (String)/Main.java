#include<stdio.h>
#include<string.h>
int main()
{
  char a[100],b[100],c[100],d[100];
  gets(a);
  gets(b);
  int count=0;
  int l =strlen(a),j;
  int m =strlen(b);
  for(int i=0;i<l;i++)
  {
      
  if(a[i]>='a' && a[i]<='z')
  {
      c[i]=a[i];
  }
  else if(a[i]>='A' && a[i]<='Z')
  {
      c[i]=a[i]+32;
  }
 }
  
  for(int i=0;i<m;i++)
  { 
      
  if(b[i]>='a' && b[i]<='z')
  {
      d[i]=b[i];
  }
  else if(b[i]>='A' && b[i]<='Z')
  {
      d[i]=b[i]+32;
  }
 }
  
   for(int i=0;i<l;i++)
  {
      
  if(c[i]==d[j])
    {
      j++;
    }
  if(d[j]=='\0')
    {
     count++;
     j=0;
    }
}
  printf("%d",count);
  return 0;
}