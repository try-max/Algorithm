//求两个数二进制中不同位的个数
//
//编程实现：两个int（32位）整数m和n的二进制表达中，有多少个位(bit)不同？
//
//输入例子 :
//
//1999 2299
//
//输出例子 : 7
#include<iostream>
using namespace std;
int main(){
    int m,n,r=0;
    cin>>m>>n;
    m^=n;
    while(m){
    	m&=m-1;
		r++;
	}
    cout<<r<<endl;
    return 0;
}