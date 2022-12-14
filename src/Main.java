public class Main {
    static Employee[] employees = new Employee[10];
    public static void listOfEmployees() {
        for (Object s : employees){
            if(s != null) {
                System.out.println(s);
            }
        }
    }

    public static void salaryCosts() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum + " рублей.");
    }

    public static void minSalary() {
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null) {
                min = Math.min(min, employees[i].getSalary());
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила: " + min + " рублей.");
    }

    public static void maxSalary() {
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null) {
                max = Math.max(max, employees[i].getSalary());
            }
        }
        System.out.println("Максимальная сумма трат за месяц составила " + max+ " рублей.");
    }

    public static void averageSalary() {
        int sum = 0;
        int count = 0;
        int averageSum;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                sum += employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                count++;
            }
        }
        averageSum = sum / count;
        System.out.println("Cреднее значение зарплат: " + averageSum + " рублей.");
    }

    public static void listFullName() {
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null) {
                String name = employees[i].getFullName();
                System.out.println("Ф.И.О сотрудников: " + " " + employees[i].getId() + " " + name);
            }
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 60000);
        employees[1] = new Employee("Иванов Иван Иванович", 1, 65000);
        employees[2] = new Employee("Иванов Иван Иванович", 1, 70000);
        employees[3] = new Employee("Иванов Иван Иванович", 1, 75000);
        employees[4] = new Employee("Иванов Иван Иванович", 1, 80000);
        employees[5] = new Employee("Иванов Иван Иванович", 1, 85000);

        listOfEmployees();
        System.out.println("\n");
        salaryCosts();
        System.out.println("\n");
        minSalary();
        System.out.println("\n");
        maxSalary();
        System.out.println("\n");
        averageSalary();
        System.out.println("\n");
        listFullName();
    }
}
