package racingcar.entity;

public class Car {

    private String name;
    private int moveCount;

    public Car(String name, int moveCount) {
        this.name = name;
        this.moveCount = moveCount;
    }

    public void increaseMoveCount() {
        this.moveCount++;
    }

}
