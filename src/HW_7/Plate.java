package HW_7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if(food - n < 0) {
            food = 0;
            System.out.println("Еда закончилась!");
            return true;
        } else {
            food -= n;
            return false;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood (int food) {
        this.food += food;
    }
}
