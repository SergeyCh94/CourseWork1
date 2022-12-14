public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int counter;
    private int id;

    public Employee (String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }
    @Override
    public String toString(){
        return "id: " + id + ". " + fullName + " Департамент: " + department + " Зарплата: " + salary + " рублей.";
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


