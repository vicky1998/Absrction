public abstract class Employee {

    private  String employeeName;
    private int paymentHour;
    public abstract int  calculateSalary();

    public Employee(String employeeName, int paymentHour){
        this.employeeName=employeeName;
        this.paymentHour=paymentHour;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getPaymentHour() {
        return paymentHour;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setPaymentHour(int paymentHour) {
        this.paymentHour = paymentHour;
    }





}
