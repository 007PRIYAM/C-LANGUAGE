#include<stdio.h>
#include<conio.h>
void main()
{
	int *p[3];
	int a,b,c,i;
	clrscr();
	a = 1 , b = 2 , c = 3;
	p[1] = &a;
	p[2] = &b;
	p[3] = &c;
	for(i=0;i<3;i++)
	{
		printf("Addresses : %p\n",p[i]);
		printf("Values    : %d\n",*p[i]);
	}
	getch();
}
