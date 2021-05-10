package Übungen.Blackjack;

public class BlackJackDemo {
    public static void main(String[] args) {
        BlackJack players = new BlackJack();
        Player p1 = new Player("Max Mustermann");
        Player p2 = new Player("Susi Sorglos");
        Player p3 = new Player("Heidi Käfer");
        Player p4 = new Player("Heinz Kunz");
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.addCard(p1, 10);
        players.addCard(p1, 9);
        players.addCard(p2, 7);
        players.addCard(p2, 11);
        players.addCard(p2, 4);
        players.addCard(p3, 10);
        players.addCard(p3, 11);
        players.addCard(p4, 5);
        players.addCard(p4, 7);
        players.addCard(p4, 8);

        System.out.println(players);
        System.out.println("Winner is: " + players.getWinner());
    }
}
