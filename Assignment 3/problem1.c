// Write a program which accept one number from user and print that number of even numbers on screen.

// Input : 7
// Output : 2 4 6 8 10 12 14

#include <stdio.h>
void printEven(int iNo)
{
    if (iNo <= 0)
    {
        return;
    }
    for (int iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("%d ", 2 * iCnt);
    }
}
int main()
{
    int iValue = 0;
    printf("Enter number: ");
    scanf("%d", &iValue);

    printEven(iValue);

    return 0;
}