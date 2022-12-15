class employee
{
    void inh_check()
    {
        System.out.println("inside employee");
    }
}
class programmer extends employee
{}

public class single_inherit {
    public static void main(String[] args) {
        programmer p = new programmer();
        p.inh_check();
    }
}
