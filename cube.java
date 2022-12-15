import java.util.Scanner;

public class cube {
    static int findCube(int x)
    {
        return x*x*x;
    }
    public static void main(String[] args) {
        System.out.println("enter a number to find its cube");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int c = findCube(x);
        System.out.println("the cube of " + x + " is " + c);
        scan.close();
    }
}