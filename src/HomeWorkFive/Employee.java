package HomeWorkFive;

public class Employee {
    private String firstname, name, middleName, position, email;
    private int phoneNumber, salary, age;

    Employee(String firstname, String name, String middleName, String position, String email, int phoneNumber, int salary, int age) {
        this.firstname = firstname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("Фамилия: " + firstname + " | Имя: " + name
                + " | Отчество: " + middleName + " | Должность: " + position
                + " | Элетронная почта: " + email + " | Номер телефона " + phoneNumber + " | Зарплата: " + salary + " | Возраст: "
                + age);
    }

    int getAge() {
        return age;
    }
}
