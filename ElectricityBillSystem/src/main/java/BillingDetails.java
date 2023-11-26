public class BillingDetails {
    private double fixedChargeUnit;
    private double fixedChargeRate;
    private double energyChargeUnit;
    private double energyChargeRate;
    private double fppcaChargeUnit;
    private double fppcaChargeRate;
    private double taxRate;

    // Constructors
    public BillingDetails() {
    }

    public BillingDetails(double fixedChargeUnit, double fixedChargeRate, double energyChargeUnit,
                          double energyChargeRate, double fppcaChargeUnit, double fppcaChargeRate,
                          double taxRate) {
        this.fixedChargeUnit = fixedChargeUnit;
        this.fixedChargeRate = fixedChargeRate;
        this.energyChargeUnit = energyChargeUnit;
        this.energyChargeRate = energyChargeRate;
        this.fppcaChargeUnit = fppcaChargeUnit;
        this.fppcaChargeRate = fppcaChargeRate;
        this.taxRate = taxRate;
    }

    // Getters and setters
    public double getFixedChargeUnit() {
        return fixedChargeUnit;
    }

    public void setFixedChargeUnit(double fixedChargeUnit) {
        this.fixedChargeUnit = fixedChargeUnit;
    }

    public double getFixedChargeRate() {
        return fixedChargeRate;
    }

    public void setFixedChargeRate(double fixedChargeRate) {
        this.fixedChargeRate = fixedChargeRate;
    }

    public double getEnergyChargeUnit() {
        return energyChargeUnit;
    }

    public void setEnergyChargeUnit(double energyChargeUnit) {
        this.energyChargeUnit = energyChargeUnit;
    }

    public double getEnergyChargeRate() {
        return energyChargeRate;
    }

    public void setEnergyChargeRate(double energyChargeRate) {
        this.energyChargeRate = energyChargeRate;
    }

    public double getFppcaChargeUnit() {
        return fppcaChargeUnit;
    }

    public void setFppcaChargeUnit(double fppcaChargeUnit) {
        this.fppcaChargeUnit = fppcaChargeUnit;
    }

    public double getFppcaChargeRate() {
        return fppcaChargeRate;
    }

    public void setFppcaChargeRate(double fppcaChargeRate) {
        this.fppcaChargeRate = fppcaChargeRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    // Additional methods to calculate charges
    public double calculateFixedCharge() {
        return fixedChargeUnit * fixedChargeRate;
    }

    public double calculateEnergyCharge(double consumptionUnits) {
        return consumptionUnits * energyChargeRate;
    }

    public double calculateFppcaCharge(double consumptionUnits) {
        return consumptionUnits * fppcaChargeRate;
    }

    public double calculateTax(double totalCharges) {
        return totalCharges * (taxRate / 100);
    }
}
