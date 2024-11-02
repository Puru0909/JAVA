
import java.util.*;
/* public class bitmanipulation {
    public static void main(String args[]) {
        System.out.println((5 & 6));
    }
}*/

/*public class bitmanipulation {
    public static void main(String args[]) {
        System.out.println((5 | 6));
    }
}*/

/*public class bitmanipulation {
    public static void main(String args[]) {
        System.out.println((5 ^ 6));
    }
}*/

/* public class bitmanipulation {
    public static void main(String args[]) {
        System.out.println((~0));
    }
}*/

/*public class bitmanipulation {
    public static void main(String args[]) {
        System.out.println((5 << 6));
    }
}*/

/*public class bitmanipulation {
    public static void main(String args[]) {
        System.out.println((5 >> 2));
    }
}*/

//check the number is odd or even 

public class bitmanipulation {
    public static void oddoreven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            //even number
            System.out.println("even number");
        }else {
            System.out.println("odd number");

        }
        }

public static void main(String args[]) {
    oddoreven(3);
    oddoreven(11);
    oddoreven(14);
}
        }
    

