import java.util.*;
/* public class operations {
    public static int setbit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String args[]) {
        System.out.println(setbit(10, 2));
    }
}*/
//getbit
/*public class operations {
    public static int getbit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        }else {
            return 1;
        }
    }

    public static void main(String args[]) {

        System.out.println(getbit(10, 2));
    }
}*/

public class operations {
    public static int clearbit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask; 
    
    }

    //update bit
    public  static int updatebit(int n, int i, int newBit) {
//if(newBit == 0)  {
    //return clearbit(n, i);
   // } else {
    // return setbit(n, i);
    // }
    n = clearbit(n, i);
    int BitMask = newBit<<i;
    return n | BitMask;
   }

   public static int clearithbit(int n, int i) {
    int bitMask = (~0)<<i;
    return n & bitMask;
   }
    public static int clearithbits(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
public static boolean ispoweroftwo(int n) {
    return (n&(n-1)) == 0;
}

public static int countsetbit(int n) {
    int count = 0;
    while(n > 0) {
        if((n & 1) != 0) {
            count++;
              }
        n = n>>1;
    } 
    return count;

}
public static int fastexpo (int a, int n) {
    int ans = 1;
    while(n > 0) {
        if((n & 1) != 0) {
            ans = ans * a;
        }

           a = a * a;
           n = n>>1;
        }
        return ans;
    }


    public static void main(String args[]) {
        System.out.println(fastexpo(3, 5));

         
    }
} 