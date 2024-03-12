import java.util.Random;

public class Algorithm {
    public static final int MIN_VALUE = 11;
    public static final int MAX_VALUE = 100_011;

    public static void main(String[] args) {
        int sumOfTenth = 0;
//        int numberOfIteration = 0; // Змінну додано для тестування
        Random random = new Random();
        int randomValue = random.nextInt(MAX_VALUE + 1 - MIN_VALUE) + MIN_VALUE;
        System.out.println("Згенероване натуральне число: " + randomValue);
        while (randomValue / 10 != 0 || randomValue % 10 != 0) {
            sumOfTenth += randomValue % 10;
            randomValue /= 10;
//            numberOfIteration++; // Вираз додано для тестування
        }
        System.out.println("Суму чисел з яких складається згенероване число: " + sumOfTenth);
//        System.out.println(numberOfIteration); // Вивід додано для тестування
    }
}
