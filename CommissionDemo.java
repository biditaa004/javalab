import java.util.Scanner;

class Commission {
     double sales;

    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        if (sales < 0) {
            System.out.println("Invalid Input");
            return -1;
        } else {
            return 0.08 * sales;
        }
    }
}
 class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();
        Commission commissionObj = new Commission(sales);
        double result = commissionObj.commission();
        if (result != -1) {
            System.out.println("The commission is: " + result);
        }
        scanner.close();
    }
}
