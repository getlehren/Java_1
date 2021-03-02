package HW_7;

public class Main {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Kostik", 50);
        Cat cat1 = new Cat("Rizik", 25);
        Cat cat2 = new Cat("Pushok", 12);
        Cat [] cats = { cat0 , cat1, cat2};
        Plate plate = new Plate(100);
        plate.addFood(200);

        for (Cat cat : cats) {
            cat.eat(plate);
        }
        for (Cat pCat : cats) {
            System.out.println(pCat.getName() + " Сыт: " + pCat.isHungry());
        }

    }

}
