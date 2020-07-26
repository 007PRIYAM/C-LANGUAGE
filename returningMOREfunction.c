#include<stdio.h>
#include<conio.h>
void fun(int a , int b , int *p, int *q, int *pp);
void main()
{
	int x,y,sum,diff,mul;
	clrscr();
	printf("ENTER VALUE OF NO.S");
	scanf("%d%d%d",&x,&y);
	fun(x,y,&sum,&diff,&mul);
	printf("%d%d%d",sum,diff,mul);
	getch();
}
// USER-DEFINED FUNCTIONS
void fun(int a , int b , int *p, int *q, int *pp)
{
	*p = a+b;
	*q = a-b;
	*pp = a*b;
}
