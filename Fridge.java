import java.util.*;

public class Fridge{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();

        String input = sc.nextLine();

        char[] in = input.toCharArray();

        for(int i = 0; i < in.length; i++){

            int val = in[i] - '0';
            System.out.print(val + " ");

            if(map.containsKey(val)){

                int num = map.get(val);
                num++;
                map.put(val, num);
            }
            else{

                map.put(val, 1);
            }
        }

        for(int id : map.keySet()){
            System.out.println(id);
        }
    }
}