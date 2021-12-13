package HomeWork7;

public class Cat {
    private String name;
    private boolean satiety;
    private final int sizeAppetitе = 50;

    public Cat (String name) {
        this.name = name;
    }

    public boolean eat (Plate plate) {
        if (plate.decreaseFood(sizeAppetitе)) {
            System.out.println("Кот " + name + " кушает ...");
            satiety = true;
            return true;
        } else {
            System.out.println("Кот " + name + " не поел.");
            return false;
        }
    }

    public String getName () {
        return name;
    }
    public boolean isSatiety () {
        return satiety;
    }
}
