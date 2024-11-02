/* public class Abstractto {
    public static void main(String args[]) {
     Horse h = new Horse();
     h.eat();
     h.walk();
     System.out.println(h.color);
     // Chicken c = new Chicken();
     // c.eat();
     // c.walk();
    }
}
abstract class Animal  {
  String color;

  //constructor
  Animal() {
    color = "bown";
  }
    void eat() {
        System.out.println("animal eats");

    } 
    abstract void walk();
}
 class Horse extends Animal {
  void changeColor() {
    color = "dark brown";
  }

    void walk() {
    System.out.println("walk on four legs");
    }
 }    
  class Chicken extends Animal {

    void changeColor() {
      color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 2 legs"); 
    }
  }

*/
  public class Abstractto {
    public static void main(String args[]) {
      Mustang myHorse = new Mustang();
    // Horse h = new Horse();
     // h.eat();
     // h.walk();
     // System.out.println(h.color);
     // Chicken c = new Chicken();
     // c.eat();
     // c.walk();
    }
}
abstract class Animal  {
  String color;

  //constructor
  Animal() {
    System.out.println("animal eats");
  }
    void eat() {
        System.out.println("animal eats");

    } 
    abstract void walk();
}
 class Horse extends Animal {
  Horse(){
 System.out.println("animal eats");
  }
  void changeColor() {
    color = "dark";
  }

    void walk() {
    System.out.println("walk on four legs");
    }
 }    
  class Mustang extends Horse {
   Mustang() {
    System.out.println("mustange constructor called id");
   }
  }
  