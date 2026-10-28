import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FinancialPlanning{

    static int n;
    static long target;
    static long[] profit;
    static long[] cost;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        target = Long.parseLong(st.nextToken());

        profit = new long[n];
        cost = new long[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            profit[i] = Long.parseLong(st.nextToken());
            cost[i] = Long.parseLong(st.nextToken());


            //System.out.println("profit: " + profit[i] + " cost: " + cost[i]);
        }

        long low = 1;
        long high = 2_000_000_000;
        while(low < high){
            long mid = (high + low) / 2;
            //if
            if(isHighEnough(mid)) high = mid;
            else{
                low = mid + 1;
            }
        }

        System.out.println(low);

    }

    static boolean isHighEnough(long days){
        long total = 0;
        for(int i = 0; i < n; i++){
            long gain = profit[i] * days - cost[i];
            if(gain > 0){
                total += gain;
                if(total >= target) return true;
            }
        }
        return false;
    }
}