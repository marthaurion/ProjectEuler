#include<stdio.h>
#include<stdlib.h>

int main() {
	char* input = (char*)malloc(15*sizeof(char));
	char c;
	FILE *file;
	int i, j, k, l;
	int **m = (int**)malloc(80*sizeof(int*));
	int **dp = (int**)malloc(80*sizeof(int*));

	for(i = 0; i < 80; i++) {
		*(dp+i) = (int*)malloc(80*sizeof(int));
		*(m+i) = (int*)malloc(80*sizeof(int));
	}

	i = 0;
	j = 0;
	k = 0;
	file = fopen("matrix.txt", "r");
	c = fgetc(file);
	while(c != EOF) {
		while(c != '\n') {
			while(c != ',' && c != EOF && c != '\n') {
				*(input+k) = c;
				k++;
				c = fgetc(file);
			}
			*(input+k) = '\0';
			*(*(m+i)+j) = atoi(input);
			j++;
			k = 0;
			if(c != '\n')
				c = fgetc(file);
		}
		i++;
		j = 0;
		c = fgetc(file);
	}
	fclose(file);

	**dp = **m;
	for(i = 1; i < 80; i++) {
		**(dp+i) = **(dp+i-1)+**(m+i);
		*(*dp+i) = *(*dp+i-1)+*(*m+i);
	}

	for(i = 1; i < 80; i++) {
		for(j = 1; j < 80; j++) {
			k = dp[i-1][j];
			l = dp[i][j-1];
			if(k < l)
				dp[i][j] = k+m[i][j];
			else dp[i][j] = l+m[i][j];
		}
	}

	printf("%d\n", dp[79][79]);

	for(i = 0; i < 80; i++) {
		free(*(dp+i));
		free(*(m+i));
	}
	free(dp);
	free(input);
	free(m);
	return 0;
}