/*WAP to overload subtract method with vaious parameters in a class */
public class Subtract 
{
    public void subtract(int a, int b)
    {
        System.out.println("Subtraction: " + (a - b));
    }
    public void subtract(int a, int b, int c)
    {
        System.out.println("Subtraction: " + (a - b - c));
    }
    public void subtract(double a, double b)
    {
        System.out.println("Subtraction: " + (a - b));
    }
    public void subtract(double a, double b, double c)
    {
        System.out.println("Subtraction: " + (a - b - c));
    }
    public static void main(String args[])
    {
        Subtract s = new Subtract();
        s.subtract(10, 5);
        s.subtract(10, 5, 2);
        s.subtract(10.5, 5.5);
        s.subtract(10.5, 5.5, 2.5);
    }
}