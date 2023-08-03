import java.util.Arrays;
public class Main {
    private static Employee[] employee = new Employee[10];
    private static EmployeeBook[] employeeBook = new EmployeeBook[10];

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee employee1 = new Employee("Виноградов", "Иван", "Максимович", 1, 320000);
        Employee employee2 = new Employee("Егоров", "Вадим", "Маркович", 1, 320000);
        Employee employee3 = new Employee("Филатов", "Макар", "Дмитриевич", 1, 320000);
        Employee employee4 = new Employee("Нечаев", "Александр", "Александрович", 2, 320000);
        Employee employee5 = new Employee("Логинов", "Артем", "Святославович", 2, 320000);
        Employee employee6 = new Employee("Морозова", "Василиса", "Вячеславовна", 4, 550000);
        Employee employee7 = new Employee("Романова", "Мария", "Михайловна", 3, 550000);

        employee[0] = employee1;
        employee[1] = employee2;
        employee[2] = employee3;
        employee[3] = employee4;
        employee[4] = employee5;
        employee[5] = employee6;
        employee[6] = employee7;


        EmployeeBook book1 = new EmployeeBook(10);
        book1.add(new Employee("Сидоров ", "Степан ", "Ярославович", 2, 320000));
        book1.add(new Employee("Попов", "Данила", "Максимович", 1, 320000));
        book1.add(new Employee("Морозов ", "Александр", "Тимофеевич ", 3, 32000));
        book1.add(new Employee("Козлова", "Анна", "Сергеевна", 4, 550000));
        book1.add(new Employee("Гусева", "Анастасия", "Валерьевна", 5, 550000));
        book1.add(new Employee("Агеева", "Ксения", "Павловна", 1, 550000));

        Arrays.stream(employee).forEach(System.out::println);

        printAllEmployees();
        monthlyAmount();
        employeeMaxSalary();
        employeeMinSalary();
        averageSalary();
        printFullNameEmployees();
        indexationSalary(5);
        minSalaryInDepartment(4);
        maxSalaryInDepartment(5);
        departmentalPayrollCosts(5);
        averageSalaryInDepartment(4);
        indexationSalaryInDepartment(5, 5);
        printAllEmployeesInDepartment(4);
        employeeLessSalary(320000);
        employeeMoreSalary();

        System.out.println();
        book1.printAllEmployees();
        book1.monthlyAmount();
        book1.employeeMaxSalary();
        book1.employeeMinSalary();
        book1.averageSalary();
        book1.printFullNameEmployees();
        book1.indexationSalary(5);
        book1.minSalaryInDepartment(1);
        book1.maxSalaryInDepartment(1);
        book1.departmentalPayrollCosts(4);
        book1.averageSalaryInDepartment(1);
        book1.indexationSalaryInDepartment(5, 1);
        book1.printAllEmployeesInDepartment(1);
        book1.employeeLessSalary(320000);
        book1.employeeMoreSalary(550000);
        book1.deleteEmployee(3);
        book1.changesEmployee("Агеева", "Ксения", "Павловна", 1, 550000);
        book1.printOfDepartments(1);


    }

    private static void employeeMoreSalary() {
    }


    private static void employeeLessSalary(int i) {
    }

    private static void printAllEmployeesInDepartment(int i) {
    }

    private static void indexationSalaryInDepartment(int i, int i1) {
    }

    private static void averageSalaryInDepartment(int i) {
    }

    private static void departmentalPayrollCosts(int i) {
    }

    private static void maxSalaryInDepartment(int i) {
    }

    private static void minSalaryInDepartment(int i) {
    }

    private static void indexationSalary(int i) {

    }

    private static void printFullNameEmployees() {
    }

    private static void averageSalary() {
    }

    private static void employeeMinSalary() {
    }

    private static void employeeMaxSalary() {
    }

    private static void printAllEmployees() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }

    private static void monthlyAmount() {
        int sum = 0;
        for (Employee employee : employee) {
            if (employee != null) {
                sum += employee.getsalary();
                System.out.println("Сумма затрат на зарплату в месяц: " + sum + " рублей.");
            }

                int minSalary = Integer.MAX_VALUE;
                Employee result = null;
                    if (employee != null && employee.getsalary() < minSalary) {
                        minSalary = employee.getsalary();
                    }
            }
        }
    }