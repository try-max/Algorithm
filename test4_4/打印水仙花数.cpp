/*
  ��ӡˮ�ɻ���

 ��ҵ����
 ���0��100000֮������С�ˮ�ɻ������������

��ˮ�ɻ�������ָһ��nλ�������λ���ֵ�n�η�֮��ȷ�õ��ڸ�������
��:153��1^3��5^3��3^3����153��һ����ˮ�ɻ�������
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

