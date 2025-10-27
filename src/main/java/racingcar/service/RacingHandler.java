package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.entity.Car;
import racingcar.entity.Cars;
import racingcar.entity.RaceResult;
import racingcar.view.OutputView;

public class RacingHandler {

    private static final int MIN_BOUND = 0;
    private static final int MAX_BOUND = 9;
    private static final int MIN_PASS_VALUE = 4;
    private static final String NAME_SEPARATOR = " : ";
    private static final String MOVE_SYMBOL = "-";
    
    public RaceResult executeRace(List<String> nameList, int count) {
        List<String> raceLogs = new ArrayList<>();
        Cars participants = new Cars(
                nameList.stream()
                        .map(name -> new Car(name, 0))
                        .collect(Collectors.toList())
        );

        for (int round = 0; round < count; round++) {
            List<Integer> randomValues = generateRandomValue(participants.size());
            participants.race(randomValues, MIN_PASS_VALUE);
            raceLogs.add(participants.reportCurrentPositions(NAME_SEPARATOR, MOVE_SYMBOL));
        }

        Cars winners = participants.findWinners();
        return new RaceResult(raceLogs, winners, participants);
    }

    private List<Integer> generateRandomValue(int size) {
        List<Integer> randomValues = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomValues.add(Randoms.pickNumberInRange(MIN_BOUND, MAX_BOUND));
        }
        return randomValues;
    }
}
