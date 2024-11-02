//decrease order
/* public class recursion {
    public static void printDec(int n ) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }
    public static void main(String args[]) {
        int n = 10;
        printDec(n);
    }

}*/

//increase order 
 /*
 public class recursion {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.println(n);
            return;

        }
        System.out.println(n+" ");
        printDec(n-1);

    }
    public static void printInc(int n){
    if(n == 1) {
        System.out.print(n+" ");
        return;
    }
    printInc(n-1);  v
    System.out.print(n+" ");
 }
 
 public static void main(String args[]) {
    int n = 10;
    printInc(n);
 }
 } */ 

 //factorial
 /* public class recursion {
    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;

    }
    public static void main(String args[]) {
        int n = 5;
        System.out.print(fact(n));
    }
 }
*/

// sum of first n natural numbers
/* public class recursion {
    public static int fact(int n) {
        if(n == 1) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n + fact(n-1);
        return fn;

    }
    public static void main(String args[]) {
        int n = 5;
        System.out.print(fact(n));
    }
 }

*/    

//finobacci number

 /* public class recursion {
    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;

    }
    public static void main(String args[]) {
        int n = 5;
        System.out.print(fib(n));
    }
 }
*/
//array sorted or not
/* public class recursion {
    public static boolean issorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return issorted(arr, i+1);
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        System.out.print(issorted(arr, 0));
    }
 }
*/

//find first occurence of an element in an array


/*
public class recursion {
    public static int firstoccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
       if(arr[i] == key) {
        return i;
       }
       return firstoccurence(arr, key, i+1);
    }
    public static void main(String args[]) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.print(firstoccurence(arr, 5, 0));
    }
 }

*/

// last occurence findthe elment with big index
public class recursion {
    public static int lastoccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isfound = lastoccurence(arr, key, i+1);
        if(isfound != -1){
            return isfound;
        }

        // check with self
       if(arr[i] == key) {
        return i;
       }
       return isfound;
    }
    public static void main(String args[]) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.print(lastoccurence(arr, 5, 0));
     }
 }

