/*public class sorting {
    public static void bubblesort(int arr[]) {

        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        bubblesort(arr);
        printArr(arr);
    }
}
*/

/* public class sorting {
    public static void bubblesort(int arr[]) {

        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

public static void selectionsort(int arr[]) {
    for(int i=0; i<arr.length-1; i++) {
        int minPos = i;
        for(int j=i+1; j<arr.length; j++) {
            if(arr[minPos] > arr[j]) {
                minPos = j;
            }
        } //swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
}
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        selectionsort(arr);
        printArr(arr);
    }
}
*/
 /*import java.util. *;
public class sorting {
    public static void bubblesort(int arr[]) {

        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

public static void selectionsort(int arr[]) {
    for(int i=0; i<arr.length-1; i++) {
        int minPos = i;
        for(int j=i+1; j<arr.length; j++) {
            if(arr[minPos] > arr[j]) {
                minPos = j;
            }
        } //swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
}

public static void insertionsort (int arr[]){
    for(int i=1; i<arr.length; i++) {
        int curr = arr[i];
        int prev = i-1;
        //finding out the correct position
        while(prev >= 0 && arr[prev] > curr) {
            arr[prev+1] = arr[prev];
            prev--;
        }//insertion
        arr[prev+1] = curr;
    }

}
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionsort(arr);
        printArr(arr);
    }
}*/

 /*public class sorting {
    public static void bubblesort(int arr[]) {

        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

public static void selectionsort(int arr[]) {
    for(int i=0; i<arr.length-1; i++) {
        int minPos = i;
        for(int j=i+1; j<arr.length; j++) {
            if(arr[minPos] > arr[j]) {
                minPos = j;
            }
        } //swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
}
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        selectionsort(arr);
        printArr(arr);
    }
}
*/
public class sorting {
    public static void bubblesort(int arr[]) {

        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

public static void selectionsort(int arr[]) {
    for(int i=0; i<arr.length-1; i++) {
        int minPos = i;
        for(int j=i+1; j<arr.length; j++) {
            if(arr[minPos] > arr[j]) {
                minPos = j;
            }
        } //swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
}

public static void insertionsort (int arr[]){
    for(int i=1; i<arr.length; i++) {
        int curr = arr[i];
        int prev = i-1;
        //finding out the correct position
        while(prev >= 0 && arr[prev] > curr) {
            arr[prev+1] = arr[prev];
            prev--;
        }//insertion
        arr[prev+1] = curr;
    }

}

 public static void  countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
 }
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        countingsort(arr);
        printArr(arr);
    }
}






  