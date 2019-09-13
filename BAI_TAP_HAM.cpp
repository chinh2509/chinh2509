#include <stdio.h>
int tim_so_trong_day(int x[]){
	int y;
	scanf ("%d",&y);
	for(int i=0;i<9;i++){
		if(y==x[i]){
		
			printf("so co thuoc mang\n");
			return true;
		} 
	}  
		printf("so khong thuoc mang\n");
		return false;
}
int tim_so_le(int z[]){
	for(int i=0;i<z[i];i++){
		if(z[i]%2!=0){
			printf("so le la :%d\n",z[i]);
			}
		}
	}
int tim_so_trong_day_fibonacci(int f[]){
    int n;
	scanf("%d",&n);
	int x1=1,x2=1,x3=2;
	for(int i=0,j=1;x1+x2<=n&&n>0;i+=j,j++){
		x1 = x2;
		x2 = x3;
	f[i]=x3 = x1+x2;
	}
	printf("so thu %d trong day: %d\n",n,x3);
	return 0;
} 
int main(){
   int n[9]={1,2,3,4,5,6,7,8,9};	
   tim_so_le(n);
   tim_so_trong_day(n);
   tim_so_trong_day_fibonacci(n);
	return 0;
	}
	
