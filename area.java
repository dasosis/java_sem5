import java.util.Scanner;

class shape {

    public float circle(float x) {
        return (x * x * 22/7);
    }
    public float square(float x) {
        return x*x;
    }
    public float rectangle(float x, float y) {
        return x*y;
    }
    public float triangle(float b, float h){
        return(b * h * 1/2);
    }    
};
public class area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        shape s = new shape();
        System.out.println("enter radius of circle to find area");
        float x = scan.nextFloat();
        System.out.println("area of circle is " + s.circle(x));

        System.out.println("enter side of square to find area");
        x = scan.nextFloat();
        System.out.println("area of square is " + s.square(x));

        System.out.println("enter sides of rectangle to find area");
        x = scan.nextFloat();
        float y = scan.nextFloat();
        System.out.println("area of rectangle is " + s.rectangle(x,y));

        System.out.println("enter base,height of triangle to find area");
        x = scan.nextFloat();
        y = scan.nextFloat();
        System.out.println("area of triangle is " + s.triangle(x,y));
    
        scan.close();
    }
}
