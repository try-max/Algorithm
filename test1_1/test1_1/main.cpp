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
//			printf("���Լ��Ϊ%d",i);
//			break;
//		}
//	}
//}
//շת�����
//r=m%n
//m=n;
//n=r;
//if(r==0){
//	rΪ���Լ��
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