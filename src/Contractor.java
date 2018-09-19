public class Contractor extends Employee {
    int workingHours;
    public Contractor(String employeeName,int paymentHour,int workingHours ){
        super(employeeName,paymentHour);
        this.workingHours=workingHours;

    }


    @Override
    public int calculateSalary() {
      return   getPaymentHour()*workingHours;

    }
}
