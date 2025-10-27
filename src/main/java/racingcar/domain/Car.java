package racingcar.domain;

public class Car {

    private final String name;
    private int moveCount;

    public Car(String name, int moveCount) {
        this.name = name;
        this.moveCount = moveCount;
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void move(int randomValue, int minPassValue) {
        if (randomValue >= minPassValue) {
            this.moveCount++;
        }
    }

    public String reportCurrentPosition(String nameSeparator, String moveSymbol) {
        return this.name + nameSeparator + moveSymbol.repeat(this.moveCount);
    }

    public boolean isWinner(int maxMoveCount) {
        return this.moveCount == maxMoveCount;
    }
}
