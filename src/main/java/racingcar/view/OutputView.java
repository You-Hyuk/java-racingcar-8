package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.entity.Car;

public class OutputView {

    private static final String WINNER_DELIMITER = ",";
    private static final String RACE_EXECUTE_PROMPT = "실행 결과";
    private static final String RACE_RESULT_PROMPT = "최종 우승자 : ";

    public void printRaceExecutePrompt() {
        System.out.println(RACE_EXECUTE_PROMPT);
    }

    public void printRaceLogs(List<String> raceLogs) {
        for (String raceLog : raceLogs) {
            System.out.println(raceLog);
            System.out.println();
        }
    }

    public void printRaceWinners(List<Car> cars) {
        String winners = cars.stream()
                .map(Car::getName)
                .collect(Collectors.joining(WINNER_DELIMITER));

        System.out.println(RACE_RESULT_PROMPT + winners);
    }

}
