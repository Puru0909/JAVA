import java.util.*; 
/* public class questionsarray {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        //brute force
        for(int i=0; i<height.size(); i++) {
        for(int j=i+1; j<height.size(); j++) {
            int ht = Math.min(height.get(i), height.get(j));
            int width = j-1;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
        }
        }
        return maxWater;
 }    
 public static void main(String args[]) {
    ArrayList<Integer> height = new ArrayList<>();
    //1, 8, 6, 2, 5, 4, 8, 3, 7
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5); 
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
    System.out.println(storeWater(height));
 } 
}*/
/* public class questionsarray {
    public static int storeWater(ArrayList<Integer> height) {
    int maxWater = 0;
    int lp = 0;
    int rp = height.size()-1;
    while(lp < rp) {
        //calculator water area
        int ht = Math.min(height.get(lp), height.get(rp));
        int width = rp -lp;
        int currWater = ht * width;
        maxWater = Math.max(maxWater, currWater);

        //update ptr
        if(height.get(lp) < height.get(rp)) {
            lp++;
        } else {
            rp--;
        }
    }
       return maxWater;

}
 public static void main(String args[]) {
    ArrayList<Integer> height = new ArrayList<>();
    //1, 8, 6, 2, 5, 4, 8, 3, 7
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5); 
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
    System.out.println(storeWater(height));
 } 
}*/

// pair sum 1  
 /* public class questionsarray {
    public static boolean pairSum(ArrayList<Integer> list, int target)  {
        for(int i=0; i<list.size(); i++) {
          for(int j=i+1; j<list.size(); j++) {
            if(list.get(i) + list.get(j) == target) {
                return true;
            }
        }
    }  

    return false;
}

   public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
// 1, 2, 3, 4, 5, 6
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);
int target = 5; 
System.out.println(pairSum(list,target));

}
}*/

// two pointer approach
 /* public class questionsarray {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()-1;
        while(lp != rp) {
            //case 1
            if(list.get(lp)+list.get(rp) == target) {
                return true;
            }

            //case 2
            if(list.get(lp)+list.get(rp) < target) {
                lp++;
            } else {
                //case 3
                rp--;
            }
        } 
        return false;
    }


    public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
// 1, 2, 3, 4, 5, 6
list.add(1);
list.add(2);
list.add(3);
list.add(4);      
list.add(5);
list.add(6);
int target = 50; 
System.out.println(pairSum(list,target));

}
}
*/


// pair sum 2
public class questionsarray {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }  
        int lp = bp+1; //smallest 
        int rp = bp;  // largest
        while(lp != rp) {
            //case 1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }  // case 2
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            } else {
                // case 3
                rp = (n+rp-1) % n;
            }
        }  
        return false;
    } 
    public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
// 1, 2, 3, 4, 5, 6
list.add(11);
list.add(15);
list.add(6);
list.add(8);      
list.add(9);
list.add(10);
int target = 16;
System.out.println(pairSum(list, 16));

    }
}











