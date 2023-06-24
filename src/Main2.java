package src;

public class Main2 {

    public static void main(String[] args) {
        Customer customer1  = new Customer();
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());


        Customer customer = new Customer("Tim", 10500, "Tim@tim.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());




        Customer customer2 = new Customer("Jane", "Jane@Jane");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

    }
}
