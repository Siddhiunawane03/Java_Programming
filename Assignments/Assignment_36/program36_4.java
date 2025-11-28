import java.util.Scanner;

class StringX
{
    public void DisplayDigit(String str)
    {
        char Arr[] = str.toCharArray();
        
        for(int iCnt = 0; iCnt<Arr.length;iCnt++)
        {
            if('0'<=Arr[iCnt] && Arr[iCnt]<= '9')
            {
                System.out.print(Arr[iCnt]);
            }
        }

        
    }
}

class program36_4
{
    public static void main(String A[])
    {
    
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        strobj.DisplayDigit(sobj);

       



    }
}