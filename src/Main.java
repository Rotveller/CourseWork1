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
public class Main {

    public static void main(String[] args) {
        Employee mishaGorchkovAlekseyevich = new Employee("misha", "Gorchkov","Alekseyevich", 1, 45_000);
        Employee mishaGorchkovAlekseyevich2 = new Employee("misha", "Gorchkov","Alekseyevich", 1, 380_000);
        Employee mishaGorchkovAlekseyevich3 = new Employee("misha", "Gorchkov","Alekseyevich", 1, 79_045);
        Employee mishaGorchkovAlekseyevich4 = new Employee("misha", "Gorchkov","Alekseyevich", 1, 15_000);
        System.out.println(mishaGorchkovAlekseyevich);
        System.out.println(mishaGorchkovAlekseyevich2);
        System.out.println(mishaGorchkovAlekseyevich3);
        System.out.println(mishaGorchkovAlekseyevich4);
    }
}
