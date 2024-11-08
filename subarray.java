import java.util.*;
/*public class subarray {
public static void printSubarrays(int numbers[]) {
    int tp = 0;
    int ta = 0;
    for(int i=0; i<numbers.length; i++) {
        int start = i;
        for(int j=i; j<numbers.length; j++) {
            int end = j;
        for(int k=start; k<=end; k++) { //print
            System.out.print(numbers[k]+" "); //subarray
        }
        tp++;
        ta++;
        System.out.println();
        }
        System.out.println();
    }
    System.out.println("total subpairs = " + tp);
    System.out.println("total addition = " + ta);
}

public static void main(String args[]) {
    int numbers[] = {2, 4, 6, 8, 10};
    printSubarrays(numbers);
}
}
*/

/*public class subarray {

    //brute force
public static void maxSubarraySum(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];
    for(int i=0; i<numbers.length; i++) {
        int start = i;
        for(int j=i; j<numbers.length; j++) {
            int end = j;
        for(int k=start; k<=end; k++) { //print
            currSum += numbers[k]; //subarray
        }
        System.out.println(currSum);
        if(maxSum < currSum) {
            maxSum = currSum;
        }
    }
    }
    System.out.println("max sum = " + maxSum);
    
}

public static void main(String args[]) {
    int numbers[] = {2, 4, 6, 8, 10};
     maxSubarraySum(numbers);
}
}
*/

//prefix method

/*public class subarray {

    //brute force
public static void maxSubarraySum(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];
    prefix[0] = numbers[0];
    for(int i=1; i<prefix.length; i++) {
        prefix[i] = prefix[i-1] + numbers[i];
    }
        for(int i=0; i<numbers.length; i++) {
            int start = i;
        for(int j=i; j<numbers.length; j++) { //print
            int end = j;
            
        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1]; //subarray
        if(maxSum < currSum) {
            maxSum = currSum;
        }
    }
    }
    System.out.println("max sum = " + maxSum);
    
}

public static void main(String args[]) {
    int numbers[] = {2, 4, 6, 8, 10};
     maxSubarraySum(numbers);
}
}*/

public class subarray {

    //brute force
public static void maxSubarraySum(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];
    prefix[0] = numbers[0];
    for(int i=1; i<prefix.length; i++) {
        prefix[i] = prefix[i-1] + numbers[i];
    }
        for(int i=0; i<numbers.length; i++) {
            int start = i;
        for(int j=i; j<numbers.length; j++) { //print
            int end = j;
            
        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1]; //subarray
        if(maxSum < currSum) {
            maxSum = currSum;
        }
    }
    }
    System.out.println("max sum = " + maxSum);
    
}
public static void kadanes(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for(int i=0; i<numbers.length; i++) {
        cs = cs + numbers[i];
        if(cs < 0) {
            cs = 0;
        }
        ms = Math.max(cs, ms);
    }
    System.out.println("our max subarray sum is : " + ms);
}


public static void main(String args[]) {
    int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
     kadanes(numbers);
}

}






 
            
    