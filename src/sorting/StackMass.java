package sorting;

import java.lang.invoke.SwitchPoint;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class StackMass {
    static void showpush1(Stack stck) {
        System.out.println("Введите сколько элементво добавить в стек:");
        Scanner scan1 = new Scanner(System.in);
        int num1 = scan1.nextInt();
        for(int i=0; i<num1; i++) {
            System.out.println("Введите число :");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            stck.push(num);
            System.out.println("Положили(" + num + ")");
            System.out.println("Стек: " + stck);
        }
    }
    static void showpush2(Stack stck) {
            System.out.println("Введите число :");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            stck.push(num);
            System.out.println("Положили(" + num + ")");
            System.out.println("Стек: " + stck);
    }
    static void showpop(Stack stck) {
        for(int i=0; i<stck.size(); i++) {
            System.out.print("Достали -> ");
            Integer a = (Integer) stck.pop();
            System.out.println(a);
            System.out.println("Стек: " + stck);
        }
    }
    static void showsize(Stack stck) {
        System.out.println("Размер стека: " + stck.size());
    }
    static void showsearch(Stack stck) {
        System.out.println("Введите элемент для поиска:");
        Scanner scan = new Scanner(System.in);
        int srch = scan.nextInt();
        System.out.println("Значение поиска: " + stck.search(srch));
    }
    static void showsclear(Stack stck) {
        stck.clear();
        System.out.println("Стек пуст: " + stck);
    }
    static void showremove(Stack stck) {
        System.out.println("Введите элемент для удаления:");
        Scanner scan = new Scanner(System.in);
        int rmv = scan.nextInt();
        System.out.println("Удаление элемента: " + stck.removeAll(Collections.singleton(rmv)));
        System.out.println("Стек: " + stck);
    }
    public static void main(String[] args) {
        Stack stck = new Stack();
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1.Внести в стек несколько значений.");
            System.out.println("2.Объём стека.");
            System.out.println("3.Поиск элемента в стеке.");
            System.out.println("4.Удалить элемент из стека.");
            System.out.println("5.Очистить стек.");
            System.out.println("6.Добавить элемент в стек.");
            System.out.println("7.Достать элементы из стека.");
            System.out.println("0.Выход.");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num==0) {
                switch (num) {

                    case 1: {
                        showpush1(stck);
                        break;
                    }
                    case 2: {
                        showsize(stck);
                        break;
                    }
                    case 3: {
                        showsearch(stck);
                        break;
                    }
                    case 4: {
                        showremove(stck);
                        break;
                    }
                    case 5: {
                        showsclear(stck);
                        break;
                    }
                    case 6: {
                        showpush2(stck);
                        break;
                    }
                    case 7: {
                        showpop(stck);
                        break;
                    }
                    case 0: {
                       return;
                    }
                }
            } else
                System.out.println("Не правильно выбрано значение");
        }
    }
}

