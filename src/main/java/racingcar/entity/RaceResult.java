package racingcar.entity;

import java.util.List;

public class RaceResult {

    private List<String> raceLogs;
    private List<Car> winners;
    private List<Car> participants;

    public RaceResult(List<String> raceLogs, List<Car> winners, List<Car> participants) {
        this.raceLogs = raceLogs;
        this.winners = winners;
        this.participants = participants;
    }

    public List<String> getRaceLogs() {
        return raceLogs;
    }

    public List<Car> getWinners() {
        return winners;
    }

    public List<Car> getParticipants() {
        return participants;
    }
}
