#include <stdio.h>
int main(){\
    int f=1;
    while(f==1){
	int menu;
	
	do{
		printf("chon chuc nang\n");
		printf("1:chon mon an\n");
		printf("2:goi do uong\n");
		printf("3:thanh toan\n");
		printf("4:thoat chuong trinh\n");
	scanf("%d",&menu);
	}while(menu>4 || menu<1);
	if(menu==1){
		int mon_an;
		do{
		
		printf("chon mon an\n");
		printf("1:com ga\n");
		printf("2:pho\n");
		printf("3:bun\n");
		printf("4:quay lai\n");
	    scanf("%d",&mon_an);
	} while ( mon_an > 4 || mon_an < 1);
	if(mon_an>=1 && mon_an <=3){
		printf("cam on da chon\n");
	}else{
		printf("tro lai menu\n");}
		
	}else if(menu==2){
	 int do_uong;
	 do{
		int do_uong;
		printf("chon do uong\n");
		printf("1:ca phe\n");
		printf("2:tra chanh\n");
		printf("3:nuoc loc\n");
		printf("4:nuoc cam\n");
	    scanf("%d",&do_uong);
	}while( do_uong >4 ||  do_uong<1);
	if( do_uong>=1 &&  do_uong <=3){
		printf("cam on da chon\n");
	}else{
		printf("tro lai menu\n");}	
	}    
	else if(menu==3){
		printf("so tien can thanh toan:22tr300\n");
		printf("cam on quy khach\n");
	}else if(menu==4){
		 f==0;
      	printf("thoat chuong trình...\n");
	    
	    }
        
	}
	
	
	
	return 0;
	}
