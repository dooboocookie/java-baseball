package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<Number> computerNumbers = new ArrayList<>();

    public Computer () {
        pickNewRandomNumbers();
        System.out.print("computer : ");
        for (int i = 0; i < 3; i++) {
            System.out.print(computerNumbers.get(i).getNumber());
        }
        System.out.println();
    }

    public void pickNewRandomNumbers() {
        computerNumbers.clear();
        for (int index = 0; index < 3; index++) {
            computerNumbers.add(pickNewRandomNumber());
        }
    }

    private Number pickNewRandomNumber() {
        Number newRandomNumber;
        do {
            newRandomNumber = new Number(Randoms.pickNumberInRange(1, 9));
        } while (computerNumbers.contains(newRandomNumber));
        return newRandomNumber;
    }

    public Number findComputerNumber(int index) {
        return computerNumbers.get(index);
    }
}
