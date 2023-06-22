package src;

public class Switch {

    public static String getQuarter (String month) {
        switch (month) {
            case "January":
            case "February":
            case "March":
                return "1st";
            case "April":
            case "May":
            case "June":
                return "2nd";
            case "July":
            case "August":
            case "September":
                return "3rd";
            case "October":
            case "November":
            case "December":
                return "4th";
        }
        return "bad";
    }

    static String month = "April";


    public static void main(String[] args) {

        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");


        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("value was one");
                break;
            case 2:
                System.out.println("Value was two");
                break;
            case 3:
                System.out.println("Value was three");
                break;
            default:
                System.out.println("Was not 1, two or 3");
                break;
        }

        // new features of switch statement


        int switchValueNew = 4;
        switch (switchValueNew) {
            case 1 -> System.out.println("value was one");
            case 2 -> System.out.println("Value was two");
            case 3 -> System.out.println("Value was three");
            default -> System.out.println("Was not 1, two or 3");
        }




    }
}
