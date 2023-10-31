
package employeemanager;


public class Main {
    
    public static void main(String[] args) {
        
        Commercial c1 = new Commercial(300, "Antonio", 35, 1000);
        DeliveryMan d1 = new DeliveryMan("zone 3", "Juan", 20, 1000);
        
        Commercial c2 = new Commercial(100, "Juan", 20, 1000);
        DeliveryMan d2 = new DeliveryMan("zone 1", "Antonio", 35, 1000);
        
        System.out.println("Does the employee deserve a plus? :");
        System.out.println("");
        c1.plus();
        d1.plus();
        c2.plus();
        d2.plus();
        
        System.out.println("");
        System.out.println("Final employee information :");
        System.out.println("");
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(c2);
        System.out.println(d2);
    }
    
}
