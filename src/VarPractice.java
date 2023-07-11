package src;

public class VarPractice {

    public String name;

    private double salary;

    public VarPractice(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmp() {
        System.out.println("name = " + name);
        System.out.println("salary = " + salary);
    }

    public static void main(String[] args) {
        VarPractice empOne = new VarPractice("bill");
        empOne.setSalary(1000);
        empOne.printEmp();
    }

}
