package basic_algo;

/**
 * Created by bandypiy on 2/28/2017.
 */
public class Reverse {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        int[] stackList = {1,5,8,47,12,34,13,16,20,80,26,50,30,40};

       // while (!stack.isEmpty()) {
            for (int i=0; i<stackList.length; i++ )
                stack.push(Integer.valueOf(stackList[i]));
       // }

        for (int i : stack) {
            System.out.println(i);
        }
    }
}
