import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }

    public void displayAllAccounts() {
        System.out.println("=== Daftar Akun Bank ===");
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            System.out.println("[" + i + "] " + acc.getName() + " - Saldo: Rp " + acc.getBalance());
        }
    }

    public int getTotalAccounts() {
        return accounts.size();
    }
}