/*
��Ŀ���ӣ�https://www.nowcoder.com/questionTerminal/cc57022cb4194697ac30bcb566aeb47b

��һ���ַ���str�����ݵߵ��������������str�ĳ��Ȳ�����100���ַ��� �磺���롰I am a student���������tneduts a ma I����

���������

inputString��������ַ���


����ֵ��

���ת���õ������ַ���

��������:
����һ���ַ����������пո�
�������:
���������ַ���

ʾ��1
����
I am a student
���
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

