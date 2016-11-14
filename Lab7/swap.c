//Swap algorithm to be used in other programs

//#include <stdio.h>

void swap (int *A, int *B){
	int temp = *A;
	*A = *B;
	*B = temp;
}