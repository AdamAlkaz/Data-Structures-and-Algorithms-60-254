//insetion sort algorithm to be included into other programs

#include <stdio.h>
#include <stdlib.h>


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

//Testing


void printArray (int *array, int size){
	for (int i = 0; i < size; i++){
		printf("%d   ", array[i]);
	}
}

int main(){
	int *a = (int*) malloc(5 * sizeof (int));
	for (int i = 5 ; i > 0 ; i--){
		a[i - 1] = i;
	}	
	insertSort (a, 5);
	printArray (a, 5);
	free(a);
	return 0;
}
