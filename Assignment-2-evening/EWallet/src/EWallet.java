import java.util.Scanner;

class EWallet {
    // Private data members (Encapsulation)
    private String ownerName;
    private String phoneNumber;
    private String pin;
    private double balance;

    // Constructor
    public EWallet(String ownerName, String phoneNumber, String pin, double balance) {
        setOwnerName(ownerName);
        setPhoneNumber(phoneNumber);
        setPin(pin);
        this.balance = balance;
    }

    // Getters
    public String getOwnerName() {
        return ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    // Setters with validation
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() >= 10 && phoneNumber.length() <= 12 && phoneNumber.matches("\\d+")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number! Must be 10�12 digits.");
        }
    }

    public void setPin(String pin) {
        if (pin.length() == 4 && pin.matches("\\d+")) {
            this.pin = pin;
        } else {
            System.out.println("Invalid PIN! Must be exactly 4 digits.");
        }
    }

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Invalid amount! Deposit must be positive.");
        }
    }

    // Cash out method
    public void cashOut(double amount, String enteredPin) {
        if (!enteredPin.equals(pin)) {
            System.out.println("Invalid PIN!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Transaction successful! New balance: " + balance);
        }
    }

    // Send money method
    public void sendMoney(String receiverNumber, double amount, String enteredPin) {
        if (!enteredPin.equals(pin)) {
            System.out.println("Invalid PIN!");
            return;
        }

        if (!receiverNumber.matches("\\d{10,12}")) {
            System.out.println("Invalid receiver phone number!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Amount must be positive!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }

        balance -= amount;
        System.out.println("Transaction successful! Sent " + amount + " to " + receiverNumber);
        System.out.println("New balance: " + balance);
    }

    // Display details method
    public void displayDetails() {
        System.out.println("\n=== WALLET DETAILS ===");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        EWallet wallet = null;
        int choice;

        do {
            System.out.println("\n===== E-WALLET MENU =====");
            System.out.println("1. Create New Wallet");
            System.out.println("2. Deposit Money");
            System.out.println("3. Send Money");
            System.out.println("4. Cash Out");
            System.out.println("5. Display Wallet Details");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter owner name: ");
                    String name = input.nextLine();

                    System.out.print("Enter phone number (10�12 digits): ");
                    String phone = input.nextLine();

                    System.out.print("Set 4-digit PIN: ");
                    String pin = input.nextLine();

                    wallet = new EWallet(name, phone, pin, 0.0);
                    System.out.println("Wallet created successfully!");
                    break;

                case 2:
                    if (wallet == null) {
                        System.out.println("Please create a wallet first!");
                        break;
                    }
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    wallet.deposit(depositAmount);
                    break;

                case 3:
                    if (wallet == null) {
                        System.out.println("Please create a wallet first!");
                        break;
                    }
                    System.out.print("Enter receiver phone number: ");
                    String receiver = input.nextLine();

                    System.out.print("Enter amount to send: ");
                    double sendAmount = input.nextDouble();
                    input.nextLine();

                    System.out.print("Enter PIN: ");
                    String sendPin = input.nextLine();

                    wallet.sendMoney(receiver, sendAmount, sendPin);
                    break;

                case 4:
                    if (wallet == null) {
                        System.out.println("Please create a wallet first!");
                        break;
                    }
                    System.out.print("Enter amount to cash out: ");
                    double cashAmount = input.nextDouble();
                    input.nextLine();

                    System.out.print("Enter PIN: ");
                    String cashPin = input.nextLine();

                    wallet.cashOut(cashAmount, cashPin);
                    break;

                case 5:
                    if (wallet == null) {
                        System.out.println("Please create a wallet first!");
                        break;
                    }
                    wallet.displayDetails();
                    break;

                case 6:
                    System.out.println("Exiting program... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        input.close();
    }
}
