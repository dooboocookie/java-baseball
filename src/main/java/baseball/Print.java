package baseball;

import java.util.HashMap;

public class Print {

    private static final String ROUND_START_MESSAGE = "숫자를 입력해주세요 : ";

    private static final String ROUND_RESULT_STRIKE_MESSAGE = "스트라이크 ";
    private static final String ROUND_RESULT_BALL_MESSAGE = "볼 ";
    private static final String ROUND_RESULT_NOTHING_MESSAGE = "낫싱";

    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";

    public static void printRoundStart() {
        System.out.print(ROUND_START_MESSAGE);
    }

    public static void printRoundResult(HashMap<Hint, Integer> hintCountMap) {
        if (hintCountMap.containsKey(Hint.BALL)) {
            System.out.print(hintCountMap.get(Hint.BALL) + ROUND_RESULT_BALL_MESSAGE);
        }
        if (hintCountMap.containsKey(Hint.STRIKE)) {
            System.out.print(hintCountMap.get(Hint.STRIKE) + ROUND_RESULT_STRIKE_MESSAGE);
        }
        if (hintCountMap.getOrDefault(Hint.NOTHING, 0) == 3) {
            System.out.print(ROUND_RESULT_NOTHING_MESSAGE);
        }
        System.out.println();
    }

    public static void printGameStart(){
        System.out.println(GAME_START_MESSAGE);
    }
}
