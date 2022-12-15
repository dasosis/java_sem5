class employee
{
    String name, designation;
    int salary;
    employee(int s, String n, String d)
    {
        name = n;
        designation = d;
        salary = s;
    }
    void display()
    {
        System.out.println("Employee Details:\n" + name + "\n" + designation + "\n" + salary);
    }
}
public class emp_cons {
    public static void main(String[] args) {
        employee e = new employee(50000, "Soumya", "Programmer");
        e.display();
    }    
}