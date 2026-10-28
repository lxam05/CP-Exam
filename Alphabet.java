import java.util.*;

public class Alphabet{
    public static void main(String[] args){

        final int len = 26;

        Scanner sc = new Scanner(System.in);

        String alphabet = sc.nextLine();

        String fullAlphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] alphabetChar = alphabet.toCharArray();

        int max = 0;

        //find the longest increasing substring of characters in the string then - that number from 26
        for(int i = 0; i < alphabet.length(); i++){
            int num = 0;
            char firstChar = alphabet.charAt(i);
            for(int j = 0; j < alphabet.length(); j++){
                if(firstChar < alphabet.charAt(j)){
                    num++;
                    firstChar = alphabet.charAt(j);
                }
            }
            max = Math.max(max, num);

        }

        System.out.println(max);

    }
}