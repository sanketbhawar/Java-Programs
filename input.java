import java.util.*;
class input
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sobj.nextLine();

        System.out.println("Enter your age");
        int age = sobj.nextInt();

        System.out.println("Enter your percentage");
        float percentage = sobj.nextFloat();

        System.out.println("Your name is : "+name);
        System.out.println("Your age is : "+age);
        System.out.println("Your percentage is : "+percentage);
        sobj.close();
    }
}