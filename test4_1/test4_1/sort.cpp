/*
ð������
 1.ð�����򹲽���sizeof(arr) / sizeof(arr[0])-1 �ˣ�ÿһ�˱Ƚ�һ�����֣������ķ��ں��
 2.�Ż�ð�ݣ���ĳһ�������У����ָ�������û��һ��Ԫ�ؽ�������ô���������������Ҫ����ѭ����
*/
#include<iostream>
using namespace std;
void BubbleSort(int *arr, int length);
void Print(int *arr, int length);
int main() {
	int arr[] = { 10,9,8,7,6,5,4,3,2,1 };
	int length = sizeof(arr) / sizeof(arr[0]);
	Print(arr, length);
	BubbleSort(arr, length);
	Print(arr, length);

	return 0;
}
//ѭ����������е�Ԫ��
void Print(int *arr, int length) {
	for (int i = 0; i < length; i++) {
		cout << arr[i] << " ";
	}
	cout << endl;
}
//ð������
void BubbleSort(int *arr,int length) {

	for (int i = 0; i < length; i++) {
		int flag = 1;
		for (int j = 0; j < length - i-1; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				flag = 0;
			}
			

		}
		if (flag == 1) {
			break;
		}
	}
}