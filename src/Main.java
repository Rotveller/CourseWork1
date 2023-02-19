import java.util.Random;

class Main {

    public static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String arg[]) {
        fillEmployees();
        printAllInformation();
        System.out.println("Общие затраты организации на ЗП сотрудникам составляет = " + totalSalaries());
        System.out.println("СОтрудник с максимальной зарплатой:"+ findEmployeeWithMaxSalary());
        System.out.println("СОтрудник с минимальной зарплатой:"+findEmployeeWithMinSalary());
        System.out.println("Cредняя зарплата в организации:"+findAverageSalary());
        printFullName();
    }

    private static void fillEmployees() {
        Random random = new Random();
        for (int i = 0; i < EMPLOYEES.length; i++) {
            EMPLOYEES[i] = new Employee(
                    "Сотрудник" + (i + 1),
                    random.nextInt(5 - 1) + 1,
                    random.nextInt(90_000 - 45_000) + 45_000
            );

        }
    }

    private static int totalSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static void printAllInformation() {
        for (Employee employees : EMPLOYEES) {
            System.out.println(employees);
        }
    }

    private static Employee findEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee i : EMPLOYEES) {
            if (i.getSalary() < min) {
                min = i.getSalary();
                employee=i;

            }
        }
        return employee;
    }
    private static Employee findEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee i : EMPLOYEES) {
            if (i.getSalary() > max) {
                max = i.getSalary();
                employee=i;

            }
        }
        return employee;
    }

    private static double findAverageSalary() {
        return totalSalaries() / (double) EMPLOYEES.length;
    }

    private static void printFullName() {
        for (Employee employee :
                EMPLOYEES) {
            System.out.println(employee.getFullName());
        }

    }
}