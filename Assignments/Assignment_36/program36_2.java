import java.util.Scanner;

class StringX
{
    public String ToUpperX(String str)
    {
        char Arr[] = str.toCharArray();
        
        for(int iCnt = 0; iCnt<str.length();iCnt++)
        {
            if('a'<=Arr[iCnt] && Arr[iCnt]<= 'z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
        }

        return new String(Arr);
    }
}

class program36_2
{
    public static void main(String A[])
    {
        String sRet = new String();
       

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String sobj = scanobj.nextLine();

        StringX strobj = new  StringX();

        sRet = strobj.ToUpperX(sobj);

        System.out.println(sRet);



    }
}