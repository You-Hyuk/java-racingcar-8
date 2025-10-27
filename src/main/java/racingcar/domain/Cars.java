package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
    }

    public int size() {
        return cars.size();
    }

    public Cars getCars() {
        return new Cars(
                cars.stream()
                        .map(car -> new Car(car.getName(), car.getMoveCount()))
                        .collect(Collectors.toUnmodifiableList())
        );
    }

    public void race(List<Integer> randomValues, int minPassValue) {
        for (int index = 0; index < randomValues.size(); index++) {
            cars.get(index)
                    .move(randomValues.get(index), minPassValue);
        }
    }

    public String reportCurrentPositions(String nameSeparator, String moveSymbol) {
        return cars.stream()
                .map(car -> car.reportCurrentPosition(nameSeparator, moveSymbol))
                .collect(Collectors.joining("\n"));
    }

    public Cars findWinners() {
        int maxMoveCount = cars.stream()
                .mapToInt(Car::getMoveCount)
                .max()
                .orElse(0);

        List<Car> winner = cars.stream()
                .filter(car -> car.isWinner(maxMoveCount))
                .collect(Collectors.toList());

        return new Cars(winner);
    }

    public String joinNames(String delimiter) {
        return cars.stream()
                .map(Car::getName)
                .collect(Collectors.joining(delimiter));
    }
}
