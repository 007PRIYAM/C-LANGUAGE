#include<stdio.h>
#include<conio.h>
void main()
{
	int i,j,k;
	char l;
	for(i=1;i<=4;i++)
	{
		k=1;
		l='A';
		for(j=1;j<=8;j++)
		{
			if(j<=4)
			{
				if(j>=5-i && j<=4+i)
				{
					printf("%c",l);
					l++;
				}
				else
				{
					printf(" ");
				}
			}
			else
			{
				if(j>=5-i && j<=4+i)
				{
					printf("%d",k);
					k++;
				}
				else
				{
					printf(" ");
				}
			}
		}
		printf("\n");
	}
	getch();
}
