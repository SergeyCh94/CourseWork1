
public class Main {
    static Employee[] employees = new Employee[10];
    public static void listOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                String s = employees[i].getFullName();
                System.out.println(s);;
            }
        }
    }

    public static int salaryCosts() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee minSalary() {
        int temp = 0;
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null) {
                min = Math.min(min, employees[i].getSalary());
                temp = i;
            }
        }
       return employees[temp];
    }

    public static Employee maxSalary() {
        int temp = 0;
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null) {
                max = Math.min(max, employees[i].getSalary());
                temp = i;
            }
        }
        return employees[temp];
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
        System.out.println("Сумма затрат: " + salaryCosts());
        System.out.println("\n");
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary());
        System.out.println("\n");
        System.out.println(("Сотрудник с максимальной зарплатой: " + maxSalary()));
        System.out.println("\n");
        averageSalary();
        System.out.println("\n");
        listFullName();

    }
}
