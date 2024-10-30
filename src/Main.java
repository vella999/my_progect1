import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество чисел в массиве!");
        int count = scanner.nextInt();
        int[] array = new int[count];
        int porog;
        System.out.println("Введенное колличество чисел: " + count);
        System.out.println("Введите числа кторые будут в массиве!");
        for (int i = 0; i < count; i++) {
            int namber = scanner.nextInt();
            array[i] = namber;
        }
        System.out.println("Введеные числа: " + Arrays.toString(array));
        System.out.println("Выберите вариант: Сортировка 0, Фильтр 1");
        int v = scanner.nextInt();
        if (v > 1) {
            System.out.println("Вы ввели неверное значение!");
        }
        if (v == 0) {
            Arrays.sort(array);
            System.out.println("Отсортированный массив введеных чисел без порога: " + Arrays.toString(array));
        }
        if (v == 1) {
            System.out.println("Введите порог для фильтра, который оставит только те числа, которые больше заданного значения");
            porog = scanner.nextInt();
            int tr = porog;
            filter(array, tr);
            System.out.println("Ваш отфильтрованный массив по введенному порогу: "+ Arrays.toString(filter(array, tr)));
        }

    }


    public static int[] filter(int[] array, int threshold) {
        int count = 0;
        for (int number : array) {
            if (number > threshold) {
                count++;
            }
        }

        int[] filteredArray = new int[count];
        int index = 0;
        for (int number : array) {
            if (number > threshold) {
                filteredArray[index++] = number;
            }
        }
        return filteredArray;
    }

    }



