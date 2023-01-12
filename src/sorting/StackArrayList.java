package sorting;

import java.util.*;

public class StackArrayList {
    public static void ArList(String[] array) {
        List<String>arr1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
             arr1.add(array[i]);
        }
        System.out.println(arr1.toString());
        System.out.println("Введите число ArrayList:");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();
        arr1.remove(str);
        System.out.println(arr1.toString());
    }
    public static void LiList(String[] array){
        List<String> arr2= new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            arr2.add(array[i]);
        }
        System.out.println(arr2.toString());
        System.out.println("Введите число LinkedList:");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();
        arr2.remove(str);
        System.out.println(arr2.toString());
    }
    public static void main(String[] args) {
        String[] array = new String[]{"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        List<String> arr= new ArrayList<>();
        arr.add("zero"); //one two three four five six seven eight nine");
        arr.add("one");
        arr.add("two");
        arr.add("three");
        arr.add("four");
        arr.add("five");
        arr.add("sixe");
        arr.add("seven");
        arr.add("eight");
        arr.add("nine");
        System.out.println(arr.toString());
        ArList(array);
        LiList(array);


    }
}