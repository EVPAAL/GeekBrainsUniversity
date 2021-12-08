package HomeWork1;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-10,6);
        printColor(100);
        Numbers(8,5);
    }
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }
    public static void checkSumSign(int a, int b) {
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная\n");
        }
        else {
            System.out.println("Сумма отрицательная\n");
        }
    }
    public static void printColor(int value) {
        System.out.println("Заданиие 4:");
        if (value <= 0) {
            System.out.println("Красный\n");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый\n");
        }
        else {
            System.out.println("Зеленый\n");
        }
    }
    public static void Numbers(int a, int b) {
        if (a >= b) {
            System.out.printf("%d >= %d\n", a, b);
        } else {
            System.out.printf("%d < %d\n", a, b);
        }
    }
}
