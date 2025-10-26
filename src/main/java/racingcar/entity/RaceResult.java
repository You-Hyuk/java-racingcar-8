package racingcar.entity;

import java.util.List;

public class RaceResult {

    private List<String> raceLogs;
    private List<Car> winners;

    public RaceResult(List<String> raceLogs, List<Car> winners) {
        this.raceLogs = raceLogs;
        this.winners = winners;
    }

    public List<String> getRaceLogs() {
        return raceLogs;
    }

    public List<Car> getWinners() {
        return winners;
    }
}
