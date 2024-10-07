import java.util.Scanner;

public class Sum {public static void main(String[] args) {
    System.out.println("Введите колличество чисел для массива");
    int count;
    Scanner scanner= new Scanner(System.in);
    count = scanner.nextInt();
    int [] namber = new int[count];
    int len = namber.length;
    int sum = 0;
    System.out.println("Колличество чисел в массиве: "+len);
    for (int i = 0; i<namber.length;i++) {
        sum = sum + i;
        System.out.println("Число: " + i);
        //System.out.println("Сумма всех чисел массива: " +sum);

    }
    for (int x: namber){
        sum = sum+ x;
        System.out.println("Сумма всех чисел массива: " +sum);
        break;}
}
}
