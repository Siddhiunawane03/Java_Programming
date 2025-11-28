import java.util.Scanner;

class StringX
{
    public String ToggleX(String str)
    {
        char Arr[] = str.toCharArray();
        
        for(int iCnt = 0; iCnt<str.length();iCnt++)
        {
            if('a'<=Arr[iCnt] && Arr[iCnt]<= 'z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
            else if('A'<=Arr[iCnt] && Arr[iCnt]<= 'Z')
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }

        return new String(Arr);
    }
}

class program36_3
{
    public static void main(String A[])
    {
        String sRet = new String();
       

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter the string");
        String sobj = scanobj.nextLine();

        StringX strobj = new  StringX();

        sRet = strobj.ToggleX(sobj);

        System.out.println(sRet);



    }
}