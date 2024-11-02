public class inheritance {
   /* public static void main(String args[]) {
    Fish shark = new Fish();
     shark.eat();
    }
}

//base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
//derived class
class Fish extends Animal  {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
} */

// multilevel inheritance
   /* public static void main(String args[]) {
    Dog dobby = new Dog();
    dobby.eat();
    dobby.legs = 4;
    System.out.println(dobby.legs);
    }
}

//base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
class Mammal extends Animal {
    int legs;

}
class Dog extends Mammal {
    String breed;
}


//derived class
/* class Fish extends Animal  {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
} */

//hierachichal inheritance

public static void main(String args[]) {
    Dog dobby = new Dog();
    dobby.eat();
    dobby.legs = 4;
    System.out.println(dobby.legs);
    }
}

//base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
class Mammal extends Animal {
    void walk() {
   System.out.println("walk");

}
}
class Fish extends Mammal {
    void swim() {
     System.out.println("swim");
}
}
class Bird  extends Mammal {
    void fly() {
     System.out.println("fly");
}
}
