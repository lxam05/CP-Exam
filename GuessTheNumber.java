import java.util.*;

public class GuessTheNumber{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int low = 0;
        int high = 1000;

        int numGuesses = 0;

        while(sc.hasNextLine()){
            sc.nextLine();
            System.out.println(sc);

            while(numGuesses < 10 && low < high){

                int middle = (high + low) / 2;
                if(){
                }
                //input = lower
                else if(){
                    high = middle - 1;
                }
                else{
                    low = middle  + 1;
                }
                
                numGuesses++;
            }
        }
    }
}