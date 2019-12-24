#include <stdio.h>
#include <conio.h>

int main()
{
    int i,j;
    for(i=1;i<=5;i++) // no. of rows
    {
        for(j=1;j<=5;j++) // no. of columns
        {
            if(j<=6-i)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
            printf("\n");
    }
    getch();
}
