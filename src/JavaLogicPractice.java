package src;

public class JavaLogicPractice {
//    In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
public static String highAndLow(String numbers) {

    String[] result = numbers.split(" ");
    int highNum = Integer.parseInt(result[0]);
    int lowNum = Integer.parseInt(result[0]);

    for(String number : result){
        int currentNum = Integer.parseInt(number);
        if (currentNum > highNum) {
            highNum = currentNum;
        } else if (currentNum < lowNum) {
            lowNum = currentNum;
        }
    }
    return highNum + " " + lowNum;
}


}
