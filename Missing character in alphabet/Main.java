#include<stdio.h>
#include<string.h>
int main()
{
  char a[100];
  scanf("%[^\n]s",a);
  int l=strlen(a);
  int b[26],val,d=65,e=97,i,j;
  for(int i=0;i<26;i++)
  {
    b[i]=0;
  }
  for(j=0;j<l;j++)
  {
   if(a[j]>='a' && a[j]<='z')
   {
       val=a[j]-'a';
       b[val]++;
   }
   else if(a[j]>='A' && a[j]<='Z')
   {
       val=a[j]-'A';
       b[val]++;
   }
  
  }
  for(i=0;i<26;i++)
  {
     if(b[i]==0)
     printf("%c ",e+i);
      
  }
  
  return 0;
}