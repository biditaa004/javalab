/*Write a program in Java which will overload the area () method and
display the area of a circle, triangle and square as per user choice and
user entered dimensions. */
import java.util.*;
public class Area 
{
    public void area(int r)
    {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }
    public void area(int l, int b)
    {
        System.out.println("Area of rectangle: " + (l * b));
    }
    public void area(int a, int b, int c)
    {
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle: " + area);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for circle, 2 for rectangle, 3 for triangle");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter radius");
                int r = sc.nextInt();
                Area a1 = new Area();
                a1.area(r);
                break;
            case 2:
                System.out.println("Enter length and breadth");
                int l = sc.nextInt();
                int b = sc.nextInt();
                Area a2 = new Area();
                a2.area(l, b);
                break;
            case 3:
                System.out.println("Enter 3 sides");
                int a = sc.nextInt();
                int x = sc.nextInt();
                int c = sc.nextInt();
                Area a3 = new Area();
                a3.area(a, x, c);
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
    
}