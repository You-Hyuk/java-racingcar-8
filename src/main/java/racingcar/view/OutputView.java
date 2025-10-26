package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.entity.Car;

public class OutputView {

    private static final String MOVE_SYMBOL = "-";
    private static final String NAME_SEPARATOR = " : ";
    private static final String WINNER_DELIMITER = ",";
    private static final String RACE_EXECUTE_PROMPT = "실행 결과";
    private static final String RACE_RESULT_PROMPT = "최종 우승자 : ";

    public void printRaceExecutePrompt() {
        System.out.println(RACE_EXECUTE_PROMPT);
    }

    public void printMoveResult(Car car) {
        System.out.println(car.getName() + NAME_SEPARATOR + MOVE_SYMBOL.repeat(car.getMoveCount()));
    }

    public void printRaceWinners(List<Car> cars) {
        String winners = cars.stream()
                .map(Car::getName)
                .collect(Collectors.joining(WINNER_DELIMITER));

        System.out.println(RACE_RESULT_PROMPT + winners);
    }

}
