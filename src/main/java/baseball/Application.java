package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        Game game = Game.turnOnGame();
        do {
            Computer computer = new Computer();
            game.startNewGame(computer);
        } while (game.replayGame());
    }
}
