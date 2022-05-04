import java.util.*;

class Exception2
{
    public static void main(String a[])
    {
        int ino1 = 0, ino2 = 0, ans = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        ino1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        ino2 = sobj.nextInt();

        try
        {
            ans = ino1 / ino2;
        }

        catch(ArithmeticException obj)
        {
            System.out.println("Exception occured as : "+obj);
        }

        finally
        {
            sobj.close();
        }

        System.out.println("Division is: "+ans);

    }
}