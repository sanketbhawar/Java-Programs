import java.lang.*;

    class Demo
    {
        public int i;
        public int j;
        public static int k;

        public Demo()
        {
            this.i = 0;
            this.j = 0;
        }

        public void fun()
        {
            System.out.println("Inside non-static fun");

        }

        public static void gun()
        {
            System.out.println("Inside static gun");
        }
    }
class StaticDemo
{
    public static void main(String a[])
    {
        Demo.gun();
        
        Demo obj;
        obj = new Demo();
        obj.fun();

        System.out.println(obj.i);
        System.out.println(obj.j);
    }
}