import java.util.*;

public class FindMyFamily{
    public static void main(String[] args){

        //monotonic stack skeleton

        Scanner sc = new Scanner(System.in);

        int numPhotos = Integer.parseInt(sc.nextLine());
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int index = 0;

        int groupCheck = 0;

        while(index < numPhotos){
            //System.out.println("ENTER");

            int numPeople = sc.nextInt();

            int counter = 0;
            List<Integer> list = new ArrayList<>();
            while(counter < numPeople){

                int val = sc.nextInt();
                //System.out.println(val);
                counter++;
                list.add(val);
            }

            for(int i = 0; i < list.size(); i++){
                int current = list.get(i);
                for(int j = i + 1; j < list.size(); j++){
                    if(list.get(j) < current){
                        current = list.get(j);
                        for(int k = j + 1; k < list.size(); k++){
                            if(list.get(k) > current){
                                set.add(i + 1);
                            }
                        }
                    }
                }
            }

            index++;
        }

        int count = 0;

        for(int a : set){
            count++;
        }

        System.out.println(count);

        for(int a : set){
            System.out.println(a);
        }
        sc.close();
    }
}