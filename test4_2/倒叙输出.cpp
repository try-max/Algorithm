/*
题目链接：https://www.nowcoder.com/questionTerminal/cc57022cb4194697ac30bcb566aeb47b

将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。 如：输入“I am a student”，输出“tneduts a ma I”。

输入参数：

inputString：输入的字符串


返回值：

输出转换好的逆序字符串

输入描述:
输入一个字符串，可以有空格
输出描述:
输出逆序的字符串

示例1
输入
I am a student
输出
tneduts a ma I
*/
#include<stdio.h>
#include<string.h>
void Reverse(char* str)
{
    char* left = str;
    char* right = str + strlen(str)-1;
    while(left < right)
    {
        char temp = *left;
        *left = *right;
        *right = temp;
        ++left;
        --right;
    }
}
void Print(char* str){
	char* start=str;
    char* end=str+strlen(str)-1;
	while(start<=end){
		printf("%c",*start);
		start++;
	}
}
int main()
{
    char str[101]={0};
    while(gets(str)){
    	Reverse(str);
    	Print(str);
	}
    return 0;
}

