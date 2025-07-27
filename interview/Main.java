package interview;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // i will use stack to reverse this
        // first i will split the string in array
        String input = "Java is simple";

        String [] arr = input.split("");
        int left = 0;
        int right = arr.length-1;

        Stack<String> stk = new Stack<>();

        for(String str : arr){
            stk.push(str);
        }
        StringBuilder result = new StringBuilder();


//        System.out.println(Arrays.toString(arr));

    }
}











//        String str ="abcdsaaa";
//        str.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().stream()
//                .filter(e->e.getValue()>1)
//                .forEach(e-> System.out.println(e.getKey() + " "+ e.getValue()));
//
//        int[] nums = {2, 7, 11, 15};  //input is 1 2  x+y = z
//        // x = z-y;
//        //z-y hash  z-y along this index
//        // map = {(2,0),(7,1)} 18-11 = 7 ) t.c O(N) and s.c O(N);
//        // index, 18-11
//        int target = 18;



//    }
//}
