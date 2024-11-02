import java.util.*;
public class linkedhashset {

    public static void main(String args[]) {
   HashSet<String> cities = new HashSet<>();

   cities.add("delhi");
   cities.add("mumbai");
   cities.add("noida");
   cities.add("bangaluru"); 
   System.out.println(cities);

   LinkedHashSet<String> lhs = new LinkedHashSet<>();

   lhs.add("delhi");
   lhs.add("mumbai");
   lhs.add("noida");
   lhs.add("bangaluru"); 
   System.out.println(lhs);

   lhs.remove("delhi");
   System.out.println(lhs);

   TreeSet<String> ts = new TreeSet<>();
   ts.add("delhi");
   ts.add("mumbai");
   ts.add("noida");
   ts.add("bangaluru"); 
   System.out.println(ts);

  
    
 }
}