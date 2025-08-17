package Task2;

import java.util.concurrent.atomic.AtomicLong;

public abstract class Account {
    private static final AtomicLong COUNTER = new AtomicLong(1000);
    private final long accNum;
    protected double balance;
    private Person accHolder;

   
    public static final double MIN_REQUIRED_BALANCE = 500.0;

    public Account(Person holder, double initialBalance) {
        if (initialBalance < MIN_REQUIRED_BALANCE) {
            throw new IllegalArgumentException("Initial balance must be at least INR " + MIN_REQUIRED_BALANCE);
        }
        this.accNum = COUNTER.getAndIncrement();
        this.accHolder = holder;
        this.balance = initialBalance;
    }

    public long getAccNum() { return accNum; }
    public double getBalance() { return balance; }
    public Person getAccHolder() { return accHolder; }
    public void setAccHolder(Person p) { this.accHolder = p; }

    public void deposit(double amt) {
        if (amt <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amt;
    }

    
    public abstract boolean withdraw(double amount);

    @Override
    public String toString() {
        return "Account[" + accNum + "] Holder=" + accHolder + ", Balance=INR " + String.format("%.2f", balance);
    }
}

/* SavingsAccount and CurrentAccount in same file for brevity */
class SavingsAccount extends Account {
    public static final double MINIMUM_BALANCE = 500.0; // final as requested

    public SavingsAccount(Person holder, double initialBalance) {
        super(holder, initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        double newBal = balance - amount;
        if (newBal >= MINIMUM_BALANCE) {
            balance = newBal;
            return true;
        } else {
            System.out.println("Withdrawal denied: savings must keep min INR " + MINIMUM_BALANCE);
            return false;
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(Person holder, double initialBalance, double overdraftLimit) {
        super(holder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() { return overdraftLimit; }
    public void setOverdraftLimit(double overdraftLimit) { this.overdraftLimit = overdraftLimit; }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) return false;
        double newBal = balance - amount;
        if (newBal >= -overdraftLimit) {
            balance = newBal;
            return true;
        } else {
            System.out.println("Withdrawal denied: overdraft limit reached.");
            return false;
        }
    }
}
