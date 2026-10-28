import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FinancialPlanning{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        long target;
        long[] profit;
        long[] cost;

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        target = Long.parseLong(st.nextToken());

        profit = new long[n];
        cost = new long[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            profit[i] = Long.parseLong(st.nextToken());
            cost[i] = Long.parseLong(st.nextToken());


            System.out.println("profit: " + profit[i] + " cost: " + cost[i]);
        }

        int low = 1;
        int high = Integer.MAX_VALUE;
        while(low < high){
            int mid = (high + low) / 2;
            //if what
            if(){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }

    }
}