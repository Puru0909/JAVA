public class character {
    public static void main(String args[]) {
    int n = 26;
    char ch = 'A';
        for(int line=1; line<=n; line++) {
            for(int chars=1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
} 
 