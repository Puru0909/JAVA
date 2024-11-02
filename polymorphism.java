//method overloding
/*public class polymorphism {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)1, (float)2));
        System.out.println(calc.sum(1, 2, 3));
    }
     
}

class Calculator {
    int sum(int a, int b) {
        return a +b;

    }
    float sum(float a, float b) {
        return a +b;

    }
    int sum(int a, int b, int c) {
        return a + b +c;

    }

}
*/
//method overriding  
 
 public class polymorphism {
    public static void main(String args[]) {
        Deer d = new Deer();
        d.eat();
    }
 }
 class Animal {
    void eat() {
        System.out.println("eats anything");
    }
 }
 class Deer extends Animal {
    void eat() {
         System.out.println("eats grass");

    }
 }