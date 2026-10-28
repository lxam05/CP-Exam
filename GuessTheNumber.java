import java.util.*;

public class GuessTheNumber{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 1000;

        System.out.println((low + high) / 2);
        System.out.flush();

        int numGuesses = 1;

        while(numGuesses <= 10 && sc.hasNextLine()){

            String line = sc.nextLine();

            int middle = (high + low) / 2;

            if(line.equals("correct")){
                return;
            }
            else if(line.equals("lower")){
                high = middle;
            }
            else if(line.equals("higher")){
                low = middle;
            }
            else{
                System.out.println("line:" + line);
            }

            System.out.println(middle);
            System.out.flush();

            numGuesses++;
        }

        if(numGuesses >= 10){
            return;
        }

        sc.close();
    }
}