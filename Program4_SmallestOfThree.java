import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        int smallest;

        if (a < b && a < c) {
            smallest = a;
        } else if (b < a && b < c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("Smallest number is: " + smallest);
    }
}
