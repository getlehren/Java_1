package HW_6;

class Cat extends Animals {
    @Override
    public void run(int meters) {

        if (meters <= 200) {
            System.out.println("Cat пробежал: " + meters + " м.");
        } else {
            System.out.println("Cat пробежал больше 200 метров и устал! ");
        }
    }

    @Override
    public void swim(int meters) {
        System.out.println("Cat не смог проплыть " + meters +  " м. Кот не  умеет плавать! ");

    }
}
