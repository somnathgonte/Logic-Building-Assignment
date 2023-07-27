//// Write a program which accept one number from user and print even factor of that number .

// Input : 24
// Output : 1 2 4 6 8 12

#include <stdio.h>
void DisplayFactor(int iNo) // function defination
{
    int i = 0;

    if (iNo <= 0)
    {
        iNo = -iNo;
    }
    for (i = 1; i < iNo; i++)
    {
        if (iNo % i == 0)
        {
            printf("%d\t", i);
        }
    }
}
int main()
{
    int iValue = 0;

    printf("Enter number: ");
    scanf("%d", &iValue);

    DisplayFactor(iValue); // function call

    return 0;
}