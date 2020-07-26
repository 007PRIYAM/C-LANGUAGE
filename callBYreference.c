include<stdio.h>
#include<conio.h>
void ref(int *p ,int *q);
void main()
{
	int a,b;
	printf("ENTER NUMBERS : ");
	scanf("%d%d",&a,&b);
	printf("before calling function : a = %d ; b = %d\n",a,b);
	ref(&a,&b);
	printf("after calling function : a = %d ; b = %d\n" ,a,b);
}
// USER DEFINED FUNCTION
void ref(int *p , int *q)
{
	(*p)++;
	(*q)++;
	printf("inside function : a = %d ; b = %d\n" ,*p,*q);
}
