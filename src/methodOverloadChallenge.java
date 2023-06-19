package src;

public class methodOverloadChallenge {

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        double totalInches = heightInFeet * 12 + heightInInches;
        return convertToCentimeters((int) totalInches);
    }


    public static void main(String[] args) {


        System.out.println(convertToCentimeters(73));

    }
}
