/* public class superkey {
    public static void main (String args[]){
        Horse h = new Horse();
        System.out.println(h.color);
    

    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
         
    }
}
class Horse extends Animal {

    Horse() {
        super.color = "brown";
        
        System.out.println("animal constructor is called");
    }
}*/

public class superkey {
    public static void main (String args[]){
        Horse h = new Horse(); 
    

    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
         
    }
}
class Horse extends Animal {

    Horse() {
        super();
        
        System.out.println("animal constructor is called");
    }
}