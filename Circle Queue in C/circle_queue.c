//circle queue struceture to be included in other codes

//#include <stdio.h>
//#include <stdlib.h>

struct queue;

struct queue{
	int *array;
	int size;
	int back;
	int front;
};

//(*Struct_Pointer).Element is the same is Struct_Pointer -> Element

void makeQueue (struct queue *circQueue, int size){
	//circQueue = (struct queue *) malloc (sizeof (struct queue));
	circQueue -> array = (int*) malloc (size * sizeof(int)); //memory must be freed separately from struct
	circQueue -> size = size;
	circQueue -> front = 0;
	circQueue -> back = 0;
}

void enqueue (struct queue *circQueue, int val){
	if ((circQueue -> back + 1) % circQueue -> size != circQueue -> front){
		circQueue -> array[circQueue -> back] = val;
		circQueue -> back = (circQueue -> back + 1) % circQueue -> size;
	}
}

int dequeue (struct queue *circQueue){
	if (circQueue -> front != circQueue -> back){
		int front = circQueue -> array[circQueue -> front];
		circQueue -> front = (circQueue -> front + 1) % circQueue -> size;
		return front;
	}
	return 0;
}

void freeSpace (struct queue *circQueue){
	free(circQueue -> array); //freeing allocated array memory
	circQueue -> array = NULL;
	free(circQueue); //freeing allocated struct memory
	circQueue = NULL;

}
