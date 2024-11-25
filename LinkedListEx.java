import java.util.LinkedList;

public class LinkedList {
    private LinkedList<Object> list;

    public CustomLinkedList() {
        list = new LinkedList<>();
    }

    // Method to add an element at the beginning of the list
    public void addFirst(Object o) {
        list.addFirst(o);
    }

    // Method to add an element at the end of the list
    public void addLast(Object o) {
        list.addLast(o);
    }

    // Method to get the first element of the list
    public Object getFirst() {
        if (!list.isEmpty()) {
            return list.getFirst();
        }
        return null; // return null if the list is empty
    }

    // Method to get the last element of the list
    public Object getLast() {
        if (!list.isEmpty()) {
            return list.getLast();
        }
        return null; // return null if the list is empty
    }

    // Method to remove the first element of the list
    public Object removeFirst() {
        if (!list.isEmpty()) {
            return list.removeFirst();
        }
        return null; // return null if the list is empty
    }

    // Method to remove the last element of the list
    public Object removeLast() {
        if (!list.isEmpty()) {
            return list.removeLast();
        }
        return null; // return null if the list is empty
    }

    // Main method to test the CustomLinkedList
    public static void main(String[] args) {
        CustomLinkedList customList = new CustomLinkedList();

        // Add elements
        customList.addFirst("First Element");
        customList.addLast("Last Element");
        customList.addFirst("New First Element");
        
        // Get elements
        System.out.println("First Element: " + customList.getFirst()); // Output: New First Element
        System.out.println("Last Element: " + customList.getLast()); // Output: Last Element

        // Remove elements
        System.out.println("Removed First Element: " + customList.removeFirst()); // Output: New First Element
        System.out.println("Removed Last Element: " + customList.removeLast()); // Output: Last Element

        // Check if list is empty after removal
        System.out.println("First Element after removal: " + customList.getFirst()); // Output: First Element
    }
}
