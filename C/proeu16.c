#include<stdio.h>
#include<stdlib.h>

int main() {
	char* final = (char*)malloc(400*sizeof(char));
	int carry = 0, k = 0, sum = 0;
	int dummy;
	int i = 1;
		
	*final = (char)(i+48);
	*(final+1) = '\0';
	
	for(i = 1; i < 1001; i++) {
		while(*(final+k) != '\0') {
			dummy = (int)(*(final+k)-48);
			dummy = 2*(dummy)+carry;
			carry = (dummy/10);
			dummy = dummy%10;
			*(final+k) = (char)(dummy+48);
			k++;
		}
		if(carry > 0) {
			*(final+k) = (char)(carry+48);
			*(final+k+1) = '\0';
		}
		carry = 0;
		k = 0;
	}

	printf("%s\n", final);
	
	for(i = 0; *(final+i) != '\0'; i++) {
		dummy = (int)(*(final+i));
		dummy -= 48;
		sum += dummy;
	}
	
	printf("%d\n", sum);
	return 0;
}
