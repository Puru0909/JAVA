import java.util.*;

/* public class squestions {
    public static void main(String args[]) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--) {
           //whilewhile

           while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
            s.pop();
        }
        // if else
        if(s.isEmpty()) {
            nxtGreater[i] = -1;
        }else {   
            nxtGreater[i] = arr[s.peek()];
        }

        //3 push in s
        s.push(i);
        }
        for(int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}*/
import java.util.Stack;

public class squestions {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        //next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                //-1
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //next smaller left
        s = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                //-1
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area width = j-i-1 = nsr - nsl -1
        for(int i=0; i<arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("max area is = " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3}; //heights in histogram
        maxArea(arr);
       /* // valid string
        String str = "((a+b))";
        String str2 = "(a-b)";
        // String str = "({})[]";
        System.out.println(isDuplicate(str)); // Should return true for "((a+b))"
        System.out.println(isDuplicate(str2)); // Should return false for "(a-b)"
        System.out.println(isValid("({})[]")); // Should return true for balanced parentheses
        System.out.println(isValid("(a+b]")); // Should return false for unbalanced parentheses*/
    }
}
