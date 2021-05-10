package Übungen.Blackjack;

import java.util.HashMap;

public class BlackJack {
    private final HashMap<Player, Integer> players;


    BlackJack() {
        players = new HashMap<>();
    }

    boolean add(Player player) {
        if (players.containsKey(player)) {
            return false;
        } else
            players.put(player, 0);
        return true;
    }

    boolean addCard(Player player, Integer cardValue) {
        if (add(player) == false) {
            players.put(player, players.get(player) + cardValue);
            return true;
        } else
            return false;
    }

    Integer getValue(Player player) {
        if (players.containsKey(player))
            return players.get(player);
        else
            return null;
    }

    Player getWinner() {
        Player winner = null;
        Integer counter = 0;
        for (Player player : players.keySet()) {
            if (players.get(player) > counter && players.get(player) <= 21)
                winner = player;
            counter = players.get(winner);
        }
        return winner;
    }

    @Override
    public String toString() {
        return "BlackJack{" +
                "players=" + players +
                '}';
    }
}
