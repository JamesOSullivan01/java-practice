package src;

public class Main1 {
    public static void main(String[] args) {


        //
//        BankAccount bobsAccount = new BankAccount(12233, 1000.2, "Bob Brown", "Bob@bob.com", 1234567890);
            BankAccount bobsAccount = new BankAccount();

        System.out.println ("Bobs Account num: " + bobsAccount.getAccNum());
        System.out.println(bobsAccount.getAccBal());
//        System.out.println(bobsAccount.getAccBal());


//        BankAccount billsAccount = new BankAccount();
//
//
//        billsAccount.setAccBal(1232);
//        billsAccount.setAccNum(489384);
//        billsAccount.setCustomerName("Bill Bill");
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositMoney(250.00);
        bobsAccount.withdrawFunds(50.0);
        bobsAccount.withdrawFunds(200.0);
        bobsAccount.depositMoney(.45);
        bobsAccount.depositMoney(.23);
        bobsAccount.withdrawFunds(.34);
        bobsAccount.withdrawFunds(.35);

        BankAccount timsAccount = new BankAccount("Tim", "Tim@Tim.com", 1234445555);
        System.out.println("AccountNO: " + timsAccount.getAccNum() + "\nCustomer Name: " + timsAccount.getCustomerName());


    }

}
