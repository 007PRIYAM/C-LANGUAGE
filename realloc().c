#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
	int i , *ptr;
	clrscr();
	ptr = (int *)malloc(5*sizeof(int));   // malloc for dynamic memory allocation
	printf("ENTER NUMBERS");
	if(ptr == NULL)
	{
		printf("MEMORY SPACE NOT AVAILABLE");
		exit(1);
	}
	for(i = 0 ; i < 5 ;i++)
	{
		scanf("%d",ptr+i);
	}
	// now we want to increase the size of memory block we will increase with the help of
	// realloc()
	ptr = (int *)realloc(ptr,9*sizeof(int));
	printf("PLEASE ENTER 4 MORE NUMBERS");
	for(i = 5 ; i < 9;i++)
	{
		scanf("%d",ptr+i);
	}
	for(i =0 ; i < 9 ;i++)
	{
		printf("MEMORY ADDRESS : %d , MEMORY VALUE : %d",ptr+i,*(ptr+i));
	}
	getch();
}

