public class EmpApp {
    public static void main(String[] args) {
        Contractor c1=new Contractor("vicky",8,5);
        System.out.println( c1.calculateSalary());
        FullTimeEmployee F1=new FullTimeEmployee("nikhil",9);
        System.out.println(F1.calculateSalary());

    }
}
