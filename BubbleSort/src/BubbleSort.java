
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {}
        new MainWindow();
//        int len, l;

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter length of array: ");
//        len = input.nextInt();
//        int[] x = new int[len];
//
//        for (int i = 0; i < len; i++) {
//            x[i] = input.nextInt();
//        }
//
//        System.out.println("Our array before bubble sorting: " + Arrays.toString(x));
//
//        BubbleSort(x);
//
//        System.out.println("Our array after bubble sorting: " + Arrays.toString(x));
    }

//    public static void BubbleSort(int []x){
//        int j;
//        boolean initializeWorkOfWhile = true;   // устанавливаем наш флаг в true для первого прохода по массиву
//        int temp;   // вспомогательная переменная
//
//        while (initializeWorkOfWhile) {
//            initializeWorkOfWhile = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
//            for (j = 0; j < x.length - 1; j++) {
//                if (x[j] > x[j + 1]) { // измените на > для сортировки по возрастанию
//                    temp = x[j];         // меняем элементы местами
//                    x[j] = x[j + 1];
//                    x[j + 1] = temp;
//                    initializeWorkOfWhile = true;  // true означает, что замена местами была проведена
//                }
//            }
//        }
//
//        return;
//    }
}
