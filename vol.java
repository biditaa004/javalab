import java.util.*;

public class vol {
    public void volume1(int r)
    {
        System.out.println("volume of sphere is : " + (3.14 * 4/3 * r * r * r));
    }
    public void volume2(int l, int b , int h)
    {
        System.out.println("volume of cuboid is: " + (l * b * h));
    }
    public void volume3(int a)
    {
        
        System.out.println("Volume of cube is: " + (a*a*a));
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for sphere, 2 for cuboid, 3 for cube");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter radius");
                int r = sc.nextInt();
                vol v1 = new vol();
                v1.volume1(r);
                break;
            case 2:
                System.out.println("Enter length  breadth height");
                int l = sc.nextInt();
                int b = sc.nextInt();
                int h = sc.nextInt();
                vol v2 = new vol();
                v2.volume2(l,b,h);
                break;
            case 3:
                System.out.println("Enter  side");
                int a = sc.nextInt();
                vol v3 = new vol();
                v3.volume3(a);
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
    
}
