package racingcar.entity;

import java.util.List;

public class RaceResult {

    private final List<String> raceLogs;
    private final Cars winners;
    private final Cars participants;

    public RaceResult(List<String> raceLogs, Cars winners, Cars participants) {
        this.raceLogs = raceLogs;
        this.winners = winners.getCars();
        this.participants = participants.getCars();
    }

    public List<String> getRaceLogs() {
        return raceLogs;
    }

    public Cars getWinners() {
        return winners;
    }

    public Cars getParticipants() {
        return participants;
    }
}
