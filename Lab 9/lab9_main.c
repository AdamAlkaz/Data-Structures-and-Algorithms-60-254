//Main program of lab 9 that test heapify, BuildHeap, and Heapsort algorithms

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#include "printIntArray.c"
#include "Heapsort.c"

int main (){
	srand (time(NULL));
	int A [] = {4, 2, 1, 8, 6, 5, 10, 9, 11, 16};
	heapify(A, 0, 9);
	printIntArray (A, 10);
	int B [] = {12, 10, 15, 19, 8, 7, 20};
	BuildHeap (B, 7);
	printIntArray (B, 7);
	Heapsort (B, 7);
	printIntArray(B, 7);
	int *C = (int*) malloc (100);
	for (int i = 0; i < 100; i++)
		C[i] = rand() % 500 + 1;
	BuildHeap (C, 100);
	Heapsort (C, 100);
	printIntArray (C, 100);
	free (C);
	return 0;
}