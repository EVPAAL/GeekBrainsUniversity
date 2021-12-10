package HomeWork7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[] {
                new Cat("Симба"),
                new Cat("Семён"),
                new Cat("Чижик")
        };
        Plate plate = new Plate(100);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }
}
