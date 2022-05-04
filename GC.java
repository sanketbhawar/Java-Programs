import java.lang.*;

class Demo
{
    public int Arr[];

    public demo(int size)
    {
        System.out.println("Allocating the resources in contructor");
        this.Arr = new int[size];

    }

    protected void finilize()
    {
        System.out.println("Deallocating resources in finilize");
        this.Arr = null;
    }
}
class GC
{
    public static void main(String a[])
    {
        Demo obj = new Demo();
        obj = null;
        System.gc();
        System.out.println("End of main");
    }
}