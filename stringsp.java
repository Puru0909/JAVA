/* 
public class stringsp{
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)) {
                //not palindrome
                return false;

            }
        }
        return true;
    }
    public static void main(String args[]){
String str = "racecar";
System.out.println(isPalindrome(str));
    }
    
}*/

//second question on strings
public class stringsp {
    public static float getpath(String path) {
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);

            //south 
            if(dir == 'S') {
                y--;
            }
            //North
            else if(dir == 'N') {
                y++;
            }
            //west
            else if(dir == 'W') {
                x--;
            }
            //EAST
            else {
            x++;
        }

        } int X2 = x*x;
          int Y2 = y*y;
          return (float)Math.sqrt(X2 + Y2);
        
    }
    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println(getpath(path));
    }
}

