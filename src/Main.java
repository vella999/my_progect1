import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 3);
        int number;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите загаданное число");
            number = scanner.nextInt();
            counter ++;
        } while (randomNumber != number);
        if (randomNumber == number)
            System.out.println("Вы угадали кол-во попыток: " + counter);
    }
}
