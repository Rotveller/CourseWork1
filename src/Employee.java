/*
1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
        2. Добавить статическую переменную-счетчик, которая будет отвечать за id.+
        3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
        4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.+
        5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).+
        6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
        7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
        8. Создать статические методы, которые будут взаимодействовать с массивом ипредоставлять результат:
        1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        2. Посчитать сумму затрат на зарплаты в месяц.
        3. Найти сотрудника с минимальной зарплатой.
        4. Найти сотрудника с максимальной зарплатой.
        5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        6. Получить Ф. И. О. всех сотрудников (вывести в консоль).*/
public class Employee {
    private String firstName;
    private String surname;
    private String middleName;
    int employeeDepartment;
    private  int id;
    double salary;

    public Employee(String firstName, String surname, String middleName, int employeeDepartment, double salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.middleName = middleName;
        this.employeeDepartment = employeeDepartment;
        this.salary = salary;
    }

    Employee() {
        id++;
    }
    public void counter(int id) {
        id++;
        this.id = id;
    }

    public boolean employeeDepartment() {
        if (1 <= employeeDepartment && employeeDepartment <= 5) {
            return true;
        } else
            System.out.println("Указан некорректный отдел, укажите от 1 до 5");
        return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(int employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Имя='" + firstName + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", Отчество='" + middleName + '\'' +
                ", Отдел=" + employeeDepartment +
                ", id=" + id +
                ", Зарплата=" + salary +
                '}';
    }

}

