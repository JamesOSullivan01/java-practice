package src;

public class NumberInWord {

    public static String printNumberInWord(int number) {
        String word;
        switch (number) {
            case 0 -> word = "ZERO";
            case 1 -> word = "ONE";
            case 2 -> word = "TWO";
            case 9 -> word = "NINE";
            default -> word = "OTHER";
        }
        System.out.println(word);
        return word;
    }

    public static void main(String[]args){
printNumberInWord(0);
printNumberInWord(1);
printNumberInWord(2);
printNumberInWord(9);
printNumberInWord(4);
    }
}


