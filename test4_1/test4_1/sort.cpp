/*
冒泡排序：
 1.冒泡排序共进行sizeof(arr) / sizeof(arr[0])-1 趟，每一趟比较一边数字，将最大的放在后边
 2.优化冒泡：在某一趟排序中，发现该数组中没有一个元素交换，那么该数组是有序的需要跳出循环。
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
//循环输出数组中的元素
void Print(int *arr, int length) {
	for (int i = 0; i < length; i++) {
		cout << arr[i] << " ";
	}
	cout << endl;
}
//冒泡排序
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