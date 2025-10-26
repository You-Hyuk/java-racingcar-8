package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import racingcar.entity.Car;

public class RacingHandler {

    private final int MIN_BOUND = 0;
    private final int MAX_BOUND = 9;
    private final int MIN_PASS_VALUE = 4;

    private void race(List<Car> cars) {
        for (Car car : cars) {
            moveCar(car);
        }
    }

    private void moveCar(Car car) {
        if (Randoms.pickNumberInRange(MIN_BOUND, MAX_BOUND) >= MIN_PASS_VALUE) {
            car.increaseMoveCount();
        }
    }
}
