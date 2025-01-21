import java.util.*;
public class evenorodd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if(num % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}