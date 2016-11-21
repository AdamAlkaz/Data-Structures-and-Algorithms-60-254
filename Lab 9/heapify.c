//Recursive heapify algorithm0
//void heapify (array pointer, first index int pointer, last index int pointer)

/*
#include <stdio.h>
#include <stdlib.h>
*/

#include "max.c"
#include "swap.c"

void heapify (int *A, int i, int j){
	//static int count = 0;
	int k;

	if (2 * i + 2 <= j){
		if (max (A[2 * i + 1], A[2 * i + 2]) == A[2 * i + 1])
			k = 2 * i + 1;
		else k = 2 * i + 2;
	}
	else if (2 * i + 1 <= j){
		k = 2 * i + 1;
	}
	else {
		//printf ("%d\n", count);
		return;
	}
	
	if (A[i] < A[k])
		swap(A + i, A + k); 
	count ++;
	heapify(A, k, j);
}
