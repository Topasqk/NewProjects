package sorting;
import java.util.Arrays;
public class sorting {
    public static void bubbleSortASC(int[] mas){
        int buf;
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
    public static void bubbleSortDESC(int[] mas){
        int buf;
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }}}
        System.out.println(Arrays.toString(mas));
    }
    public static void Binary(int[] mas) {
        int  z=19, x=2, c=89;
        for (int i = 0; i < mas.length ; i++)
        {
            int mid = (mas[i]+z) / 2;
            int mid1 = (mas[i]+x) / 2;
            int mid2 = (mas[i]+c) / 2;
            if (mas[i] == mid){
                System.out.println("индекс  "+ i);
            }
            else if( mas[i] == mid1) {
                System.out.println("индекс  "+ i);
            }
            else if( mas[i] == mid2) {
                System.out.println("индекс  "+ i);
            }
        }
    }


    public static void main(String[] args) {
        int[] mas = {2, 19, 24, 5, 8, 0, 71, 198, 100, 89};
        Binary(mas);
        bubbleSortASC(mas);
        bubbleSortDESC(mas);

    }
}
