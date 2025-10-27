package racingcar.service;

import java.util.List;
import java.util.stream.Collectors;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.entity.Car;
import racingcar.entity.RaceResult;

public class RacingHandlerTest {

    private final RacingHandler racingHandler = new RacingHandler();

    @Test
    @DisplayName("가장 많이 전진한 자동차가 우승한다.")
    public void winMostMovedCar() throws Exception {
        //given
        List<String> names = List.of("pobi", "jun", "woni");
        int count = 5;

        //when
        RaceResult raceResult = racingHandler.executeRace(names, count);

        List<Car> winners = raceResult.getWinners();
        List<Car> participants = raceResult.getParticipants();

        //then
        int maxCount = participants.stream()
                .mapToInt(Car::getMoveCount)
                .max()
                .orElse(0);

        Assertions.assertThat(winners)
                .isNotEmpty()
                .allMatch(car -> car.getMoveCount() == maxCount);

        Assertions.assertThat(participants)
                .extracting(Car::getName)
                .containsAll(winners.stream().map(Car::getName).collect(Collectors.toList()));
    }
}
