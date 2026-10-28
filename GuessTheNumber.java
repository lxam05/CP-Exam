import java.util.*;

public class GuessTheNumber{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int low = 0;
        int high = 1000;

        System.out.println(500);
        System.out.flush();

        int numGuesses = 1;

        while(sc.hasNextLine()){

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

            System.out.println(middle);
            System.out.flush();
            
            numGuesses++;
        }

        sc.close();
    }
}