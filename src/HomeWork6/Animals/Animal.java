package HomeWork6.Animals;

public class Animal {
    String name;
    int maxRunDistance;
    int maxSwimDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " пробежал " + dist + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + dist + " метров");
        }
    }

    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать");
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(name + " проплыл " + dist + " метров");
        } else {
            System.out.println(name + " не смог проплыть " + dist + " метров");
        }
    }
}
