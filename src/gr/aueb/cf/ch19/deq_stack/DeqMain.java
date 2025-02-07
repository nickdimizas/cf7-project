package gr.aueb.cf.ch19.deq_stack;

public class DeqMain {

    public static void main(String[] args) {
        MyQueue<Integer> intStack = new MyQueue<>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);

        int topVal = intStack.pop();
        System.out.println(topVal);
        System.out.println();

        intStack.forEach(System.out::println);
    }
}