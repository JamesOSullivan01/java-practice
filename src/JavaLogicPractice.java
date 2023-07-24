package src;

import java.util.ArrayList;
import java.util.List;

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
//***
//    A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.. Assuming he's gonna grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?
//
//    Return true if yes, false otherwise :)
    public static boolean hero(int bullets, int dragons) {
        int bulletsNeededToKillDragons = dragons * 2;
        return bullets >= bulletsNeededToKillDragons;
    }

//Issue
//Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.
//The pipes connecting your level's stages together need to be fixed before you receive any more complaints.
//Pipes list is correct when each pipe after the first index is greater (+1) than the previous one, and that there is no duplicates.

//Task
//Given the a list of numbers, return a fixed list so that the values increment by 1 for each index from the minimum value up to the maximum value (both included).
//
//Example
//    Input:  1,3,5,6,7,8 Output: 1,2,3,4,5,6,7,8


    public static int[] pipeFix(int[] numbers) {
        int minNumInArray = numbers[0];
        int maxNumInArray = numbers[numbers.length - 1];
        int totalElementsInArray = maxNumInArray - minNumInArray + 1;
        int[] newArray = new int[totalElementsInArray];

        for (int i = 0; i < totalElementsInArray; i++) {
            int currentElement = minNumInArray + i;
            newArray[i] = currentElement;
        }
        return newArray;
    }


    //public class Ascii {
    public static char getChar(int c) {
        char asciiToChar = (char) c;
        return asciiToChar;
    }

//    Numbers ending with zeros are boring.
//
//    They might be fun in your world, but not here.
//
//    Get rid of them. Only the ending ones.
//
//            1450 -> 145
//            960000 -> 96
//            1050 -> 105
//            -1050 -> -105
//    Zero alone is fine, don't worry about it. Poor guy anyway

    public class NoBoring {
        public static int noBoringZeros(int n) {
            if (n == 0) {
                return 0;
            }
            while (n % 10 == 0) {
                n /= 10;
            }
            return n;
        }
    }

//    There was a test in your class and you passed it. Congratulations!
//    But you're an ambitious person. You want to know if you're better than the average student in your class.
//
//    You receive an array with your peers' test scores. Now calculate the average and compare your score!
//
//    Return True if you're better, else False!
//
//    Note:
//    Your points are not included in the array of your class's points. For calculating the average point you may add your point to the given array!

    public class Kata {
        public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
            int sumOfClassGrades = 0;
            for (int i = 0; i < classPoints.length; i++) {
                sumOfClassGrades += classPoints[i];
            }
            int result = sumOfClassGrades / classPoints.length;
            return yourPoints > result;
        }

//        Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
//
//        Note: input will never be an empty string

        public class FakeBinary {
            public static String fakeBin(String numberString) {

                StringBuilder result = new StringBuilder();

                for (char c : numberString.toCharArray()) {
                    int digit = Character.getNumericValue(c);
                    if (digit < 5) {
                        result.append(0);
                    } else {
                        result.append(1);
                    }
                }

                return result.toString();

            }
        }

//        Given the total number of rows and columns in the theater (nRows and nCols, respectively), and the row and column you're sitting in, return the number of people who sit strictly behind you and in your column or to the left, assuming all seats are occupied.
//
//        Example
//        For nCols = 16, nRows = 11, col = 5 and row = 3, the output should be 96.

        public static int seatsInTheater(int nCols, int nRows, int col, int row) {

            int colsToTheLeftOfMe = nCols - col + 1;
            int rowsBehindMe = nRows - row;
           return colsToTheLeftOfMe * rowsBehindMe;



        }

//        Debugging sayHello function
//        The starship Enterprise has run into some problem when creating a program to greet everyone as they come aboard. It is your job to fix the code and get the program working again!
//
//        Example output:
//
//        Hello, Mr. Spock

        public class GrassHopper {
            public static String sayHello(String name) {

                StringBuilder newString = new StringBuilder();

                newString.append("Hello, " + name);

                return newString.toString();
            }
        }

