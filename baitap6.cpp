#include <stdio.h>
int main(){
	double x;
	double y;
	double z;
	double t;
	double tienlai4nam;
	
	scanf("%lf" ,&x);
	
	
	y = x * 8/100 + x;
	z = y * 8/100 + x;
	t = z * 8/100 + x;
	tienlai4nam = t * 8/100 + x;
	printf ("tienlai4nam = %lf\n",tienlai4nam);
	
	return 0;
	}
