import java.util.List;
import java.util.ArrayList;

public class ListExample
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Apple");

        System.out.println("First fruit: "+fruits.get(0));

        System.out.println("fruits list: "+fruits);

        fruits.remove("Banana");

        System.out.println("After removing :"+fruits.size());
    }
    
}                                                                                                                              