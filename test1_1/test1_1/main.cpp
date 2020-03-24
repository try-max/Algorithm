#include<stdio.h>
int max(int a, int b);
int main() {

	int a, b;
	scanf_s("%d %d", &a, &b);
	max(a, b);
	return 0;
}
//int max(int a,int b){
//	if(a<b){
//		int temp=a;
//		a=b;
//		b=temp;
//	}
//	for(int i=a;i>=1;i--){
//		if(a%i==0&&b%i==0){
//			printf("最大公约数为%d",i);
//			break;
//		}
//	}
//}
//辗转相除发
//r=m%n
//m=n;
//n=r;
//if(r==0){
//	r为最大公约数
//} 
int max(int a, int b) {
	//	if(a<b){
	//		int temp=a;
	//		a=b;
	//		b=temp;
	//	}
	int r = 0;
	while (a % b) {
		r = a % b;
		a = b;
		b = r;
	}
	printf("%d", r);
	return 0;
}