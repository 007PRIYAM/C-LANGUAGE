#include<stdio.h>
#include<conio.h>
void value(int x, int y); // function prototype
void main()
{
	int a,b;
	clrscr();\
	printf("ENTER NUMBERS");
	scanf("%d%d",&a,&b);
	printf(" before calling function : a = %d ; b = %d\n",a,b);
	value(a,b); // FUNCTION CALL
	printf(" after calling function : a = %d ; b =%d\n",a,b);
}
// user-defined function
void value(int x, int y)
{
	x++;
	y++;
	printf(" value inside user - defined function : a = %d ; b = %d\n",x,y);
}
