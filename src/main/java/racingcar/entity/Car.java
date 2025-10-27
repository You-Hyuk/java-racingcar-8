package racingcar.entity;

public class Car {

    private String name;
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

    public void move() {
        this.moveCount++;
    }

    public String reportCurrentPosition(String nameSeparator, String moveSymbol) {
        return this.name + nameSeparator + moveSymbol.repeat(this.moveCount);
    }

}
