import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectricityBillingSystem {
    private static List<Customer> customers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeCustomers();

        int option;
        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    issueBillToExistingCustomer();
                    break;
                case 2:
                    addNewCustomer();
                    break;
                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }
        } while (option != 4);

        scanner.close();
    }

    private static void initializeCustomers() {
        try {
            customers.add(new Customer(
                    "W7EH48651",
                    "5410162138",
                    "14003439",
                    "PAVANA GANGA, #36, K NO 192/36/283/38 BHEL KENCHENAHALLI RR NAGAR BEML LAYOUT",
                    "25303",
                    "J3",
                    "24/06/2023"
            ));

            // Add more customers if needed...

        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }

    private static void printMenu() {
        System.out.println("\nOptions:");
        System.out.println("1. Issue a bill to an existing customer");
        System.out.println("2. Add a new customer");
        System.out.println("3. Delete a customer");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void issueBillToExistingCustomer() {
        displayExistingCustomers();

        System.out.print("Enter the index of the customer to issue a bill: ");
        int customerIndex = scanner.nextInt();

        if (isValidIndex(customerIndex)) {
            Customer customer = customers.get(customerIndex);

            // Manually enter bill details
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter Bill Period (dd/MM/yyyy - dd/MM/yyyy): ");
            String billPeriod = scanner.nextLine();

            System.out.print("Enter Reading Date (dd/MM/yyyy): ");
            String readingDate = scanner.nextLine();

            System.out.print("Enter Bill Number: ");
            String billNumber = scanner.nextLine();

            System.out.print("Enter Previous Reading: ");
            double previousReading = scanner.nextDouble();

            System.out.print("Enter Present Reading: ");
            double presentReading = scanner.nextDouble();

            try {
                Bill bill = new Bill(billPeriod, readingDate, billNumber, previousReading, presentReading);

                System.out.println("\nBill Issued Successfully!");
                displayBillDetails(bill, customer);

            } catch (ParseException e) {
                System.out.println("Error parsing date: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    private static void addNewCustomer() {
        System.out.println("\nEnter details for the new customer:");
        scanner.nextLine(); // Consume the newline character

        System.out.print("RR Number: ");
        String rrNumber = scanner.nextLine();

        System.out.print("Account ID: ");
        String accountId = scanner.nextLine();

        System.out.print("M.A. Code: ");
        String maCode = scanner.nextLine();

        System.out.print("Name and Address: ");
        String nameAndAddress = scanner.nextLine();

        System.out.print("Tariff: ");
        String tariff = scanner.nextLine();

        System.out.print("Sanctioned Load: ");
        String sanctionedLoad = scanner.nextLine();

        System.out.print("GJS Registration Date (dd/MM/yyyy): ");
        String registrationDate = scanner.nextLine();

        try {
            customers.add(new Customer(rrNumber, accountId, maCode, nameAndAddress, tariff, sanctionedLoad, registrationDate));
            System.out.println("New customer added successfully!");

        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }

    private static void deleteCustomer() {
        displayExistingCustomers();

        System.out.print("Enter the index of the customer to delete: ");
        int customerIndex = scanner.nextInt();

        if (isValidIndex(customerIndex)) {
            customers.remove(customerIndex);
            System.out.println("Customer deleted successfully!");
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }
    }

    private static void displayExistingCustomers() {
        System.out.println("\nExisting Customers:");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println(i + ". " + customer.getNameAndAddress());
        }
    }

    private static void displayBillDetails(Bill bill, Customer customer) {
        System.out.println("\nBill Details for " + customer.getNameAndAddress() + ":");
        displayBillDetails(bill);
    }

    private static void displayBillDetails(Bill bill) {
        System.out.println("Billing Details:");
        System.out.println("Bill Period: " + bill.getBillPeriod());
        System.out.println("Reading Date: " + bill.getReadingDate());
        System.out.println("Bill Number: " + bill.getBillNumber());
        System.out.println("Consumption Details:");
        System.out.println("Previous Reading: " + bill.getPreviousReading());
        System.out.println("Present Reading: " + bill.getPresentReading());
        System.out.println("Consumption Units: " + bill.getConsumptionUnits());
    }

    private static boolean isValidIndex(int index) {
        return index >= 0 && index < customers.size();
    }
}
