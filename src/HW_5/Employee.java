package HW_5;

public class Employee {
    private String name;
    private String email;
    private String position;
    private String pNumber;
    private double salary;
    private int age;

    public Employee(String name, String email, String position, String pNumber, double salary, int age) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.pNumber = pNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя: " + name + "\n" +
                "Email: " + email + "\n" +
                "Должность: " + position + "\n" +
                "Номер телефона: " + pNumber + "\n" +
                "Зарплата: " +salary + "\n" +
                "Возраст: " + age + "\n");
    }

    public int getAge() {
        return age;
    }
}

