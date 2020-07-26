#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
// calloc(),malloc(),realloc(),free present inside stdlib.h header file
void main()
{
	int *p,n,i;
	clrscr();
	printf("Enter the number ofr integers to be entered : ");
	scanf("%d",&n);
	p = (int *)malloc(n*sizeof(int));
	if(p == NULL)
	{
		printf("Memory not available\n");
		exit(1);
	}
	for(i =0 ; i < n ;i++)
	{
		printf("ENTER AN INTEGER : ");
		scanf("%d",p+i);
	}
	for(i = 0;i<n;i++)
	{
		printf("%d\t",*(p+i));
	}
getch();
}

