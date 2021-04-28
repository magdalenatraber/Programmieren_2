package Block1;

public class Bank {
    public static void main(String[] args) {
        Account bert = new Account("Bert Müller", "02345", "BAWAT");
        Account steph = new Account("Steph Meyer", "01111", "EASY");
        Account simi = new Account("Simone Fels", "02545", "78566");

        bert.add(47);
        bert.deposit(48);
        System.out.println("Kontostand Bert =" +bert.getBalance());
        System.out.println();
        System.out.println(steph.getBalance());
        System.out.println(simi.getBalance());
        simi.add(100);

        Account[] accounts = {bert, steph, simi};

        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].getBalance());
            System.out.println();

        }


    }
}
