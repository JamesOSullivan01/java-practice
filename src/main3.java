package src;

public class main3 {

    public static void main(String[] args) {

    Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
    // **Is this printing out two different objs?**
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("pay = " + tim.collectPay());

     SalariedEmployee joe = new SalariedEmployee("joe", "11/11/1990", "03/20/2020", 35000);
        System.out.println(joe);

        //When souting out methods from classes we have to identify which object to use them on. In this case we are using the object "joe" And calling using the dot notation.
        System.out.println("Joe's paycheck = " + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension checks = $" + joe.collectPay());

        HourlyEmployee Mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(Mary);
        System.out.println("Mary's paycheck = $" + Mary.collectPay());
        System.out.println("Mary's Holidaypay = $" + Mary.getDoublePay());

    }
}
