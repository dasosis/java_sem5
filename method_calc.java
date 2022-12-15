import java.util.Scanner;

abstract class calculator
{
    int x,y;
    void input(int a, int b)
    {
        x = a;
        y = b;
    }
    abstract int add();
    abstract int sub();
}
class calc extends calculator
{
    int add()
    {
        return x + y;
    }
    int sub()
    {
        return x - y;
    }
}

public class method_calc {
    public static void main(String[] args) {
        calc c = new calc();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        c.input(a, b);
        System.out.println("Sum is " + c.add() + " Sub is " + c.sub());
        scan.close();
    }    
}
