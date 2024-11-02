/*
public class recursiontwo {
    public static int power(int x, int n){
         if(n == 0) {
        return 1;
    }
                                                                                                                                                                                                              
    // int xnm1 = power(x, n-1);
    // int xn = x * xnm1;
    //return xn;

    return x * power(x, n-1);
}
public static void main(String args[]) {
    System.out.println(power(2, 10));
}
}*/

// tiling approach
/* public class recursiontwo {
    public static int tilingproblems (int n) {

        //base case

        if(n == 0 || n == 1) {
            return 1;
        }
         //kam
        //vertial choice
        int fnm1 = tilingproblems(n-1);

// horizontal choice
        int fnm2  = tilingproblems(n-2);

        int totways = fnm1 + fnm2;
        return totways;
        
    }
    public static void main(String args[]) {
        System.out.println(tilingproblems(3));
    }

*/

// question duplicates in a string

/* public class recursiontwo {
    public static void removeduplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //kama
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            //duplicate
            removeduplicates(str, idx+1, newStr, map);

        } else {
            map[currChar-'a'] = true;
            removeduplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        String str = "appnnacollege";
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }

}*/

/* public class recursiontwo {
    public static int friendspairing(int n ){
     if(n == 1 || n ==2){
            return n;
    }

        //choice
        //single
        int fnm1 = friendspairing(n-1);
        //pair
        int fnm2 = friendspairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totWays
        int totWays = fnm1 + pairWays;
        return totWays;

    }

    public static void main(String args[]){
        System.out.println(friendspairing(3)) ;
    }
}
*/
public class recursiontwo {
    public static void printbinstrings(int n, int lastplace, String str){
        //base case
        if(n == 0) {
            System.out.println(str);
            return;
        }

        //kaam
        printbinstrings(n-1, 0, str+"0");
        if(lastplace == 0) {
            printbinstrings(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        printbinstrings(3, 0, "");
    }
    
        }

    