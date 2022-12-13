public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", 1, 60.000);
        System.out.println(Employee.id);

    }

    public static class Employee {
        private String fio;
        private int departmentNumber;
        private double salary;
        private static int id;

        public Employee(String fio, int departmentNumber, double salary) {
            this.fio = fio;
            this.departmentNumber = departmentNumber;
            this.salary = salary;
            id++;
        }

        public String getFio() {
            return fio;
        }

        public int getDepartmentNumber() {
            return departmentNumber;
        }

        public double getSalary() {
            return salary;
        }

        public static int getId() {
            return id;
        }

        public void setDepartmentNumber(int departmentNumber) {
            if (departmentNumber < 1 || departmentNumber > 5) {
                System.out.println("У нас нет такого отдела: " + departmentNumber);
                return;
            }
            this.departmentNumber = departmentNumber;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }
}
