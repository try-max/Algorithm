
#include"game.h"


void menu() {
	cout << "******************************************" << endl;
	cout << "*******************  1 play **************" << endl;
	cout << "*******************  0 exit **************" << endl;
	cout << "******************************************" << endl;
}
void game() {
	//存放布置好得雷
	char mine[ROWS][COLS] = { 0 };//存放‘0’
	//存放排查出得雷
	char show[ROWS][COLS] = { 0 };//存放'*'
	//初始化棋盘
	InitBoard(mine, ROWS, COLS, '0');
	InitBoard(show, ROWS, COLS, '*');
	//打印棋盘
	/*DisplayBoard(mine, ROW, COL);
	DisplayBoard(show, ROW, COL);*/
	//布置类
	SetMine(mine,ROW,COL);
	//DisplayBoard(mine, ROW, COL);
	DisplayBoard(show, ROW, COL);
	//排查雷
	FindMine(mine, show, ROW, COL);
}

void test() {
	int input = 0;
	srand((unsigned int)time(NULL));
	do {
		menu();
		cout << "请选择 :> ";
		cin >> input;
		switch (input)
		{
		case 1:
			/*cout << "扫雷" << endl;*/
			game();
			break;

		case 0:
			cout << "退出循环" << endl;
			break;
		default:
			cout << "选择错误" << endl;
			break;
		}
	} while (input);
	
}

int main() {
	test();
}