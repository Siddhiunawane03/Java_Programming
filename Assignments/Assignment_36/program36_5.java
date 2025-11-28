import java.util.Scanner;

class StringX
{
    public int CountWhite(String str)
    {
        int iCount = 0;
        char Arr[] = str.toCharArray();
        
        for(int iCnt = 0; iCnt<str.length();iCnt++)
        {
            if(Arr[iCnt]==' ')
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class program36_5
{
    public static void main(String A[])
    {
        int iRet = 0;
       

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String sobj = scanobj.nextLine();

        StringX strobj = new  StringX();

        iRet = strobj.CountWhite(sobj);

        System.out.println(iRet);



    }
}