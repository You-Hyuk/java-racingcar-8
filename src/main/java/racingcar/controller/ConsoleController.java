package racingcar.controller;

import java.util.List;
import racingcar.entity.RaceResult;
import racingcar.service.InputHandler;
import racingcar.service.RacingHandler;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class ConsoleController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final InputHandler inputHandler = new InputHandler();
    private final RacingHandler racingHandler = new RacingHandler();

    public void executeConsole() {
        String names = inputView.printNamePrompt();
        int count = inputHandler.validateNumberFormat(inputView.printCountPrompt());
        List<String> nameList = inputHandler.parseName(names);
        outputView.printRaceExecutePrompt();
        RaceResult raceResult = racingHandler.executeRace(nameList, count);
        outputView.printRaceLogs(raceResult.getRaceLogs());
        outputView.printRaceWinners(raceResult.getWinners());
    }

}
