import java.lang.*;

class Demo
{

}

class Hash
{
    public static void main(String a[])
    {
        String str1 = "Sanket";
        String str2 = "Sanket";
        String str3 = "Bhawar";
        Demo dobj = new Demo();

        System.out.println("HashCode of str1 : "+str1.hashcode());
        System.out.println("HashCode of str2 : "+str2.hashcode());
        System.out.println("HashCode of str3 : "+str3.hashcode());
        System.out.println("HashCode of dobj : "+dobj.hashcode());
    }
}
