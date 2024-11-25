// Interface 1: Provides behavior for swimming
interface Swimmable {
    void swim();
}

// Interface 2: Provides behavior for flying
interface Flyable {
    void fly();
}

// Class 1: Implements both Swimmable and Flyable
class Duck implements Swimmable, Flyable {
    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }
}

// Class 2: Inheriting from another class and implementing interfaces
class Penguin implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Penguin can swim, but cannot fly");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Penguin penguin = new Penguin();
        
        // Duck can both swim and fly
        duck.swim();   // Output: Duck can swim
        duck.fly();    // Output: Duck can fly

        // Penguin can only swim
        penguin.swim(); // Output: Penguin can swim, but cannot fly
    }
}
