
package employeemanager;


public abstract class Employee {
    
    //Attributes
    private String name;
    private int age;
    private double salary;
    
    //Constants
    protected final double SALARY_PLUS = 300;
    
    //Builders
    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Other methods
    public abstract boolean plus();
    
    //ToString method
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
    
    
    
    
}
