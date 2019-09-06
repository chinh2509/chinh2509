#include <stdio.h>
int main(){
	int x;
	scanf("%d",&x);
	while(x>4||x<1){
		printf("nhap lai");
		scanf("%d",&x);
	}
	if(x==1){
		printf("banh my\n");
	}else if(x==2){	
        printf("ca phe\n");
	}else if(x==3){
		printf("mi xao\n");
	}else if(x==4){
	    printf("tra chanh\n");
		}	
    return 0;
    }
			
	
