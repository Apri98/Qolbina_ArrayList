public class BankDemo {

    public static void main(String[] args) {
        // Membuat objek Bank
        Bank bank = new Bank();

        System.out.println("Welcome to Bank ABC");

        bank.addAccount(new Account("Budi", 100000));
        bank.addAccount(new Account("Siti", 250000));
        bank.addAccount(new Account("Andi", 500000));

        bank.displayAllAccounts();

        System.out.println("\n--- Transaksi Akun Budi ---");
        Account budiAcc = bank.getAccount(0);
        if (budiAcc != null) {
            System.out.println("Deposit Rp 500.000 ke akun Budi");
            budiAcc.deposit(500000);
            System.out.println("Saldo terbaru Budi: Rp " + budiAcc.getBalance());

            System.out.println("Withdraw Rp 150.000 dari akun Budi");
            budiAcc.withdraw(150000);
            System.out.println("Saldo terbaru Budi: Rp " + budiAcc.getBalance());
        }

        System.out.println();
        bank.displayAllAccounts();
    }
}