import java.util.Scanner;

public class javacalc 
{
    public static void main(String[] args) 
    {    
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        float x = scan.nextFloat();

        System.out.println("Enter second number");
        float y = scan.nextFloat();

        System.out.println("Choose an op: +, -, *, or /");
        char op = scan.next().charAt(0);
        float result;
        switch (op) 
        {
            case '+':
                result = x + y;
                System.out.println(x + " + " + y + " = " + result);
                break;

            case '-':
                result = x - y;
                System.out.println(x + " - " + y + " = " + result);
                break;

            case '*':
                result = x * y;
                System.out.println(x + " * " + y + " = " + result);
                break;

            case '/':
                result = x / y;
                System.out.println(x + " / " + y + " = " + result);
                break;

            default:
                System.out.println("Invalid op!");
                break;
        }
        scan.close();
    }
}
