#include <stdio.h>
int main(){
	int a,b,c;
	scanf("%d,&a");
	scanf("%d",&b);
	scanf("%d",&c);
	
	if ((a<b+c) && (b<c+a) && (c<a+b)){
		printf("day la 3 canh tam giac\n");
	}
	else{
		printf("nhap lai");
		scanf("%d",&a);
		scanf("%d",&b);
		scanf("%d",&c);
	}
	return 0;
		
		
	}	
