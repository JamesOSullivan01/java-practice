package src;

public class BankAccount {
    private int accNum;
    private double accBal;
    private String customerName;
    private String customerEmail;
    private int cutomerPhoneNumber;

    public void depositMoney (double deposit) {
        accBal += deposit;
        System.out.println("Deposit: " + deposit + "\nNew Balance: " + accBal);
    }

    public void withdrawFunds (double withdraw) {
        if (accBal - withdraw < 0) {
            System.out.println("\nInsufficient funds");
        } else {
        accBal -= withdraw;
        System.out.printf("Withdraw: %f%n New Balance: %f", withdraw, accBal);
    }}

    // getters
    public int getAccNum() {
        return accNum;
    }

    public double getAccBal() {
        return accBal;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getCutomerPhoneNumber() {
        return cutomerPhoneNumber;
    }

    // setters
    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCutomerPhoneNumber(int cutomerPhoneNumber) {
        this.cutomerPhoneNumber = cutomerPhoneNumber;
    }


}
