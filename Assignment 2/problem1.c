//Accept number from user and print that number of * on screen
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;

    for(iCnt=0 ; iCnt<=iNo; iCnt++)
    {

        printf("*");
    }
}

int main()
{
    int iValue = 0;
    printf("Enter number");
    scanf("%d", &iValue);

    Display(iValue);//call

    return 0;
}