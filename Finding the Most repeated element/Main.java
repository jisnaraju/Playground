#include<stdio.h>
int main()
{
  
        int n;
        scanf("%d",&n);
        int a[n];
        for(int i = 0; i < n; i++)
        {
            scanf("%d",&a[i]);
        }
	    int max = 0; 
		int count = 1; 
		int b[n];
	    for(int i = 0; i < n; i++)
	    {
		    for (int j = i+1; j < n; j++) 
		    { 
	            if(a[i] == a[j])
	            count ++;
		    }
		    b[i] = count;
		    count = 1;
	    } 
	    for( int i = 0; i < n; i++)
	    {
            if(b[i]>b[max])
            max = i;
	    }
	    printf("%d",a[max]);
	
		return 0;
}