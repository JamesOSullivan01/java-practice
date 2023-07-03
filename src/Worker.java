package src;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;


    // default costructor so that our subclasses have a little more flexibility
    public Worker() {

    }
// Create the constructor first
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge () {
        int currentYear = 2025;

        // Integer.parseInt parse a string into an integer
        // we are using substring (6) because we are using the date format dd/mm/yyyy. So the birthyear starts at index 6.
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    // This method will be overwritten by subclasses that can return the actual pay
    public double collectPay () {
        return 0.0;
    }

    // could have created a setter but creating a method is a little more clear for this logic.
    public void terminate(String endDate) {
        this.endDate = endDate;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
