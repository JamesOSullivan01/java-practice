package src;
//main1
public class BankAccount {



    private int accNum;
    private double accBal;
    private String customerName;
    private String customerEmail;
    private int cutomerPhoneNumber;


    // This is a constructor. Note that it has the same name as the class and that nothing is returned, not even void. This will be called first if we run the program. The purpose is to initialize the object. A class can have many constructors.

    public BankAccount() {
        //If we use the this() method explained belw it has to be the very first thing executed.

        //Here we are using constructor overloading. Calling the constructor with the same name but that has five parameters. We will use this() and pass in literals in the same order as the arguments used in the other constructor. This is setting default values if we create an object for this class.
        this(123456, 23.3, "Bill", "Bill@Bill.com", 123456789);
        System.out.println("***Empty constructor called***");
    }

    // Our major constructor
    public BankAccount(int accNum, double accBal, String customerName, String customerEmail, int cutomerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accNum = accNum;
        this.accBal = accBal;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.cutomerPhoneNumber = cutomerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, int cutomerPhoneNumber) {
        this(1233321, 200, customerName, customerEmail, cutomerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.cutomerPhoneNumber = cutomerPhoneNumber;
    }

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
