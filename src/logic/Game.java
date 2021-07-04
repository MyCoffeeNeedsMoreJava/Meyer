package logic;

import java.util.*;

import logic.Dice;
import player.Player;

import static player.Player.*;

public class Game {

    private int hit;
    private Player player;
    private Player inTurn;

    public void main() {
        inTurn = PLAYER_BLUE;

    }

    public Player playerInTurn() {
        return player;
    }

    public void endTurn() {
        nextPlayer();
    }

    //Method to find player for next turn
    public Player nextPlayer() {
        switch (inTurn) {
            case PLAYER_BLUE:
                inTurn = PLAYER_RED;
                break;
            case PLAYER_RED:
                inTurn = PLAYER_BLACK;
                break;
            case PLAYER_BLACK:
                inTurn = PLAYER_GREEN;
                break;
            case PLAYER_GREEN:
                inTurn = PLAYER_ORANGE;
                break;
            case PLAYER_ORANGE:
                inTurn = PLAYER_YELLOW;
                break;
            case PLAYER_YELLOW:
                inTurn = PLAYER_BLUE;
                break;
        }
        return inTurn;
    }
}
