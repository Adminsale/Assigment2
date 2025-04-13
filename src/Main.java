public class Main {
    public static void main(String[] args) {
        testMyArrayList();
        testMyLinkedList();
        testMyStack();
        testMyQueue();
        testMyMinHeap();
    }

    public static void testMyArrayList() {
        System.out.println("===== MyArrayList Test =====");
        MyList<String> list = new MyArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "X"); // A, X, B, C
        list.set(0, "Z"); // Z, X, B, C

        System.out.println("Current list after adding and setting elements:");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("\nSize of list: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));
        list.remove(1);
        System.out.println("List after removing element at index 1:");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
    }

    public static void testMyLinkedList() {
        System.out.println("===== MyLinkedList Test =====");
        MyList<Integer> list = new MyLinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.add(1, 15);

        System.out.println("Current list:");
        for (Integer i : list) {
            System.out.print(i + " ");
        }

        list.removeFirst();
        list.removeLast();
        System.out.println("\nList after removing first and last:");
        for (Integer i : list) {
            System.out.print(i + " ");
        }

        System.out.println("\nFirst element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println();
    }

    public static void testMyStack() {
        System.out.println("===== MyStack Test =====");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack after pushing 1, 2, 3:");
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Pop top element: " + stack.pop());
        stack.push(4);
        System.out.println("Stack after pushing 4:");

        System.out.print("Popping all elements: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\n");
    }

    public static void testMyQueue() {
        System.out.println("===== MyQueue Test =====");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");

        System.out.println("Queue front (peek): " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        queue.enqueue("Fourth");
        System.out.print("Remaining queue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println("\n");
    }

    public static void testMyMinHeap() {
        System.out.println("===== MyMinHeap Test =====");
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);

        System.out.println("Minimum element: " + heap.peekMin());
        System.out.println("Removing min: " + heap.removeMin());
        System.out.println("New min after removal: " + heap.peekMin());

        System.out.print("Remaining elements (in order of removal): ");
        while (!heap.isEmpty()) {
            System.out.print(heap.removeMin() + " ");
        }
        System.out.println("\n");
    }
}  
