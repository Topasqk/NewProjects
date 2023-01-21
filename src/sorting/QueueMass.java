package sorting;

import java.util.ArrayDeque;
import java.util.Scanner;

public class QueueMass {
    public static void main(String[] args) {
        ArrayDeque<Integer> que1 = new ArrayDeque<>();
        ArrayDeque<Integer> que2 = new ArrayDeque<>();
        System.out.println("Введите сколько элементво добавить в очередь:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Введите число :");
            Scanner scan1 = new Scanner(System.in);
            int num1 = scan1.nextInt();
            que1.add(num1);
            System.out.println("Очередь : " + que1);
        }
        System.out.println("Размерность очереди:" + que1.size() + " элементов");
        int y = que1.size();
        for (int i = 0; i < y; i++) {
            System.out.println("Достали из очереди:" + que1.peek());
            que2.add(que1.poll());
        }
        System.out.println("Очередь : " + que2);
        System.out.println("Введите число для удаления:");
        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();
        y = que2.size();
        for (int i = 0; i < y; i++) {
            if (num2 == que2.peek()) {
                que2.poll();
            } else que1.add(que2.poll());
        }
        System.out.println("Очередь : " + que1);
        System.out.println("Введите число для поиска:");
        Scanner scan3 = new Scanner(System.in);
        int num3 = scan3.nextInt();
        y = que1.size();
        for (int i = 0; i < y; i++) {
            if (num3 == que1.peek()) {
                System.out.println("Число найденно:" + que1.peek());
                que2.add(que1.poll());
            } else
                que2.add(que1.poll());
        }
        System.out.println("Очередь : " + que2);
        y = que2.size();
        for (int i = 0; i < y; i++) {
            System.out.println("Удаление из череди:" + que2.poll());
        }
        System.out.println("Очередь:" + que2);
    }
}
