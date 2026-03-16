import java.util.Scanner;
class BankAccount{
    private int accountnumber;
    private String accountHolder;
    private double balance;
    BankAccount(int accountnumber,String accountHolder, double intialbalance){
        this.accountnumber = accountnumber;
        this.accountHolder = accountHolder;
        this.balance = intialbalance;
    }
    public int getAccountnumber() {
        return accountnumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    void deposit(double amt){
        if(amt>0){
            balance = balance+amt;
            System.out.println("Deposited Amount: $"+amt);
        }
        else
            System.out.println("Invalid Amount");
    }

    void withdrawl(double amt){
        if(amt>0){
            if(amt<balance){
                balance = balance-amt;
                System.out.println("Withdrawl Amount: $"+amt);
            }
            else
                System.out.println("Insufficient amount");
        }
        else
            System.out.println("Invalid Amount");

    }


}

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the Account Number: ");
        int accountnumber = S.nextInt();
        System.out.println("Enter the Account Holder Name: ");
        String accountHolder = S.nextLine();
        System.out.println("Enter the Inital Balance: ");
        double intialbalance = S.nextDouble();
        BankAccount B1 = new BankAccount(accountnumber, accountHolder, intialbalance);
        int choice;
        while(true){
            System.out.println("Bank Account Menu");
            System.out.println("1. Desposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Press 4 to Exit");
            System.out.println("Enter your choice");
            choice = S.nextInt();
            if( choice==4)
            {
                System.out.println("Thank you from our Bank");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter your deposit Amount");
                    double depositamt = S.nextDouble();
                    B1.deposit(depositamt);
                    break;
                case 2:
                    System.out.println("Enter your withdrawl Amount");
                    double withdrawlamt = S.nextDouble();
                    B1.withdrawl(withdrawlamt);
                default:
                    break;
            }
    }

    }
}
