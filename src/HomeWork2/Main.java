package HomeWork2;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkingThelimit(5,8));
        checkingTheNumber(22);
        System.out.println(checkingTheNumber2(7));
        printLine("I'm learning Java", 7);
        System.out.println(leapYear(1600));
    }
    public static boolean checkingThelimit(int a, int b) {
        int summ = a + b;
//        if (summ >= 10 && summ <= 20) {
//            return true;
//        } else {
//            return false;
//        }
        return summ >= 10 && summ <= 20;
    }

    public static void checkingTheNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkingTheNumber2(int a) {
//        if (a <= 0) {
//            return true;
//        } else {
//            return false;
//        }
        return a <= 0;
    }

    public static void printLine(String name, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(name);
        }
    }

    public static boolean leapYear (int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
