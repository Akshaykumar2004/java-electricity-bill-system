import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private String rrNumber;
    private String accountId;
    private String maCode;
    private String nameAndAddress;
    private String tariff;
    private String sanctionedLoad;
    private Date registrationDate;

    // Constructors
    public Customer() {
    }

    public Customer(String rrNumber, String accountId, String maCode, String nameAndAddress, String tariff,
                    String sanctionedLoad, String registrationDate) throws ParseException {
        this.rrNumber = rrNumber;
        this.accountId = accountId;
        this.maCode = maCode;
        this.nameAndAddress = nameAndAddress;
        this.tariff = tariff;
        this.sanctionedLoad = sanctionedLoad;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.registrationDate = sdf.parse(registrationDate);
    }

    // Getters and setters
    public String getRrNumber() {
        return rrNumber;
    }

    public void setRrNumber(String rrNumber) {
        this.rrNumber = rrNumber;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getMaCode() {
        return maCode;
    }

    public void setMaCode(String maCode) {
        this.maCode = maCode;
    }

    public String getNameAndAddress() {
        return nameAndAddress;
    }

    public void setNameAndAddress(String nameAndAddress) {
        this.nameAndAddress = nameAndAddress;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public String getSanctionedLoad() {
        return sanctionedLoad;
    }

    public void setSanctionedLoad(String sanctionedLoad) {
        this.sanctionedLoad = sanctionedLoad;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
