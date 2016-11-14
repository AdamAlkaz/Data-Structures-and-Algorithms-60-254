//quick sort algorithm to be used with other programs

/*
#include <stdio.h>
#include <stdlib.h>
*/

#include "swap.c"

void quickSort (int *L, int p, int q){
	if (p != q){
		int pivot = L[p];
		int lx = p - 1;
		int rx = q + 1;
		while (rx > lx){
			while ( L[rx] > pivot)
				rx--;
			while (L[lx] < pivot)
				lx++;
			if (lx < rx)
				swap (&L[lx] , &L[rx]);
		}
		quickSort (L, p, rx);
		quickSort (L, rx + 1, q);
	}
}
