/*
  打印水仙花数

 作业内容
 求出0～100000之间的所有“水仙花数”并输出。

“水仙花数”是指一个n位数，其各位数字的n次方之和确好等于该数本身，
如:153＝1^3＋5^3＋3^3，则153是一个“水仙花数”。
*/

#include<stdio.h>
#include<math.h>
int main(){
	int i=0;
	for(i=0;i<100000;i++){
		int temp=i;
		int count=1;
		int sum=0;
		
		while(temp/10){
			count++;
			temp/=10;
		}
		temp=i;
		while(temp){
			sum+=pow(temp%10,count);
			temp=temp/10;
		}
		if(sum==i){
			printf("%d ",i);
		}
	}
}

