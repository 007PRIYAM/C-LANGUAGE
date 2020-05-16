	#include <stdio.h>		
	#include <string.h>		
	#include <math.h>		
	#include <stdlib.h>		
	// ABOVE ALL HEADER FILES
	int main()		
	{		
	char s[1000],ch[20]="0123456789";	 // HERE TWO ARRAY ARE CRETED TO HOLD STRING VALUES 	
  int i,j,k;		
	gets(s);		                       // STRING IS TAKEN FROM USER
  for(j=0;ch[j];j++)		
	{		
	k=0;		
  for(i=0;s[i];i++)		
	{		
	if(ch[j] == s[i])		       // HERE CHARACTER MATCHING PERFORMS IF YES K INCREAMENTS BY 1 OTHERWISE COME OUT FROM IF CONDITION
	{		
	k++;		
	}		
	}		
	printf("%d ",k);		
	}		
	return 0;		
	}		


