import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu2 {

    static Scanner scan = new Scanner(System.in);
    static int userinput;

    public static void main(String[] args) {
        while (userinput != 5) {
            System.out.println("Для создания массива из натуральных чисел введите: 1");
            System.out.println("Для создания массива из чётных чисел введите: 2");
            System.out.println("Для создания массива из не чётных чисел введите: 3");
            System.out.println("Для создания и заполнения массива введите: 4");
            System.out.println("Для завершения программы нажмите введите: 5");
            System.out.print("Введите число: ");

            try {
                userinput = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка, вы должны ввести число!");
                scan.next();
            }

            switch (userinput) {
                case 1 -> {
                    System.out.println("Ведите сколько чисел будет в массиве:");
                    int arrayplaces1 = scan.nextInt();
                    ArrayList<Object> array1 = new ArrayList<>(20);
                    for (int i1 = 0; i1 < arrayplaces1; i1++) {
                        array1.add(i1);
                    }
                    System.out.println("Массив: ");
                    for (Object el : array1) {
                        System.out.println(el);
                    }
                }
                case 2 -> {
                    System.out.println("Ведите сколько чисел будет в массиве:");
                    int arrayplaces2 = scan.nextInt();
                    ArrayList<Integer> array2 = new ArrayList<>(20);
                    for (int i2 = 0; i2 < arrayplaces2; i2++) {
                        array2.add((i2 * 2) + 2);
                    }
                    System.out.println("Массив: ");
                    for (Integer el : array2) {
                        System.out.println(el);
                    }
                }
                case 3 -> {
                    System.out.println("Ведите сколько чисел будет в массиве:");
                    int arrayplaces3 = scan.nextInt();
                    ArrayList<Integer> array3 = new ArrayList<>(20);
                    for (int i3 = 0; i3 < arrayplaces3; i3++) {
                        if (i3 < 1) {
                            array3.add(1);
                        }
                        array3.add((i3 * 2) + 3);
                    }
                    System.out.println("Массив: ");
                    for (Integer el : array3) {
                        System.out.println(el);
                    }
                }
                case 4 -> {
                    System.out.println("Ведите сколько чисел будет в массиве:");
                    int arrayplaces4 = scan.nextInt();
                    ArrayList array4 = new ArrayList(20);
                    for (int i4 = 0; i4 < arrayplaces4; i4++) {
                        System.out.print("Введите " + i4 + "-е значение в массив: ");
                        array4.add(scan.nextInt());
                    }
                    System.out.println("Массив: ");
                    for (Object i4 : array4) {
                        System.out.println(i4);
                    }
                }
            }
        }
        System.out.println("Вы успешно вышли из программы!");
    }
}
