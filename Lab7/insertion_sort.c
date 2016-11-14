//insetion sort algorithm to be included into other programs

/*
#include <stdio.h>
#include <stdlib.h>
*/

void insertSort (int *Array, int size){
	int j, temp;
	for (int i = 1 ; i < size; i++){
		j = i;
    		while ( j > 0 && Array[j] < Array[j-1]) {
      			temp = Array[j];
      			Array[j]   = Array[j - 1];
      			Array[j - 1] = temp;
      			j--;
		}
	}
}

