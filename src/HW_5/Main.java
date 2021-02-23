package HW_5;

public class Main {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Ivanov Ivan ", "iv@gmail.ru", "Community Manager", "+79915326469", 55500.50, 39);
        arr[1] = new Employee("Petrov Petr ", "pe@gmail.ru", "Intern Analyst", "+79915326547", 65000, 49);
        arr[2] = new Employee("Olga Sidorova ", "os@gmail.ru", "Junior Online Reputation Manager", "+79916446541", 35000, 19);
        arr[3] = new Employee("Mark Markov ", "pe@gmail.ru", "Backend Node JS Developer", "+79915778521", 40000, 25);
        arr[4] = new Employee("Nikolay Baskov ", "nb@gmail.ru", "Unity3D Developer", "+79914426599", 75000.50, 50);


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 40) {
                arr[i].info();
            }
        }
    }
}

