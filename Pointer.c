#include<stdio.h>
#include<conio.h>
void main()
{
	int a = 87;
	float b = 4.5;
	int *p1 = &a;
	float *p2 = &b;
	clrscr();
               // printf("value of p1 = address of a = %p\n",p1);
	printf("value of p1 = address of a = %d\n",p1);
	printf("value of p2 = address of b = %d\n" ,p2);
	printf("address of p1 = %d\n" ,&p1);
	printf("address of p2 = %d\n" ,&p2);
	printf("value of a = %d %d %d\n", a,*p1,*(&a));
	printf("value of b = %f %f %f\n", b,*p2,*(&b));


	getch();
}


