public class Employee {
    private static int idCounter = 1;
    private final String firstname;
    private int id;
    private String name;
    private String middlename;
    private String surname;
    private int otdel;
    private int salary;

    private String surName;
    private String firstName;

    private int department;

    private static int counter = 1;

    public Employee(String surname, String firstname, String middleName, int department, int salary) {
        this.surname = surname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.surname = surname;
        this.otdel = otdel;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }
    public String getsurname() {
        return surname;
    }

    public String getname() {
        return name;
    }

    public String getmiddlename() {
        return middlename;
    }

    public int getsalary() {
        return salary;
    }

    public int getdepartment(){
        return department;
    }

    public int getId() {
        return id;
    }

    public float getsalary(int increaseSalary) {
        return 0;
    }

    public int setSalary(int increaseSalary) {
        return 0;
    }
}


