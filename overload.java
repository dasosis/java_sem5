class box
{   
    int length,breadth,depth;
    box()
    {
        length = 0;
        breadth = 0;
        depth = 0;
    }
    box(int length, int breadth, int depth)
    {
        this.length = length;
        this.breadth = breadth;
        this.depth = depth;
    }
    int volume()
    {
        return length*breadth*depth;
    }
}
class ball extends box
{
    int radius = 0;
    void radius()
    {
        System.out.println("ball with default radius");
    }
    void radius(int x)
    {
        radius = x;
        System.out.println("ball with radius " + x);
    }
    @Override
    int volume()
    {
        return (4/3 * 22/7 * radius * radius * radius);
    }
}
public class overload {
    public static void main(String[] args) {
        box nullbox = new box();
        box b1 = new box(3,5,7);
        System.out.println("The Volumes are : " + nullbox.volume() + " and " + b1.volume()); //constructor overloading
        ball c1 = new ball();
        c1.radius();
        c1.radius(2);
        System.out.println("Volume of box is " + b1.volume() + " and of ball is " + c1.volume());
    }
}
