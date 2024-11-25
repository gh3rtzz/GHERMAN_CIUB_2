package lecture_nr_8;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueMain {

    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();

        //FIFO Stack
        queue1.add("first");
        queue1.add("second");

        System.out.println(queue1);

        //GET FIFO ELEMENT
        System.out.println(queue1.poll());
        System.out.println(queue1);

        queue1.add("fourth");
        queue1.add("fifth");
        queue1.add("sixth");

        System.out.println(queue1);
        System.out.println(queue1.poll());
        System.out.println(queue1);
        System.out.println(queue1.peek());
        System.out.println(queue1);

        System.out.println("-------------------");

        //GET LIFO
        Stack<String> stackCollection = new Stack<>();

        stackCollection.push("first");
        stackCollection.push("second");
        stackCollection.push("third");
        stackCollection.push("fourth");

        System.out.println(stackCollection);
        System.out.println(stackCollection.pop());
        System.out.println(stackCollection);

        System.out.println(stackCollection.peek());
        System.out.println(stackCollection);
    }
}
