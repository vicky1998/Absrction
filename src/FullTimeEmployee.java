public class FullTimeEmployee extends Employee {


    public FullTimeEmployee(String employeeName, int paymentHour) {
        super(employeeName, paymentHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentHour()*8;
    }
}
