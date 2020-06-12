/*
 喝汽水，1瓶汽水1元，2个空瓶可以换一瓶汽水，给20元，可以多少汽水（编程实现）。
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
