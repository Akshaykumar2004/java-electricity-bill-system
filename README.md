# Electricity Billing System

This is a simple Java project that simulates an electricity billing system for residential customers. The project includes classes for representing customer details, billing information, charges calculation, subsidy details, and total bill calculation.

## Project Structure

The project follows the following file structure:

                    ElectricityBillingSystem
                    │
                    ├── src
                    │   └── main
                    │       └── java
                    │           ├── Customer.java
                    │           ├── Bill.java
                    │           ├── BillingDetails.java
                    │           ├── SubsidyDetails.java
                    │           ├── TotalBill.java
                    │           └── ElectricityBillingSystem.java
                    │
                    └── README.md


## Object-Oriented Programming (OOP) Concepts Used:

### 1. Encapsulation

- **Customer Class:** Encapsulates customer details like RR Number, Account ID, Name and Address, Tariff, etc.
- **Bill Class:** Encapsulates billing details including the bill period, reading date, bill number, and consumption details.
- **BillingDetails Class:** Encapsulates billing charges calculation, including fixed charges, energy charges, FPPCA charges, and tax.
- **SubsidyDetails Class:** Encapsulates subsidy details, in this case, Gruha Jyothi Subsidy.
- **TotalBill Class:** Encapsulates the calculation of the total bill amount.

### 2. Inheritance

- **BillingDetails and SubsidyDetails:** Both classes can inherit common properties or methods from a common superclass if needed.

### 3. Polymorphism

- **BillingDetails Class:** Uses polymorphism in the `calculateTax` method to handle different types of charges.

### 4. Abstraction

- **Bill Class:** Represents essential details without exposing the internal implementation.

### 5. Composition

- **ElectricityBillingSystem Class:** Composes instances of Customer, Bill, BillingDetails, SubsidyDetails, and TotalBill classes to simulate the billing system.


## Usage

1. Clone the repository:

    ```bash
    git clone Akshaykumar2004/java-electricity-bill-system
    ```

2. Open the project in your preferred Java IDE.

3. Run the `ElectricityBillingSystem` class.

## Project Details

### Customer Class

Represents customer details such as RR Number, Account ID, Name and Address, Tariff, etc.

### Bill Class

Represents billing details including the bill period, reading date, bill number, and consumption details.

### BillingDetails Class

Handles billing charges calculation, including fixed charges, energy charges, FPPCA charges, and tax.

### SubsidyDetails Class

Represents subsidy details, in this case, Gruha Jyothi Subsidy.

### TotalBill Class

Calculates the total bill amount by subtracting Sub-Total-2 from Sub-Total-1.

### ElectricityBillingSystem Class

Main class to run the project. It instantiates objects of other classes, sets values, and displays the details.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.   
