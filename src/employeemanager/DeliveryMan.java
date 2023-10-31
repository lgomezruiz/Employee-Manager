
package employeemanager;


public class DeliveryMan extends Employee {
    
    //Attribute
    private String zone;
    
    public DeliveryMan(String zone) {
        this.zone = zone;
    }

    //Builders
    public DeliveryMan() {
    }
    
    public DeliveryMan(String zone, String name, int age, double salary) {
        super(name, age, salary);
        this.zone = zone;
    }

    //Getters & Setters
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    //ToString method
    @Override
    public String toString() {
        return super.toString() + ", Zone: " + zone;
    }

    @Override
    public boolean plus() {
        if (super.getAge() > 24 && !zone.equalsIgnoreCase("zone 3")) {
            System.out.println("The delivery man is not less than 25 years old and/or does not deliver in zone 3");
            return false;
        }
        super.setSalary(super.getSalary() + super.SALARY_PLUS);
        System.out.println("The plus has been added to the employee " + super.getName());
        return true;
    }
    
    
    
    
}
