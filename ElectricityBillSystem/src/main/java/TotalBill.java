public class TotalBill {
    private double subTotal1;
    private double subTotal2;
    private double billAmount;

    // Constructors
    public TotalBill() {
    }

    public TotalBill(double subTotal1, double subTotal2) {
        this.subTotal1 = subTotal1;
        this.subTotal2 = subTotal2;
        this.billAmount = calculateBillAmount();
    }

    // Getters and setters
    public double getSubTotal1() {
        return subTotal1;
    }

    public void setSubTotal1(double subTotal1) {
        this.subTotal1 = subTotal1;
    }

    public double getSubTotal2() {
        return subTotal2;
    }

    public void setSubTotal2(double subTotal2) {
        this.subTotal2 = subTotal2;
    }

    public double getBillAmount() {
        return billAmount;
    }

    // Additional method to calculate bill amount
    private double calculateBillAmount() {
        return subTotal1 - subTotal2;
    }
}
