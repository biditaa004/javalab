public class ConsOverload 
{
    ConsOverload(int x,int y)
    {
        System.out.println(x+" first constructor "+y);
    }
    ConsOverload(String x,String y)
    {
        System.out.println(x+" Second constructor "+y);
    }
    ConsOverload(int x,int y,int z)
    {
        System.out.println(x+" Third  "+y+" constructor "+z);
    }

    public static void main(String[] args)
    {
        ConsOverload c1 = new ConsOverload(1,2);
        ConsOverload c2 = new ConsOverload("1","2");
        ConsOverload c3 = new ConsOverload(1,2,3);
    }

    
}
