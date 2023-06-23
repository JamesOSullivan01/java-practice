package src;

public class Main1 {
    public static void main(String[] args) {
        BankAccount billsAccount = new BankAccount();


        billsAccount.setAccBal(1232);
        billsAccount.setAccNum(489384);
        billsAccount.setCustomerName("Bill Bill");
        billsAccount.withdrawFunds(100.0);
        billsAccount.depositMoney(250.00);
        billsAccount.withdrawFunds(50.0);
        billsAccount.withdrawFunds(200.0);
        billsAccount.depositMoney(.45);
        billsAccount.depositMoney(.23);
        billsAccount.withdrawFunds(.34);
        billsAccount.withdrawFunds(.35);


    }

}
