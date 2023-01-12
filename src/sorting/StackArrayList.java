package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackArrayList {
    public static void main(String[] args) {

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
        System.out.println("Введите число:");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();
        arr.remove(str);
        System.out.println(arr.toString());


    }
}