package racingcar.view;

import racingcar.entity.Car;

public class OutputView {

    private static final String MOVE_SYMBOL = "-";
    private static final String NAME_SEPARATOR = " : ";
    private static final String RACE_EXECUTE_PROMPT = "실행 결과";

    public void printRaceExecutePrompt() {
        System.out.println(RACE_EXECUTE_PROMPT);
    }

    public void printMoveResult(Car car) {
        System.out.println(car.getName() + NAME_SEPARATOR + MOVE_SYMBOL.repeat(car.getMoveCount()));
    }

}
