#include "game.h"


void InitBoard(char board[ROWS][COLS], int rows, int cols,char set)
{
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
			board[i][j] = set;
		}
	}
}

void DisplayBoard(char board[ROWS][COLS], int row, int col)
{
	for (int i = 0; i <= row; i++){
		cout << i << " ";
	}
	cout << endl;
	for (int i = 1; i <=  row; i++) {
		cout << i<<" ";
		for (int j = 1; j <= col; j++) {
			cout << board[i][j]<<" ";
		}
		cout << endl;
	}
	cout << endl;
	
}

void SetMine(char mine[ROWS][COLS], int row, int col)
{
	int count = EASY_COUNT;
	while (count)
	{
		int x = rand() % row + 1;
		int y = rand() % col + 1;
		if (mine[x][y] == '0') {
			
			mine[x][y] = '1';
			count--;
		}
	}
}
int GetMineCount(char mine[ROWS][COLS],int x,int y) {
	return mine[x - 1][y] +
		mine[x - 1][y - 1] +
		mine[x - 1][y + 1] +
		mine[x][y + 1] +
		mine[x][y - 1] +
		mine[x + 1][y - 1] +
		mine[x + 1][y] +
		mine[x + 1][y + 1] - 8 * '0';
}
void FindMine(char mine[ROWS][COLS], char show[ROWS][COLS], int row, int col)
{
	int x=0, y=0;
	int win = 0;
	//9*9-EASY_COUNT
	while (win<row*col- EASY_COUNT)
	{
		cout << "ÇëÊäÈëÅÅÀ×µÃ×ø±ê:>";
		cin >> x >> y;
		if (x >= 1 && x <= 9 && y >= 1 && y <= 9) {
			if (mine[x][y] == '1') {
				cout << "ºÜÒÅº¶£¬ÓÎÏ·½áÊø£¡" << endl;
				DisplayBoard(mine, row, col);
				break;
			}
			else
			{
				int count = GetMineCount(mine,x,y);
				show[x][y] = count+'0';
				DisplayBoard(show, row, col);
				win++;
			}
		}
		else {
			cout << "ÊäÈë´íÎó£¬ÇëÖØÐÂÊäÈë£º" << endl;
		}
	}
	if (win == row * col - EASY_COUNT) {
		cout << "¹§Ï²»ñÊ¤!" << endl;
		DisplayBoard(show, row, col);
		cout << endl;
	}
	
}