//        Write a function to split a string and convert it into an array of words.
        public class Solution {

            public static String[] stringToArray(String s) {

                String[] splitArray = s.split(" ");
                return splitArray;
            }
        }

        public static String findNeedle(Object[] haystack) {

            for (int i = 0; i < haystack.length; i++) {
                if (haystack[i] == "needle") {
                    return "found the needle at position " + i;
                }
            }
            return "needle be lost, yo";
        }

//        public static String findNeedle(Object[] haystack) {
//            return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
//        }


//        Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.
//        For example:
//        a = 1
//        b = 4
//                --> [1, 2, 3, 4]

        public static int[] between(int a, int b) {
            int numberOfElementsInArray = b - a;
            int[] arr = new int[numberOfElementsInArray + 1];

            for (int i = a; i <= b; i++) {
                arr[i - a] = i;
            }

            return arr;
        }
//Write a function named setAlarm/set_alarm/set-alarm/setalarm (depending on language) which receives two parameters. The first parameter, employed, is true whenever you are employed and the second parameter, vacation is true whenever you are on vacation.
//
//The function should return true if you are employed and not on vacation (because these are the circumstances under which you need to set an alarm). It should return false otherwise.

        public static boolean setAlarm(boolean employed, boolean vacation) {
            return employed && !vacation;
        }




//        Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
//
//        Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.
        public static int paperWork(int n, int m)
        {
            return (n < 0) || (m < 0) ? 0 : n * m;
            //Happy Coding! ^_^
        }
    }
//    Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!

    public static String smash(String... words) {
        StringBuilder bucket = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            bucket.append(words[i]);
            if (i < words.length - 1) {
                bucket.append(" ");
            }
        }
        return bucket.toString();
    }

    public class BooleanToString {
        public static String convert(boolean b) {

            String newString = String.valueOf(b);

            return newString;
        }
    }

//    Implement a function which convert the given boolean value into its string representation.
//
//Note: Only valid inputs will be given.

    public static String convert(boolean b) {

        String newString = String.valueOf(b);

        return newString;
    }


//Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (sheep == null) {
                continue;
            }
            if (sheep) {
                counter++;
            }
        }
        return counter;
    }

    // Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.

    public static String shortcut(String input) {
        StringBuilder newString = new StringBuilder();

        char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                continue;
            } newString.append(ch[i]);
        }

        return newString.toString();
    }

//      public static String shortcut(String input) {
//    return input.replaceAll("[aeiou]", "");
//  }

//    Write function bmi that calculates body mass index (bmi = weight / height2).
//            if bmi <= 18.5 return "Underweight"
//            if bmi <= 25.0 return "Normal"
//            if bmi <= 30.0 return "Overweight"
//            if bmi > 30 return "Obese"

    public class Calculate {
        public static String bmi(double weight, double height) {

            double calculatedBmi = weight / (height * height);

            if (calculatedBmi <= 18.5) {
                return "Underweight";
            } else if (calculatedBmi <= 25.0) {
                return "Normal";
            } else if (calculatedBmi <= 30.0) {
                return "Overweight";
            } else {
                return "Obese";
            }
        }
    }

    //Given an array of integers your solution should find the smallest integer.
    public static int findSmallestInt(int[] args) {

        int smallestInt = args[0];
        for(int i = 0; i < args.length; i++) {
            if (args[i] < smallestInt){
                smallestInt = args[i];
            }
        }
        return smallestInt;
    }

//    Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
        public static String boolToWord(boolean b)
        {
            return (b) ? "Yes" : "No";
        }


// Very simple, given an integer or a floating-point number, find its opposite.

    public static int opposite(int number){
        return number * -1;
    }

//    Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.


    public static int summation(int n) {
        int sum = 0;

        List<Integer> numbers = new ArrayList<Integer>();
        for(int i =0; i <= n; i++) {
            numbers.add(i);
        } for(int j = 0; j < numbers.size(); j++){
            sum += numbers.get(j);
        }
        return sum;
    }

}





