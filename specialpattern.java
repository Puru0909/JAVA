public class specialpattern{
    public static void pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i;  j++) {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++) {
        System.out.print(i + " ");
    }

    System.out.println();

        }
    }
public static void main(String args[]){
    pyramid(4);
}

}


