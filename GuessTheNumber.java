import java.util.*;

public class GuessTheNumber{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int low = 0;
        int high = 1000;

        int numGuesses = 0;

        while(sc.hasNextLine()){
            sc.nextLine();
            String line = sc.nextLine();

            if(numGuesses >= 10) return;

            int middle = (high + low) / 2;

            if(line.equals("correct")){
                System.out.println(middle);
                
                return;
            }
            else if(line.equals("lower")){
                high = middle - 1;
            }
            else{
                low = middle + 1;
            }

            numGuesses++;
        }

        sc.close();
    }
}