#include <stdio.h>
int main(){
	int n,so_cac_chu_so,a=0;
	scanf("%d",&n);
    for(;n!=0;){
        so_cac_chu_so = n % 10;
        a += so_cac_chu_so;
        n /= 10;
    }    
    printf("tong cac chu so la:%d",a);

	
	
	
	return 0;
	}
