import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.naturalOrder());
        for (Integer number : numberList) {
            if (number > 0 && number % 2 == 0) {
                priorityQueue.offer(number);
            }
        }
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}