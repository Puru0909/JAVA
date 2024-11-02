import java.util.*;

public class hashmapoperation {
    public static void main(String args[]) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //insert
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);

        System.out.println(hm);

        //get
        int population = hm.get("india");
        System.out.println(population);

        //contains key
        System.out.println(hm.containsKey("india"));

        //remove 
        System.out.println(hm.remove("china"));
         System.out.println(hm);

         //size
          System.out.println(hm.size());

          //is emptyt
          hm.clear();  
          System.out.println(hm.isEmpty());

    }
}