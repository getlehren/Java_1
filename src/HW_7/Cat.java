package HW_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public boolean isHungry() {
        return hungry;
    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        hungry = true;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite))
            hungry = false;
        else
            hungry = true;
    }

    public String getName() {
        return name;
    }
}