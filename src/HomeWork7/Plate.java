package HomeWork7;

public class Plate {
    private int sizeFood;

    public Plate (int sizeFood){
        this.sizeFood = sizeFood;
    }

    public boolean decreaseFood(int amount) {
        if (sizeFood >= amount) {
            sizeFood -= amount;
            return true;
        } else {
            return false;
        }
    }

    public int getSizeFood() {
        return  sizeFood;
    }
    public boolean addFood(int amount) {
        if (amount < 0) {
            return false;
        } else {
            sizeFood += amount;
            return true;
        }
    }
}
