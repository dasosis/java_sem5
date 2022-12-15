import java.util.Scanner;
class account{
    public float amount;
    account(){
        amount = 0;
    }
    public void widraw(float x) {
        if (amount>x) {
            amount = amount - x;
            System.out.println("transaction successfull");
        }
        else
            System.out.println("insufficient amount");
    }
    public void deposit(float x) {
        amount = amount + x;
        System.out.println("balance updated");
    }
    public float check() {
        return amount;
    }
};
public class bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        account ac = new account();
        int c = 1;
        while (c!=0) {
            System.out.println("1->Deposit 2->Widraw 3->Check Balance 0->Exit");
            c = scan.nextInt();
            switch (c) {
                case 1:
                    System.out.println("enter amount to be deposited");
                    float x = scan.nextFloat();
                    ac.deposit(x);
                    break;
                case 2:
                    System.out.println("enter amount to be widrawled");
                    x = scan.nextFloat();
                    ac.widraw(x);
                    break;
                case 3:
                    System.out.println("balance -> " + ac.check());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
        }
        scan.close();
    }
}
