#include<stdio.h>
void Pattern(int iNo1,int iNo2)
{
    int i=0;
    int j=0;
    int k=iNo2;
    for(i=1;i<=iNo1;i++)
    {
        for(j=1;j<=iNo2;j++)
        {
           if(i+j==k+1 || i==1 || i+j<=k )
           {
            printf("*\t");
           }
           else
           {
            printf("#\t");
           }
           
        }
        printf("\n");
    }
}
    
int main()
{
    int iValue1=0,iValue2=0;

    printf("Enter number of rows\n");
    scanf("%d",&iValue1);

    printf("Enter number of columns\n");
    scanf("%d",&iValue2);

    Pattern(iValue1,iValue2);

    return 0;
}