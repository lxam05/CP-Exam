import java.util.*;

public class FindMyFamily{
    public static void main(String[] args){

        //monotonic stack skeleton

        Scanner sc = new Scanner(System.in);

        int numPhotos = Integer.parseInt(sc.nextLine());
        int index = 0;

        while(index < numPhotos){
            System.out.println("ENTER");

            int numPeople = sc.nextInt();

            int counter = 0;
            while(counter < numPeople){

                int val = sc.nextInt();
                System.out.println(val);
                counter++;
            }
            
            index++;
        }



        sc.close();
    }
}