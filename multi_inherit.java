class shape{
    void check_base()
    {
        System.out.println("check!");
    }
}
class rectangle extends shape{
    void check_rec()
    {
        System.out.println("single inheritance");
        check_base();
    }
}
class square extends rectangle
{
    void check_sq()
    {
        System.out.println("multilevel inheritance");
        check_base();
    }
}
class circle extends shape{
    void check_circle()
    {
        System.out.println("hierarchical inheritance");
        check_base();
    }
}

public class multi_inherit {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.check_rec(); //single inheritance
        square s = new square();
        s.check_sq(); //multilevel inheritance
        circle c = new circle();
        c.check_circle(); //heierarchical inheritance
        System.out.println("using multiple types of inheritance shows hybrid inheritance");
    }
}