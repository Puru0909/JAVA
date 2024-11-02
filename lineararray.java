import java.util.*;
/* public class lineararray {
    public static int linearSearch(int numbers[], int key) {

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
            return i;
        }

    }
    return -1;
}

public static void main(String args[]) {
    int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
    int key = 10;

    int index = linearSearch(numbers, key);
    if(index == -1) {
        System.out.println("Not found");
    } else {
        System.out.println("key is at index : " + index);
    }
}
}
*/

public class lineararray {
    public static int getlargest(int numbers[]) {
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for(int i=0; i<numbers.length; i++) {
        if(largest < numbers[i]) {
            largest = numbers[i];
        }
        if(smallest > numbers[i]) {
            smallest = numbers[i];
        }
    }
    System.out.println("smallest is = " + smallest);
    return largest;

}
public static void main(String argd[]) {
    int numbers[] = {1, 2, 3, 4, 5, 6};
    System.out.println("largest value = " +getlargest(numbers));
}
}