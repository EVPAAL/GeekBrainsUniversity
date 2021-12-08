package HomeWork5;

public class Main {
    public static void main(String[] args) {

        Staff[] staff = new Staff[3];
        staff[0] = new Staff("Evgeniy", "Senior", "pankratov@java.com", "457", 45000, 23);
        staff[1] = new Staff("Max", "Middle", "andreev@java.com", "487", 20000, 45);
        staff[2] = new Staff("Dmitry", "Junior", "bondar@java.com", "497", 10000, 41);

        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getAge() > 40) {
                System.out.println(staff[i]);
            }
        }
    }
}
