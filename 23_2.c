#include<stdio.h>
void Pattern(int iNo1,int iNo2)
{
    int i=0;
    int j=0;
    for(i=1;i<=iNo1;i++)
    {
        for(j=1;j<=iNo2;j++)
        {
           if(i+j==iNo2+1)
           {
            printf("#\t");
           }
           else if( i+j <= 4 )
           {
            printf("*\t");
           }
           else 
           {
            printf("@\t");
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

    printf("Enter number of rows\n");
    scanf("%d",&iValue2);

    Pattern(iValue1,iValue2);

    return 0;
}