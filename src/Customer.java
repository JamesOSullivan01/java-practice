package src;

//main2

public class Customer {
private String name;

private int creditLimit;

private String emailAddress;

public Customer () {
    this("Bob", "Bob@Bob.com");
}


    public Customer(String name, String emailAddress){
        this(name, 1000, emailAddress);
    }



public Customer(String name, int creditLimit, String emailAddress) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.emailAddress = emailAddress;
//    System.out.println("Test");
}







    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }



}
