// Accept two number from user and display first number in second numbers of times.

//Input - 21 5
//Output - 21 21 21 21 21 

#include <stdio.h>
void Display(int iNo, int iFrequency) // function defination
{
    int i = 0;
    if (iFrequency < 0)
    {
        iFrequency = -(iFrequency);
    }

    for (i = 0; i < iFrequency; i++)
    {
        printf("%d ", iNo);
    }
}
int main()
{
    int iValue = 0;
    int iCount = 0;

    printf("Enter numbers :");
    scanf("%d", &iValue);

    printf("Enter frequency :");
    scanf("%d", &iCount);

    Display(iValue, iCount); // function call

    return 0;
}
