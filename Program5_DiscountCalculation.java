import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        double amount = obj.nextDouble();
        double finalAmount;

        if (amount < 500) {
            finalAmount = amount;
        } else if (amount >= 500 && amount <= 1000) {
            finalAmount = amount - (amount * 0.10);
        } else {
            finalAmount = amount - (amount * 0.20);
        }

        System.out.println("Final Payable Amount: " + finalAmount);
    }
}
