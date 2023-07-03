package src;

// The extends keyword makes this a subclass of Worker
public class Employee extends Worker {

    private long employeeID;
    private String hireDate;

    // static field alows us to share data amongst all of our instances
    private static int employeeNo = 1;

    // four fields are made, two from the worker class and two from the employee class
    public Employee(String name, String birthDate, String hireDate) {
        //  super is calling the worker constructor from the worker class
        super(name, birthDate);
        this.employeeID = employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
