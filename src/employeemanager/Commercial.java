
package employeemanager;


public class Commercial extends Employee {
    
    //Attributes
    private double commission;
    
    public Commercial(double commission) {
        this.commission = commission;
    }

    //Builders
    public Commercial() {
    }
    
    public Commercial(double commission, String name, int age, double salary) {
        super(name, age, salary);
        this.commission = commission;
    }

    //Getters & Setters
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    //ToString method
    @Override
    public String toString() {
        return super.toString() + ", Commission: " + commission;
    }

    @Override
    public boolean plus() {
        if (super.getAge() < 31 && getCommission() < 201) {
            System.out.println("The Commercial is less than 30 years old and/or charges a commission of less than €200");
            return false;
        }
        super.setSalary(super.getSalary() + super.SALARY_PLUS);
        System.out.println("The plus has been added to the employee " + super.getName());
        return true;
    }
    
    
}
