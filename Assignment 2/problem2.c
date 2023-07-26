// Accept one number from user and print that number of * on screen

#include <stdio.h>
// void Display(int iValue)
// {
//     int iCunt = 0;
//     while (iCunt < iValue)
//     {
//         printf("* ");
//         iCunt++;
//     }
// }

void Display(int iValue)
{
    
    while ( iValue>0)
    {
        printf("* ");
        iValue--;
    }
}

int main()
{
    int iNo;
    printf("Enter number : ");
    scanf("%d", &iNo);

    Display(iNo);

    return 0;
}