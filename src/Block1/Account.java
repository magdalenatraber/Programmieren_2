package Block1;

public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;

    public Account(String owner, String iban, String bic){
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        this.balance = 0.0;
    }
    public void add(double wert){
        this.balance += wert;
    }
    public void deposit(double wert) {
        balance -= wert;
        if (balance < 0.00) {
            System.out.println("Buchung kann nicht durchgeführt werden! Kontostand bleibt gleich!");
            balance += wert;
        }
    }
        public double getBalance(){
             return balance;
        }

    }

