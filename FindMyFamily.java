public class FindMyFamily{
    public static void main(String[] args){

        //monotonic stack skeleton

        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && val >= stack.peek()){
                stack.pop();
            }

            if(stack.isEmpty()) ans = -1;
            else{
                ans = stack.peek();
            }

            stack.push(current);
        }
    }
}