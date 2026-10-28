import java.util.*;

public class Alphabet{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String alphabet = sc.nextLine();

        String fullAlphabet = "abcdefghijklmnopqrstuvwxyz";

        //get largest substring

        int max = 0;

        char[] alphabetChar = fullAlphabet.toCharArray();

        Arrays.sort(alphabetChar);

        for(int i = 0; i < alphabetChar.length; i++){
            System.out.print(alphabetChar[i] + " ");
        }
    }
}