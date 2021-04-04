package HomeWorkFive;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich",
                "Top manager", "ivanovii@mail.me", 2490852, 45000, 45);
        employees[1] = new Employee("Petrov", "Petr", "Petrovich", "manager",
                "petrovpp@mail.me", 6384231, 30000, 23);
        employees[2] = new Employee("Sidorov", "Sidor", "Sidorovich",
                "manager", "sidorovss@mail.me", 8532321, 25000, 41);
        employees[3] = new Employee("Pupkin", "Vasilii", "Ivanovich",
                "manager", "pupkinvi@mail.me", 9854312, 41000, 50);
        employees[4] = new Employee("Semenov", "Semen", "Semenovich",
                "manager", "semenovss@mail.me", 8945301, 23000, 21);

        for (Employee e : employees) if (e.getAge() > 40) e.getFullInfo();
    }
}
