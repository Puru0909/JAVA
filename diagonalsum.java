public class diagonalsum {
   // public static int diagonalsum(int matrix[][]) {
       // int sum = 0;
// brute force

     //   for(int i=0; i<matrix.length; i++) {
       //     for(int j=0; j<matrix[0].length; j++) {
         //       if(i == j) {
           //         sum += matrix[i][j];
             //   } else if(i+j == matrix.length-1) {
               //     sum += matrix[i][j];
                //}
            //}
        // }


        //different from brute force//


       // for(int i=0; i<matrix.length; i++) {
         //    // pd
           //  sum += matrix[i][i];
             //sd
             // if(i != matrix.length-1-i)
           //  sum += matrix[i][matrix.length-i-1];
        // }\

        // return sum;

        public static boolean staircasesearch(int matrix[][], int key) {
            int row = 0, col = matrix[0].length-1;

            while(row < matrix.length && col >= 0) {
                if(matrix[row][col] == key) {
                 System.out.println("found key at (" + row + "," + col +")");
                 return true;

                }
                else if(key < matrix[row][col]) {
                    col--;
                }
                else {
                    row++;
                }
            }
        
            System.out.println("key not found!");
            return false;
        }

      
    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 48}};
                         int key = 33;
                         staircasesearch(matrix, key);

    }
}
