//���������������в�ͬλ�ĸ���
//
//���ʵ�֣�����int��32λ������m��n�Ķ����Ʊ���У��ж��ٸ�λ(bit)��ͬ��
//
//�������� :
//
//1999 2299
//
//������� : 7
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