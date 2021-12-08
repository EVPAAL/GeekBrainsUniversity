package HomeWork5;

public class Staff {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Staff(String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("Staff: %s, %s, %s, %s, %d, %d.\n", name, post, email, phoneNumber, salary, age);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString () {
        return String.format("Staff: %s, %s, %s, %s, %d, %d.", name, post, email, phoneNumber, salary, age);
    }
}
