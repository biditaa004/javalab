import java.util.*;
class Diagonal 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 numbers");
        int arr[][] = new int[3][3];
        int l = 0;
        int r = 0;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3 ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++)
        {
            l = l + arr[i][i];
        }
        for(int i = 0; i < 3; i++)
        {
            r = r + arr[i][2 - i];
        }
        System.out.println("Sum of left diagonal elements: " + l);
        System.out.println("Sum of right diagonal elements: " + r);
    }
    
}