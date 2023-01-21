package sorting;

import java.lang.invoke.SwitchPoint;
import java.util.*;

public class StackMass {
    static void notshowpush1(ArrayList arr) {
        System.out.println("Введите сколько элементво добавить в массив:");
        Scanner scan1 = new Scanner(System.in);
        int num1 = scan1.nextInt();
        for(int i=0; i<num1; i++) {
            System.out.println("Введите число :");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            arr.add(num);
            System.out.println("Положили(" + num + ")");
        }
    }
    static void notshowget(ArrayList arr){
        System.out.println("Введите индекс элемента :");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Элемент по индексу:" + arr.get(num));
    }
    static void notshowpop(ArrayList arr) {
            System.out.println("Массив: " + arr);
        }

    static void notshowsize(ArrayList arr){
        System.out.println("Размер массива: " + arr.size());
    }
    static void notshowremove(ArrayList arr) {
        System.out.println(arr.toString());
        System.out.println("Введите элемент для удаления :");
        Scanner scan1 = new Scanner(System.in);
        int str = scan1.nextInt();
        int index = arr.indexOf(str);
        if (index!=-1){
        arr.remove(index);
        System.out.println(arr);}
        else
            System.out.println("Даного эелемента нет:");
    }
    static void notshowadd(ArrayList arr) {
        System.out.println("Введите индекс для добавления в массив :");
        Scanner scan1 = new Scanner(System.in);
        int index = scan1.nextInt();
        boolean str =arr.isEmpty();
        if(str!=true && index < arr.size()){
        System.out.println("Введите элемент для добавления в массив :");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
            arr.set(index,num);
            System.out.println(arr);}
            else
                System.out.println("Даного индекса нет:");
    }
    static void notshowsclear(ArrayList arr) {
        arr.clear();
        System.out.println("Массив пуст: " + arr);
    }
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
        List<Integer> arr = new ArrayList<>(1000);
        System.out.println("Выберите работу со стеком или с массивом.");
        System.out.println("1.Стек.");
        System.out.println("2.Массив.");
        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();
        if (num2 == 2) {
            while (true) {
                System.out.println("Выберите операцию:");
                System.out.println("1.Внести в массив несколько значений.");
                System.out.println("2.Вывести массив.");
                System.out.println("3.Размерность массив.");
                System.out.println("4.Удалить элемент из массива.");
                System.out.println("5.Очистить массива.");
                System.out.println("6.Элемент по индексу в массиве.");
                System.out.println("7.Добавление элемента по индексу в массиве.");
                System.out.println("0.Выход.");
                Scanner scan1 = new Scanner(System.in);
                int num1 = scan1.nextInt();
                if (num1 == 1 || num1 == 2 || num1 == 3 || num1 == 4 || num1 == 5 || num1 == 6 || num1 == 7 || num1 == 0) {
                    switch (num1) {
                        case 1: {
                            notshowpush1((ArrayList) arr);
                            break;
                        }
                        case 2: {
                            notshowpop((ArrayList) arr);
                            break;
                        }
                        case 3: {
                            notshowsize((ArrayList) arr);
                            break;
                        }
                        case 4: {
                            notshowremove((ArrayList) arr);
                            break;
                        }
                        case 5: {
                            notshowsclear((ArrayList) arr);
                            break;
                        }
                        case 6: {
                            notshowget((ArrayList) arr);
                            break;
                        }
                        case 7:{
                            notshowadd((ArrayList) arr);
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
        else if(num2==1) {
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
                if (num == 1 || num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 0) {
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
        else
            System.out.println("Не правильно выбрано значение");
    }
}

