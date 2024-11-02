
import java.util.*;

public class arraylist {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String args[]) {
        //java collection framework
        //classname objectname = new class rooom()

        //syntax
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //add element
        list.add(2);  //0(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
       //  list.add(1, 9);
    
    System.out.println(list);

    // get operation
     int element = list.get(2);
     System.out.println(element);


     // remove elment
     list.remove(2);
     System.out.println(list);

     // set element at index 
     list.set(2,10);
     System.out.println(list);


     //contain element
     System.out.println(list.contains(1));
     System.out.println(list.contains(11));

     // size
     System.out.println(list.size());  
     // print the arraylist
     for(int i=0; i<list.size(); i++) {
        System.out.print(list.get(i) + " ");
     }
     System.out.println();
   //reverse print
   for(int i=list.size()-1; i>=0; i--) {
    System.out.print(list.get(i) + " ");
   } 
    System.out.println();
     
  // find maximum in array list
  int max = Integer.MIN_VALUE;
  for(int i=0; i<list.size(); i++) {
    if(max < list.get(i)) {
        max = list.get(i);
    }
  }
  System.out.println("max element = " + max);

   int idx1 = 1, idx2 = 3;
   System.out.println(list);
   swap(list, idx1, idx2);
   System.out.println(list);

   //sorting 
   System.out.println(list);
   Collections.sort(list); //ascending
   System.out.println(list);

   //descneding 
   
   Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);

}    

  public static void main(String args[]) {
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1); list.add(2);
    mainList.add(list);
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(3); list2.add(4);
    mainList.add(list2);
    for(int i=0; i<mainList.size(); i++) {
        ArrayList<Integer> currList = mainList.get(i);
        for(int j=0; j<currList.size(); j++) {
            System.out.print(currList.get(j)+ " ");
        }
        System.out.println();
    }
  }

}