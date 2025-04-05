class Bank {
    void checkBalance(int accNumber) {
        System.out.println("Checking balance for Account: " + accNumber);
    }

    void checkBalance(int accNumber, int pin) {
        System.out.println("Checking balance for Account: " + accNumber + " with PIN verification.");
    }

    void checkBalance(int accNumber, int pin, int otp) {
        System.out.println("Checking balance for Account: " + accNumber + " with PIN and OTP verification.");
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.checkBalance(123456);
        bank.checkBalance(123456, 1234);
        bank.checkBalance(123456, 1234, 567890);
    }
}
