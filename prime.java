import java.util.Scanner;
public class prime {

    public static void main(String[] args) {
        System.out.println("enter a number to check if prime");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        int i;
        for (i = 2; i < Math.sqrt(x); i++) {
            if (x%i==0) {
                System.out.println(x + " is not prime number");
                break;
            }
        }
        if (i-1 == (int)Math.sqrt(x)) {
            System.out.println(x + " is a prime number");
        }
    }
}