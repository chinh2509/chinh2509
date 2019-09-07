#include <stdio.h>
int main(){
	int a,n=1;
	scanf("%d",&a);
	while(a>=10){a/=10;
	n++;
	}
	
	printf("tong so chu so la:%d",n);
	return 0;
	}	
	
