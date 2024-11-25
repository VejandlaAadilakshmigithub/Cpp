
    /*// Class Addition demonstrates Method Overloading
class Addition {
   
   // Method to add two integers
   public Addition(int x, int y) {	  
       System.out.println("Sum of two integers is: " + (x + y));
   }
   
   // Method to add three integers
   public Addition(int x, int y, int z) {
       System.out.println("Sum of three integers is: " + (x + y + z));
   }
   
   // Method to add two floats
   public Addition(float x, float y) {	  
       System.out.println("Sum of two floats is: " + (x + y));
   }
}


 public class MethodOverLoading{
   public static void main(String[] args) {
       // Using the constructor that adds two integers
       Addition obj1 = new Addition(2, 3);  
       
       // Using the constructor that adds three integers
       Addition obj2 = new Addition(10, 20, 30);
       
       // Using the constructor that adds two floats (Uncomment to test)
       Addition obj3 = new Addition(2.3f, 7.8f);  // Make sure both numbers are float literals
   }

}*/

 class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }

}

public class MethodOverLoading1 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Calling the overloaded methods
        System.out.println("Sum of two integers: " + calculator.add(10, 20));           // Output: 30
        System.out.println("Sum of three integers: " + calculator.add(10, 20, 30));     // Output: 60
        System.out.println("Sum of two doubles: " + calculator.add(10.5, 20.3));        // Output: 30.8
        System.out.println("Sum of integer and double: " + calculator.add(10, 20.5));   // Output: 30.5
    }
}
