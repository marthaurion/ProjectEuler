#include<stdio.h>
#include<stdlib.h>

int main() {
	int** dp = (int**)malloc(9*sizeof(int*));
	int den[8] = {1,2,5,10,20,50,100,200};
	int i, j;
	for(i = 0; i < 9; i++)
		*(dp+i) = (int*)malloc(201*sizeof(int));
	for(i = 0; i < 9; i++)
		dp[i][0] = 1;
	for(i = 1; i < 201; i++)
		dp[0][i] = 0;
	for(i = 1; i < 9; i++) {
		for(j = 1; j < 201; j++) {
			if(den[i-1] > j) *(*(dp+i)+j) = *(*(dp+i-1)+j);
			else dp[i][j] = dp[i-1][j] + dp[i][j-den[i-1]];
		}
	}
	printf("%d\n", dp[8][200]);
	return 0;
}
