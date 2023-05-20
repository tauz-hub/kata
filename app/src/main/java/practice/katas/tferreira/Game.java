package practice.katas.tferreira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
    private final List<String> availableCards = new ArrayList<>(
            Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"));

    public String winner(String[] deckSteve, String[] deckJosh) {
        Player steve = new Player("Steve", 0, deckSteve);
        Player josh = new Player("Josh", 0, deckJosh);

        return play(steve, josh);
    }

    private String play(Player playerOne, Player playerTwo) {
        generateResult(playerOne, playerTwo);
        if (playerOne.getPoints() > playerTwo.getPoints()) {
            return textWinner(playerOne, playerTwo);
        } else if (playerTwo.getPoints() > playerOne.getPoints()) {
            return textWinner(playerTwo, playerOne);
        }
        return "Tie";
    }

    private String textWinner(Player winner, Player looser) {
        return winner.getName() + " wins " + winner.getPoints() + " to " + looser.getPoints();
    }

    private void generateResult(Player playerOne, Player playerTwo) {
        List<Integer> playerOneIndexedDeck = reIndexDeck(playerOne);
        List<Integer> playerTwoIndexedDeck = reIndexDeck(playerTwo);

        for (int i = 0; i < Math.max(playerOneIndexedDeck.size(), playerTwoIndexedDeck.size()); i++) {
            if (playerOneIndexedDeck.get(i) > playerTwoIndexedDeck.get(i)) {
                playerOne.addPoint();
            } else if (playerOneIndexedDeck.get(i) < playerTwoIndexedDeck.get(i)) {
                playerTwo.addPoint();
            }
        }
    }

    private List<Integer> reIndexDeck(Player player) {
        List<Integer> result = new ArrayList<>();
        for (String card : player.getDeck()) {
            result.add(availableCards.indexOf(card));
        }
        return result;
    }
}

class Player {
    final private String name;
    private Integer points;
    final private List<String> deck;

    public Player(String name, Integer points, String[] deck) {
        this.name = name;
        this.points = points;
        this.deck = new ArrayList<>(Arrays.asList(deck));
    }

    public String getName() {
        return name;
    }

    public Integer getPoints() {
        return points;
    }

    public void addPoint() {
        this.points++;
    }

    public List<String> getDeck() {
        return deck;
    }
}