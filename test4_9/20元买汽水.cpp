/*
 ����ˮ��1ƿ��ˮ1Ԫ��2����ƿ���Ի�һƿ��ˮ����20Ԫ�����Զ�����ˮ�����ʵ�֣���
*/
#include<stdio.h>
int main(){
	int money=0;
	int total=0;
	int empty=0;
	int price=1;
	scanf("%d %d", &money,&price);
	empty=money/price;
	total=money/price;
	while(empty>1){
		total+=empty/2;
		empty=empty/2+empty%2;
	}
	printf("%d",total);
	
} 
