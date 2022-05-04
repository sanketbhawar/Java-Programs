import java.util.*;

class Exception
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int ino1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        int ino2 = sobj.nextInt();

        int ans = ino1 / ino2;

        System.out.println("Division is: "+ans);
        sobj.close();
    }
}