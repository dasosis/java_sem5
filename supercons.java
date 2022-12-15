class uni
{   
    uni()
    {
        System.out.println("uni constructor called");
    }
    int count = 100;
    void superCount()
    {
        System.out.println("Uni Count = " + count);
    }
}
class student extends uni
{
    student()
    {
        super();
    }
    int count = 50;
    void superCount()
    {
        System.out.println("Total Count = " + count + super.count);
    }
    void superDisplay()
    {
        super.superCount();
    }

}

public class supercons {
    public static void main(String[] args) {
        student s1 = new student(); //super constructor
        s1.superCount(); //super variable
        s1.superDisplay(); //super method
    }
}
