package src;

public class JavaLogicPractice {
    //    In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
    public static String highAndLow(String numbers) {

        String[] result = numbers.split(" ");
        int highNum = Integer.parseInt(result[0]);
        int lowNum = Integer.parseInt(result[0]);

        for (String number : result) {
            int currentNum = Integer.parseInt(number);
            if (currentNum > highNum) {
                highNum = currentNum;
            } else if (currentNum < lowNum) {
                lowNum = currentNum;
            }
        }
        return highNum + " " + lowNum;
    }


//    Bob is working as a bus driver. However, he has become extremely popular amongst the city's residents. With so many passengers wanting to get aboard his bus, he sometimes has to face the problem of not enough space left on the bus! He wants you to write a simple program telling him if he will be able to fit all the passengers.
//
//    Task Overview:
//    You have to write a function that accepts three parameters:
//
//    cap is the amount of people the bus can hold excluding the driver.
//    on is the number of people on the bus excluding the driver.
//    wait is the number of people waiting to get on to the bus excluding the driver.
//    If there is enough space, return 0, and if there isn't, return the number of passengers he can't take.

    public class Bob {
        public static int enough(int cap, int on, int wait) {

            int spaceAvailable = cap - on;

            if (wait <= spaceAvailable) {
                return 0;
            } else {
                return wait - spaceAvailable;
            }
        }
    }

    //    Create a function that will return a string that combines all of the letters of the three inputed strings in groups. Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter, see example below!
//
//    E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
//
//    Note: You can expect all of the inputs to be the same length.
    public static String tripleTrouble(String one, String two, String three) {
        String[] arr1 = one.split("");
        String[] arr2 = two.split("");
        String[] arr3 = three.split("");
        StringBuilder bucket = new StringBuilder();

        for (int i = 0; i < arr1.length; i++) {
            bucket.append(arr1[i]);
            bucket.append(arr2[i]);
            bucket.append(arr3[i]);
        }

        return bucket.toString();
    }

    //    When provided with a letter, return its position in the alphabet.
//            Input :: "a"
//    Ouput :: "Position of alphabet: 1"
    protected static String position(char alphabet) {
        int numOfAlphabet;

        switch (alphabet) {
            case 'a' -> numOfAlphabet = 1;
            case 'b' -> numOfAlphabet = 2;
            case 'c' -> numOfAlphabet = 3;
            case 'd' -> numOfAlphabet = 4;
            case 'e' -> numOfAlphabet = 5;
            case 'f' -> numOfAlphabet = 6;
            case 'g' -> numOfAlphabet = 7;
            case 'h' -> numOfAlphabet = 8;
            case 'i' -> numOfAlphabet = 9;
            case 'j' -> numOfAlphabet = 10;
            case 'k' -> numOfAlphabet = 11;
            case 'l' -> numOfAlphabet = 12;
            case 'm' -> numOfAlphabet = 13;
            case 'n' -> numOfAlphabet = 14;
            case 'o' -> numOfAlphabet = 15;
            case 'p' -> numOfAlphabet = 16;
            case 'q' -> numOfAlphabet = 17;
            case 'r' -> numOfAlphabet = 18;
            case 's' -> numOfAlphabet = 19;
            case 't' -> numOfAlphabet = 20;
            case 'u' -> numOfAlphabet = 21;
            case 'v' -> numOfAlphabet = 22;
            case 'w' -> numOfAlphabet = 23;
            case 'x' -> numOfAlphabet = 24;
            case 'y' -> numOfAlphabet = 25;
            case 'z' -> numOfAlphabet = 26;
            default -> {
                return "Pick a letter between 'a' and 'z'";
            }
        }
        return "Position of alphabet: " + numOfAlphabet;
    }

//alternates using ASCII values.**
//        public static String position(char alphabet) {
//            return "Position of alphabet: " + ((int) alphabet - 96);
//        }

//     public static String position(char alphabet){
//    return String.format("Position of alphabet: %d", Integer.valueOf(alphabet) - 96);
//  }

}
