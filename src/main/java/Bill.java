import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bill {
    private String billPeriod;
    private Date readingDate;
    private String billNumber;
    private double previousReading;
    private double presentReading;
    private double consumptionUnits;

    // Constructors
    public Bill() {
    }

    public Bill(String billPeriod, String readingDate, String billNumber, double previousReading,
                double presentReading) throws ParseException {
        this.billPeriod = billPeriod;
        this.billNumber = billNumber;
        this.previousReading = previousReading;
        this.presentReading = presentReading;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.readingDate = sdf.parse(readingDate);
        this.consumptionUnits = calculateConsumption();
    }

    // Getters and setters
    public String getBillPeriod() {
        return billPeriod;
    }

    public void setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
    }

    public Date getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(Date readingDate) {
        this.readingDate = readingDate;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public double getPreviousReading() {
        return previousReading;
    }

    public void setPreviousReading(double previousReading) {
        this.previousReading = previousReading;
    }

    public double getPresentReading() {
        return presentReading;
    }

    public void setPresentReading(double presentReading) {
        this.presentReading = presentReading;
        this.consumptionUnits = calculateConsumption();
    }

    public double getConsumptionUnits() {
        return consumptionUnits;
    }

    // Additional method to calculate consumption
    private double calculateConsumption() {
        return presentReading - previousReading;
    }
}
