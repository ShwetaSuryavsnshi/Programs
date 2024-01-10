import java.util.*;//for scanner class

class Matrix 
{
    public int Arr[][];

    public Matrix(int A,int B)
    {
        Arr=new int [A][B];
    }

    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        int i=0,j=0;
        System.out.println("Enter the elemnts: ");
        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr[i].length;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        int i=0,j=0;
        System.out.println("Entered elements are: ");
        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int Summation()
    {
        int i=0,j=0,Sum=0;;
        
        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr[i].length;j++)
            {
                Sum+=Arr[i][j];
            }
        } 
        return Sum;  
    }
}

class Program234
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=0,iCol=0,iRet=0;

        System.out.println("Enter number of rows: ");
        iRow=sobj.nextInt();

        System.out.println("Enter number of columns: ");
        iCol=sobj.nextInt();

        Matrix mobj=new Matrix(iRow,iCol);

        mobj.Accept();
        mobj.Display();

        iRet=mobj.Summation();
        System.out.println("Sum of all the elements is: "+iRet);
        
    }
}