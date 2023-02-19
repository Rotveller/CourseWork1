class Employee {
    private final String fullName;
    private int salary;
    private int department;
    private final int iD;
    private static int counterId = 1;

    public Employee(String fullName, int department, int salary) {
        this.iD = counterId++;
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;

    }


    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return " " +
                ", iD="+ iD  +" ФИО:'"+ fullName + '\'' +
                ", salary=" + salary +
                ", department=" + department;
    }
}
