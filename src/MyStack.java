
public class MyStack <T extends Comparable<T>> {

    private final MyArrayList<T> list = new MyArrayList<>();
    // Adds an item to the top of the stack
    public void push(T item) {
        list.addLast(item);
    }
    // Removes and returns the top item of the stack
    public T pop() {
        T item = list.getLast();
        list.removeLast();
        return item;
    }
    // Returns the top item without removing it
    public T peek() {
        return list.getLast();
    }
    // Returns true if the stack is empty
    public boolean isEmpty() {
        return list.size() == 0;
    }
    public int size() {
        return list.size();
    }
}