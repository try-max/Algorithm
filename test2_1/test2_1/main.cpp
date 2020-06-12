/*
    实现一个函数，判断一个数是不是素数。
    利用上面实现的函数打印100到200之间的素数。
	
	101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199

	优化方法：1.缩小判断除数范围至sqrt(n)
	          2.去掉除2以外的偶数
*/
#include<stdio.h>
#include<math.h>
int is_prime(int n);
int main() {
	//for (int i = 100; i <= 200; i++) {
	//重新调整数的开始，从99开始，将i++改为i+=2
	for (int i = 100-1; i <= 200; i+=2) {
		if (is_prime(i)) {
			printf("%d ", i);
		}
	}
}
/*
 检测该数据是否为素数

 返回值: 0表示不是素数，1表示是素数
*/
int is_prime(int n) {
	for (int i = 2; i <= sqrt(n); i++) {
		if (0 ==n % i ) {
			return 0;
		}
	}
	return 1;
}