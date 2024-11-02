/* public class classroom {
 public static boolean isSafe(char board[][], int row, int col) {
    //vertical up
    for(int i=row-1; i>=0; i--){
        if(board[i][col] == 'Q') {
            return false;
        }
    }
    //left up
    for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
        if(board[i][j] == 'Q') {
            return false;
        }
    }

    //right up
    for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
        if(board[i][j] == 'Q') {
            return false;
        }
    } 
       return true;
 }


    public static void nQueens(char board[][], int row) {
        //base
        if(row == board.length) {
            printBoard(board);
            return;

        }

        //column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
            board[row][j] = 'Q';
            nQueens(board, row+1); //function call
            board[row][j] = '.';  //backtracking step
        }
    }
}

      public static void printBoard(char board[][]) {
         System.out.println("---------chess board -------");

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
      }
      public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];

        //initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0);
      } 


}  
*/
//print one soluttion

/* public class classroom {
 public static boolean isSafe(char board[][], int row, int col) {
    //vertical up
    for(int i=row-1; i>=0; i--){
        if(board[i][col] == 'Q') {
            return false;
        }
    }
    //left up
    for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
        if(board[i][j] == 'Q') {
            return false;
        }
    }

    //right up
    for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
        if(board[i][j] == 'Q') {
            return false;
        }
    } 
       return true;
 }


    public static boolean nQueens(char board[][], int row) {
        //base
        if(row == board.length) {
            // printBoard(board);
            count++;
            return true;

        }

        //column loop
        for(int j=0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
            board[row][j] = 'Q';
            if(nQueens(board, row+1)) {
                return true;
            } //function call
            board[row][j] = '.';  //backtracking step
        }
    }  return false;
}

      public static void printBoard(char board[][]) {
         System.out.println("---------chess board -------");

        for(int i=0; i<board.length; i++) {
   ,         for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
      }
      static int count = 0;   
      public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];

        //initialize
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }

        if(nQueens(board, 0)) {
             System.out.println("solution possible");
             printBoard(board);


        }else {
            System.out.println("solution possible");

        }
      } 


}  */

//grid ways
public class classroom {
    public static int gridways(int i, int j, int n, int m) {
        //base case
        if(i == n-1 && j == m-1) {
            return 1;

        }else if(i == n || j == n) {
            return 0;
        }
        int w1 = gridways(i+1, j, n, m);
        int w2 = gridways(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(gridways(0, 0, n, m));
    }
}